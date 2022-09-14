package org.curso.edu.seleccionFutbol.seis;

public class Entrenador extends SeleccionFutbol{

    private String idFederacion;

    public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public void dirigirPartido () {
        System.out.println("El entrenador está dirigiendo el partido");
    }

    public void dirigirEntrenamiento () {
        System.out.println("El entrenador está dirigiendo el partido");
    }

}
