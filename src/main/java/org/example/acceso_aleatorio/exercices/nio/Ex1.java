package org.example.acceso_aleatorio.exercices.nio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Path;
import java.util.Scanner;

public class Ex1 {
    public final Scanner scanner;

    public Ex1(Scanner scanner) {
        this.scanner = scanner;
    }

    public void findEmployee() {
        System.out.println("Introduce ID del empleado:");
        int id1 = scanner.nextInt();
        Path path = Path.of("aleatorio/AleatorioEmple.dat");
        int departamento;
        double salario;
        char apellido[] = new char[10];
        char letra;
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
            salario = raf.readDouble();
            if (id1 == id2) {
                System.out.printf(
                        "ID: %s, Apellidos: %s, Departamento: %d, Salario: %.2f %n",
                        id2, apellidos.trim(), departamento, salario
                );
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
