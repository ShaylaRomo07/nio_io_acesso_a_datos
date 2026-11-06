package org.example.acceso_aleatorio.exercices.nio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Path;
import java.util.Scanner;

public class Ex2 {
    private final Scanner scanner;

    public Ex2(Scanner scanner) {
        this.scanner = scanner;
    }

    public void modifySalary() {
        System.out.println("Introduce ID del empleado:");
        int id1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduce el importe añadido:");
        double importe = scanner.nextDouble();
        scanner.nextLine();

        Path path = Path.of("aleatorio/AleatorioEmple.dat");
        int departamento;
        char[] apellido = new char[10];
        char letra;
        double salario;
        double salarioNew;
        double salarioOld;
        long pos = 0;
        try (
                RandomAccessFile raf = new RandomAccessFile(path.toFile(), "rw");

        ) {
            raf.seek(36 * (id1 - 1));
            int id2 = raf.readInt();
            for (int i = 0; i < apellido.length; i++) {
                letra = raf.readChar();
                apellido[i] = letra;
            }
            String apellidos = new String(apellido);
            departamento = raf.readInt();
            pos = raf.getFilePointer();
            salarioOld = raf.readDouble();
            salarioNew = salarioOld + importe;
            raf.seek(pos);
            raf.writeDouble(salarioNew);
            raf.seek(pos);
            salario = raf.readDouble();

            if (id1 == id2) {
                System.out.printf(
                        "ID: %s, Apellidos: %s, Departamento: %d, Salario anterior: %.2f %n, Salario actual: %.2f %n",
                        id2, apellidos.trim(), departamento, salarioOld, salario
                );
            }
            raf.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el fichero");
        } catch (IOException e) {
            System.out.println("No existe el empledo");
        }
    }
}
