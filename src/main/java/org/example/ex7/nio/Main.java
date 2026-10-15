package org.example.ex7.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        Create create = new Create();
        create.create("otro/a/b/a.txt");
    }
}
