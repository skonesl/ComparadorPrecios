package org.curso.edu.bebida;

public class Principal {

    public static void main(String[] args) {

    //Falta crear objetos e implementar herencia de métodos (Explicado vídeo Udemy 184)

    }

    public static void imprimir (Bebida bebida) {

        System.out.println("Imprimiendo los datos en común de todas las bebidas:");
        System.out.println("Capacidad: " + bebida.getNombre() +
                " nombre: " + bebida.getNombre());

        if (bebida instanceof BebidaAlcoholica) {

            System.out.println("Imprimiendo información propia de las bebidas alcohólicas: ");
            System.out.println("Graduación: " + ((BebidaAlcoholica) bebida).getGrados());

            if (bebida instanceof Ron) {
                System.out.println("Imprimiendo información propia del ron:");
                System.out.println("País de procedencia: " + ((Ron)bebida).getPais());
            } else if (bebida instanceof Whisky) {
                System.out.println("Imprimiendo información propia del whisky: ");
                System.out.println("Años de antigüedad: " + ((Whisky) bebida).getAnios());
            }
        }

        if (bebida instanceof Refresco) {
            System.out.println("Imprimiendo información propia de un refresco: ");
            System.out.println("El refresco es de sabor: " + ((Refresco)bebida).getSabor());
        }


    }


}
