package org.example.ex4.io;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Directory directory =new Directory();

        directory.isADir("/tmp");
    }
}
