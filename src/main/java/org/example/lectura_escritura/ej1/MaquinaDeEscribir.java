package org.example.lectura_escritura.ej1;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class MaquinaDeEscribir implements Serializable {
    public void run(String[] palabras, String nameFile) {
        File file = new File(nameFile);

//        if (!file1.exists()) {
//            File file2 = new File(file1.getParent());
//            if (!file2.exists()) {
//                boolean dirs = file2.mkdirs();
//                System.out.println(dirs ? "Se han creado directorios necesarios" : "");
//            }
//            boolean si = file1.createNewFile();
//            if (si) {
//                System.out.println("Creado con exito");
//            } else {
//                System.out.println("Error");
//            }
//        }
        try (
                FileOutputStream fos = new FileOutputStream(file, false);
                OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
                PrintWriter pw = new PrintWriter(osw)
        ) {
            for (String palabra : palabras) {
                if (!file.exists()) {
                    if (!file.getParentFile().exists()) {
                        boolean dirs = file.getParentFile().mkdirs();
                        System.out.println(dirs ? "Se han creado directorios necesarios" : "");
                    }
                    boolean si = file.createNewFile();
                    if (si) {
                        System.out.println("Creado con exito");
                    } else {
                        System.out.println("Error");
                    }
                }
                pw.print(palabra + "*");
                System.out.println("Se ha guardado");
            }
        } catch (IOException e) {
            System.out.println("Error");
        }

    }
}