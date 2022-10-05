package org.curso.edu.imcPersona;

public class Persona {

    private String nombre;
    private String dni;
    private String edad;
    private String sexo;
    private float altura;
    private float peso;

    public Persona() {
    }

    public Persona(String nombre, String dni, String edad, String sexo, float altura, float peso) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    //Esto calcula lo que le da la gana
    public int calcularIMC () {

        float imc = peso / (altura * altura);
        int imcCast = (int) imc;
        return imcCast;
    }

    public boolean esMayorEdad (int edad) {
        boolean mayorEdad ;

        if (edad < 18) {
            mayorEdad = false;
        } else {
            mayorEdad = true;
        }
        return mayorEdad;
    }

}
