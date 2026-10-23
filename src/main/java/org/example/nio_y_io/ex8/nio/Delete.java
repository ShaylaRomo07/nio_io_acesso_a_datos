package org.example.nio_y_io.ex8.nio;

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
                    System.out.println("Borrado con exito" + path.toAbsolutePath());
                } else {
                    // Files.list(path).forEach();
                    Files.list(path).forEach(text -> {
                        try {
                            delete(text.toAbsolutePath().toString());
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });

                }
            } else {
                System.out.println("No existe");
            }
        }
    }
}

