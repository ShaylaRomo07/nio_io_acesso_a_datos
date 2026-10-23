package org.example.nio_y_io.ex4.nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class Directory {
    public boolean isADir(String file) throws IOException {
        Path path = Path.of(file);
        if (Files.isDirectory(path)) {
            Files.list(path).forEach(text -> System.out.println(text.toAbsolutePath()));
            //Files.lines(path).forEach(System.out::println);
        }
        return Files.isDirectory(path);
    }
}
