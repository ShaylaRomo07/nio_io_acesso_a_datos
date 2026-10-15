package org.example.ex1.nio;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class ExistsFile {
    public boolean exists(String file) {
        if (file != null) {
            Path file1 = Path.of(file);
            return Files.exists(file1);
        }
        return false;
    }
    //ejercicio3

    public boolean estaEn(String dir, String file) {
        if (dir != null) {
            if (file != null) {
                Path file1 = Path.of(dir + "/" + file);
                return Files.exists(file1);
            }
        }
        return false;
    }
}
