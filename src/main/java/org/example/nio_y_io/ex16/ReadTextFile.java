package org.example.nio_y_io.ex16;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class ReadTextFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime la ruta");
        //String ruta = scanner.nextLine();
        String ruta = "datos/mensaje.txt";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(ruta));) {
            String contenido = bufferedReader.readLine();
            System.out.println(contenido);
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (Exception e) {
            System.out.println("Error de E/S");
        }

    }
}
