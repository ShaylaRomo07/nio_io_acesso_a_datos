package org.example.ex6.nio;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Delete delete=new Delete();
        delete.delete("otro/ejemplo.txt");
    }
}
