package org.curso.edu.seleccionFutbol.seis;

public class SeleccionFutbol {

    protected int id;
    protected String nombre;
    protected String apellidos;
    protected int edad;

    public SeleccionFutbol(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public void concentrarse () {
        System.out.println("El empleado se está concentrando");
    }

    public void viajar () {
        System.out.println("El empleado está viajando");
    }

}
