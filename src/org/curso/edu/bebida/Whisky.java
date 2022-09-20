package org.curso.edu.bebida;

public class Whisky extends BebidaAlcoholica{

    private int anios;

    public Whisky(double capacidad, String nombre, double grados, int anios) {
        super(capacidad, nombre, grados);
        this.anios = anios;
    }

    public int getAnios() {
        return anios;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }

    @Override
    public String toString() {
        return " En concreto un Whisky de " +
                "anios=" + anios;
    }
}
