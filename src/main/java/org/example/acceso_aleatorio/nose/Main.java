package org.example.acceso_aleatorio.nose;


import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Write write = new Write();
        Read read = new Read();
        write.write();
        read.read();
    }
}
