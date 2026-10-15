package org.example.ex7.io;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Create create = new Create();
        create.create("otro/a/b/a.txt");
    }
}
