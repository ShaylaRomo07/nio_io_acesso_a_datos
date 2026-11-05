package org.example.acceso_aleatorio.exercices;

import java.util.Scanner;

public class Ex2 {
    private final Scanner scanner;

    public Ex2(Scanner scanner) {
        this.scanner = scanner;
    }

    public void modifySalary() {
        System.out.println("Introduce ID del empleado:");
        int id1 = scanner.nextInt();
        System.out.println("Introduce ID del empleado:");
        double importe = scanner.nextInt();

    }
}
