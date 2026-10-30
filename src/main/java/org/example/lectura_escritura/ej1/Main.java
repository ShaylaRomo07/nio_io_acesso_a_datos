package org.example.lectura_escritura.ej1;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        MaquinaDeEscribir maquinaDeEscribir = new MaquinaDeEscribir();
        MaquinaDeLeer maquinaDeLeer = new MaquinaDeLeer();
        String[] palabras = {"Hola", "Adios", "Ankara", "Rata","Aña","Conejo","Perro","Lobo","Fin"};


        maquinaDeEscribir.run(palabras, "datos/palabras2.txt");
        maquinaDeLeer.run( "datos/palabras2.txt");

    }
}
