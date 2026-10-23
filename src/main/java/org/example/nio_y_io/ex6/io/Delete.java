package org.example.nio_y_io.ex6.io;

import java.io.File;

public class Delete {
    public void delete(String file) {
        if (file != null) {
            File file1 = new File(file);
            //if (file1.exists()) {
                boolean si = file1.delete();
                if (si){
                    System.out.println("Borrado con exito");
                }else {
                    System.out.println("Error");
                }
           // } else {
           //     System.out.println("No existe");
           // }
        }
    }
}
