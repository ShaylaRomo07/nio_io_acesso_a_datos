package org.example.ex1.io;

import java.io.File;

public class ExistsFile {
    public boolean exists(String file) {
        if (file != null) {
            File file1 = new File(file);
            return file1.exists();
        }
        return false;
    }
    //ejercicio2

    public boolean estaEn(String dir, String file) {
        if (dir != null) {
            if (file != null) {
                File file1 = new File(dir + "/" + file);
                return file1.exists();
            }
        }
        return false;
    }
}
