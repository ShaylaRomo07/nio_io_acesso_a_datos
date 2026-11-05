package org.example.acceso_aleatorio.nose;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Write {
    public void write() throws IOException {
        File file = new File("aleatorio/AleatorioEmple.dat");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        String apellidos[] = {"Fernandez", "Gil", "Lopez", "Ramos", "Sevilla", "Castilla", "Rey"};
        int departamentos[] = {10, 20, 10, 10, 30, 30, 20};
        double salarios[] = {1000.45, 2400.60, 3000.00, 1500.56, 2200.0, 1435.87, 2000.0};

        StringBuffer buffer = null;
        int n = apellidos.length;

        for (int i = 0; i < n; i++) {
            randomAccessFile.writeInt(i + 1);
            buffer = new StringBuffer(apellidos[i]);
            buffer.setLength(10);
            randomAccessFile.writeChars(buffer.toString());
            randomAccessFile.writeInt(departamentos[i]);
            randomAccessFile.writeDouble(salarios[i]);
        }
        randomAccessFile.close();
    }
}
