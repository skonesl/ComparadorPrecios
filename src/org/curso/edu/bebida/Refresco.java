package org.curso.edu.bebida;

public class Refresco  extends Bebida{

    private String sabor;

    public Refresco(double capacidad, String nombre, String sabor) {
        super(capacidad, nombre);
        this.sabor = sabor;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    @Override
    public String beber () {
        return "refrescos porque son muy sanos";
    }

}
