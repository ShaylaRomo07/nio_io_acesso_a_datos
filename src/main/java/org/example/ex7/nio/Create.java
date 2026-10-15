package org.example.ex7.nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Create {
    public void create(String file) throws IOException {
        if (file != null) {
            Path path = Path.of(file);
            if (!Files.exists(path)) {
                Path path2 = path.toAbsolutePath().getParent();
                if (!Files.exists(path2)) {
                    Files.createDirectories(path2);
                    System.out.println("Se han creado directorios necesarios");
                }
                Files.createFile(path);
                System.out.println("Se han creado el fichero");
            } else {
                System.out.println("Ya existe");
            }
        }
    }
}

