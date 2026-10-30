package org.example.lectura_escritura.ej1;

import org.example.nio_y_io.ex16.ReadTextFile;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class MaquinaDeLeer {
    public void run(String ruta) {
        File file = new File(ruta);
        if (!file.exists()) {
            System.out.println("No existe el fichero o no esta en esa ruta");
        } else {
            try (
                    FileInputStream fis = new FileInputStream(file);
                    InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
                    BufferedReader br = new BufferedReader(isr)
            ) {
                String cadenas = br.readLine();
                while (!cadenas.isEmpty()) {
                    System.out.println(cadenas.substring(0, cadenas.indexOf("*")));
                    cadenas=cadenas.substring(cadenas.indexOf("*")+1,cadenas.length());
                }

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
