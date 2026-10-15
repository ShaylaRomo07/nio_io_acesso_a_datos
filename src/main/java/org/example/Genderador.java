package org.example;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Genderador {
    public void create() throws IOException {
        //        File file1 = new File("/tmp/acceso");
//        file1.mkdir();
//        file1 = new File("/tmp/acceso/introducion.txt");
//        file1.createNewFile();
//
//        File file2 = new File("/tmp/otro");
//        file2.mkdir();
//        file2 = new File("/tmp/otro/ejemplo.txt");
//        file2.createNewFile();
       // Path path1 = Paths.get("acceso");
    //    Files.createDirectories(path1);
      //  path1 = Path.of("acceso/introduccion.txt");
      //  Files.createFile(path1);

//        Path path2 = Path.of("otro");
//        Files.createDirectories(path2);
//        path2 = Path.of("otro/ejemplo.txt");
//        Files.createFile(path2);
    }

    public void view() {
        File file = new File("/tmp/acceso/introducion.txt");
        System.out.println(file.getAbsoluteFile());
        file = new File("/tmp/otro/ejemplo.txt");
        System.out.println(file.getAbsoluteFile());

        Path path= Path.of("introduccion.txt");
        System.out.println(path.toAbsolutePath());
        path= Path.of("otro/ejemplo.txt");
        System.out.println(path.toAbsolutePath());

    }
}
