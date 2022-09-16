package org.curso.edu.bebida;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcionUsuario;

        Bebida bebida = new Bebida(500, "CocaCola");
        BebidaAlcoholica kalimotxo = new BebidaAlcoholica(500, "Kalimotxo", 10);
        Ron cacique = new Ron(500, "Cacique", 42, "Cuba");
        Refresco fanta = new Refresco(330, "Fanta", "Naranja");

        System.out.println("¿Quiere tomar un refresco? Elija uno");
        System.out.println("1. Sorpresa");
        System.out.println("2. Kalimotxo");
        System.out.println("3. Ron");
        System.out.println("4. Refresco");
        System.out.print("¿Qué opción desea?: ");
        opcionUsuario = sc.nextInt();

        //Terminar desarrollo switch
        //Añadir bucle para ejecupar programa mientras quiera

        switch (opcionUsuario) {
            case 1:
                System.out.println("Aquí tiene su refresco sorpresa: Una " + bebida.getNombre() + " de "
                        + bebida.getCapacidad() + " ml");
                imprimir(bebida);
                System.out.println(bebida.beber());
                break;
            case 2:
                System.out.println("Aqu tiene su " + kalimotxo.getNombre() + " de " + kalimotxo.getCapacidad() + " ml");
                imprimir(kalimotxo);
                System.out.println(kalimotxo.beber());
                break;
            case default:
                break;
        }
    }

    public static void imprimir (Bebida bebida) {

        System.out.println("Imprimiendo los datos en común de todas las bebidas:");
        System.out.println("Capacidad: " + bebida.getCapacidad() +
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
