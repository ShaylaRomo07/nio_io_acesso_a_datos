package org.example.ex6.nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Delete {
    public void delete(String file) throws IOException {
        if (file != null) {
            Path path = Path.of(file);
            if (Files.exists(path)) {
                boolean si = Files.deleteIfExists(path);
                if (si) {
                    System.out.println("Borrado con exito");
                } else {
                    System.out.println("Error");
                }
            } else {
                System.out.println("No existe");
            }
        }
    }
}
