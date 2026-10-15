package org.example.pruebas;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Prueba {
    public static void main(String[] args) {
        Path path = Path.of("datos/mensaje.txt");
        try {
            String contenido = Files.readString(path, StandardCharsets.UTF_8);
            System.out.println("===Contenido===");
            System.out.println(contenido);
        } catch (IOException e) {
            System.err.println("Error al leer: " + e.getMessage());
        }
    }
}
