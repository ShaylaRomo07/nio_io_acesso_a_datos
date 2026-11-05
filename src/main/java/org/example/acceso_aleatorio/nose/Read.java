package org.example.acceso_aleatorio.nose;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Read {
    public void read() throws IOException {
        File file = new File("aleatorio/AleatorioEmple.dat");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");

        int id, departamento;
        double salario;
        char apellido[] = new char[10];
        char letra;
        int posicion = 0;

        while (randomAccessFile.getFilePointer() < randomAccessFile.length()) {
            randomAccessFile.seek(posicion);
            id = randomAccessFile.readInt();

            for (int i = 0; i < apellido.length; i++) {
                letra = randomAccessFile.readChar();
                apellido[i] = letra;
            }
            String apellidos = new String(apellido);
            departamento = randomAccessFile.readInt();
            salario = randomAccessFile.readDouble();
            if (id > 0) {
                System.out.printf(
                        "ID: %s, Apellidos: %s, Departamento: %d, Salario: %.2f %n",
                        id, apellidos.trim(), departamento, salario
                );
            }
            posicion = posicion + 36;
        }
        randomAccessFile.close();
    }
}
