package org.curso.edu.bebida;

public class Ron extends BebidaAlcoholica{

    private String pais;

    public Ron(double capacidad, String nombre, double grados, String pais) {
        super(capacidad, nombre, grados);
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
