package org.example.acceso_aleatorio.exercices;

import java.io.*;
import java.util.Scanner;

public class Ex2 {
    private final Scanner scanner;

    public Ex2(Scanner scanner) {
        this.scanner = scanner;
    }

    public void modifySalary() {
        System.out.println("Introduce ID del empleado:");
        int id1 = scanner.nextInt();
        System.out.println("Introduce el importe añadido:");
        double importe = scanner.nextInt();

        File file = new File("aleatorio/AleatorioEmple.dat");
        int departamento;
        char apellido[] = new char[10];
        char letra;
        double salario;
        double salarioNew;
        double salarioOld;
        try (
                RandomAccessFile raf = new RandomAccessFile(file, "rws");

        ) {
            raf.seek(36 * (id1 - 1));
            int id2 = raf.readInt();
            for (int i = 0; i < apellido.length; i++) {
                letra = raf.readChar();
                apellido[i] = letra;
            }
            String apellidos = new String(apellido);
            departamento = raf.readInt();
            salarioOld = raf.readDouble();
            salarioNew = salarioOld + importe;
            raf.writeDouble(salarioNew);
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
