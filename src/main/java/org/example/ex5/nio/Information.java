package org.example.ex5.nio;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Information {
    public void show_information(String file) throws IOException {
        if (file != null) {
            Path path = Path.of(file);
            if (Files.exists(path)) {
                System.out.println(path.getFileName());
                System.out.println(path.toAbsolutePath());
                System.out.println((Files.isReadable(path)) ? "Si se puede leer" : "No se puede leer");
                System.out.println(Files.size(path));
                System.out.println((Files.isDirectory(path)) ? "Es un directorio" : "Es un fichero");
            }
        }

    }
}
