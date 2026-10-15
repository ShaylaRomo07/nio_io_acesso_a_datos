package org.example.ex4.nio;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Directory directory =new Directory();
        try {
            directory.isADir("otro");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
