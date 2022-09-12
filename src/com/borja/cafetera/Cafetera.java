package com.borja.cafetera;

public class Cafetera {

    private String nombre;
    private int capacidadTotal;
    private int capacidadActual;

    public Cafetera(String nombre, int capacidadTotal) {
        this.nombre = nombre;
        this.capacidadTotal = capacidadTotal;
        this.capacidadActual = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidadTotal() {
        return capacidadTotal;
    }

    public void setCapacidadTotal(int capacidadTotal) {
        this.capacidadTotal = capacidadTotal;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }
}
