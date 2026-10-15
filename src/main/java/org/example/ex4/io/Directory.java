package org.example.ex4.io;

import java.io.File;
import java.util.Arrays;

public class Directory {
    public boolean isADir(String file) {
        File file1 = new File(file);
        if (file1.isDirectory()) {
            Arrays.stream(file1.listFiles()).forEach(System.out::println);
        }
        return file1.isDirectory();
    }
}
