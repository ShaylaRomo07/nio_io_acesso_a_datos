package org.example.nio_y_io.ex5.nio;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Information information=new Information();
        information.show_information("/tmp");
    }
}
