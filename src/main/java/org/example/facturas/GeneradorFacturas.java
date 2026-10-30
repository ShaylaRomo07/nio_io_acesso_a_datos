package org.example.facturas;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class GeneradorFacturas {
    private final Scanner scanner;

    public GeneradorFacturas(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        double importe;
        int iva;
        int numFacturas = 0;
        ArrayList<Registro> registros = new ArrayList<>();
        do {
            numFacturas++;
            System.out.println("Creacción " + numFacturas + "º registro");
            System.out.print("    Importe:");
            importe = scanner.nextDouble();
            scanner.nextLine();
            if (importe == 0) {
                System.out.println("Saliendo..");
            } else {

                do {
                    System.out.print("    IVA:");
                    iva = scanner.nextInt();
                    scanner.nextLine();
                } while (iva != 10 && iva != 21);

                registros.add(new Registro(importe, iva));

                System.out.println(numFacturas + "º registro creado");
            }
        } while (importe != 0);
        generar(registros);
    }

    public void generar(ArrayList<Registro> registros) {
        File file = new File("facturas");
        if (!file.exists()) {
            file.mkdirs();
        }
        int length = Objects.requireNonNull(file.listFiles()).length;
        file = new File(file + "/factura" + (length + 1));

        try (
                FileOutputStream fos = new FileOutputStream(file, false);
                OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
                PrintWriter pw = new PrintWriter(osw);
        ) {
            file.createNewFile();
            pw.println("Factura " + length + 1);
            pw.println();
            double importeTotal = 0;
            double total = 0;

            for (Registro registro : registros) {
                double importeConIva = registro.getImporte() + (registro.getImporte()) * registro.getIva() / 100;
                pw.println("Importe: " + registro.getImporte() + "   IVA:" + registro.getIva() + "      Total:" + importeConIva);
                importeTotal = importeTotal + registro.getImporte();
                total = total + importeConIva;
            }
            pw.println("Importe total: " + importeTotal + "    Suma total(Con iva):" + total);
        } catch (FileNotFoundException e) {
            System.out.println("No se creo el archivo correctamente");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
