package org.example.facturas;

public class Registro {
    private Double importe;
    private int iva;

    public Registro(Double importe, int iva) {
        this.importe = importe;
        this.iva = iva;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }
}
