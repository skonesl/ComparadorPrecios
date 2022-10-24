package org.curso.edu.BBDDFestival;

import java.util.Scanner;

public class Artista {

    Scanner sc = new Scanner(System.in);

    private String nombre;
    private int costeActuacion;
 //   private boolean aceptaTocar;

    public Artista() {
    }

    public Artista(String nombre, int costeActuacion) {
        this.nombre = nombre;
        this.costeActuacion = costeActuacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCosteActuacion() {
        return costeActuacion;
    }

    public void setCosteActuacion(int costeActuacion) {
        this.costeActuacion = costeActuacion;
    }

//    public boolean isAceptaTocar() {
//        return aceptaTocar;
//    }
//
//    public void setAceptaTocar(boolean esAceptaTocar) {
//        this.aceptaTocar = esAceptaTocar;
//    }

}
