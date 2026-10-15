package org.example.ex5.io;


import java.io.File;

public class Information {
    public void show_information(String file) {
        if (file != null) {
            File file1 = new File(file);
            if (file1.exists()) {
                System.out.println(file1.getName());
                System.out.println(file1.getAbsolutePath());
                System.out.println((file1.canRead())?"Si se puede leer":"No se puede leer");
                System.out.println(file1.length());
                System.out.println((file1.isDirectory())?"Es un directorio":"Es un fichero");
            }
        }

    }
}
