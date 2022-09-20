package org.curso.edu.bebida;

public class Bebida {

    private double capacidad;
    private String nombre;

    public Bebida(double capacidad, String nombre) {
        this.capacidad = capacidad;
        this.nombre = nombre;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String beber() {
        return "Me encanta beber";
    }

    @Override
    public String toString() {
        return "¡Hola! Soy el método toString. He creado una bebida con " +
                "capacidad de = " + capacidad +
                " y nombre= " + nombre;
    }
}


