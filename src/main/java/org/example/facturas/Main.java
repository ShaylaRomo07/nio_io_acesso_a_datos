package org.example.facturas;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        GeneradorFacturas generadorFacturas=new GeneradorFacturas(scanner);
        generadorFacturas.start();
    }
}
