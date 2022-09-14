package org.curso.edu.seleccionFutbol.seis;

public class Futbolista extends SeleccionFutbol{

    private int dorsal;
    private String demarcacion;

    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public void jugarPartido () {
        System.out.println("El jugador está jugando el partido");
    }

    public void entrenar () {
        System.out.println("El jugador está entrenando");
    }

}
