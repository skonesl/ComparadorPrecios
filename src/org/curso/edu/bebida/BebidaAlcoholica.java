package org.curso.edu.bebida;

public class BebidaAlcoholica  extends Bebida{

    private double grados;

    public BebidaAlcoholica(double capacidad, String nombre, double grados) {
        super(capacidad, nombre);
        this.grados = grados;
    }

    public double getGrados() {
        return grados;
    }

    public void setGrados(double grados) {
        this.grados = grados;
    }
}
