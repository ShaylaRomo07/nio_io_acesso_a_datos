package org.example.acceso_aleatorio.exercices;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ex1 ex1 = new Ex1(scanner);
        ex1.findEmployee();
    }
}
