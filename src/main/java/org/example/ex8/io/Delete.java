package org.example.ex8.io;

import java.io.File;
import java.util.Arrays;

public class Delete {
    public void delete(String file) {
        if (file != null) {
            File file1 = new File(file);
            if (file1.exists()) {
                boolean si = file1.delete();
                if (si) {
                    System.out.println("Borrado con exito" + file1.getAbsolutePath());
                } else {
                    for (File file2 : file1.listFiles()) {
                        delete(file2.getAbsolutePath());

                    }
                    file1.delete();
                    System.out.println("Borrado con exito" + file1.getAbsolutePath());
                }
            } else {
                System.out.println("No existe");
            }
        }
    }
}
