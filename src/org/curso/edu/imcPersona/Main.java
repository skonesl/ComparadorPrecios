package org.curso.edu.imcPersona;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Persona borja = new Persona(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextFloat(), sc.nextFloat());

        System.out.println(borja.calcularIMC());

        if (borja.esMayorEdad(Integer.parseInt(borja.getEdad())) == true) {
            System.out.println("La persona " + borja.getNombre() + " es mayor de edad");
        } else {
            System.out.println("La persona " + borja.getNombre() + " es menor de edad");
        }
    }
}
