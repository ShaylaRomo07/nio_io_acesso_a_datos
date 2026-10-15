package org.example.ex7.io;

import java.io.File;
import java.io.IOException;

public class Create {
    public void create(String file) throws IOException {
        if (file != null) {
            File file1 = new File(file);
            if (!file1.exists()) {
                File file2 = new File(file1.getParent());
                if (!file2.exists()) {
                    boolean dirs = file2.mkdirs();
                    System.out.println(dirs ? "Se han creado directorios necesarios" : "");
                }
                boolean si = file1.createNewFile();
                if (si) {
                    System.out.println("Creado con exito");
                } else {
                    System.out.println("Error");
                }
            }
        } else {
            System.out.println("Ya existe");
        }
    }
}

