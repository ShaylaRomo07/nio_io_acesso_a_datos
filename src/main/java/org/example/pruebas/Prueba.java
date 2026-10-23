package org.example.pruebas;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Prueba {
    public static void main(String[] args) {
        Path path = Path.of("datos/mensaje.txt");
        try {
            //String contenido = Files.readString(path, StandardCharsets.UTF_8);
            List<String> lineas = Files.readAllLines(path, StandardCharsets.UTF_8);
            System.out.println("===Contenido===");
            System.out.println("Total lineas=" + lineas.size());
            for (int i = 0; i < lineas.size(); i++) {
                System.out.println("Linea " + (i + 1) + ": " + lineas.get(i));
            }
        } catch (IOException e) {
            System.err.println("Error al leer: " + e.getMessage());
        }

    }
}
