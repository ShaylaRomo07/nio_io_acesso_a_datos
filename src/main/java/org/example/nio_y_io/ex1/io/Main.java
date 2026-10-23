package org.example.nio_y_io.ex1.io;

public class Main {
    public static void main(String[] args) {
        ExistsFile existsFile = new ExistsFile();
        System.out.println(existsFile.exists("introduccion.txt"));
        System.out.println(existsFile.estaEn("acceso","introduccion.txt"));
    }
}
