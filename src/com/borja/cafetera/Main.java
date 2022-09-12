package com.borja.cafetera;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList <Cafetera> listaBares = new ArrayList<>();

        for (int i = 0; i < 3; i++) {

            System.out.println("Introduzca el nombre de la cafetera: ");
            String nomAux = sc.nextLine();
            System.out.println("Introduzca la capacidad de la cafetera: ");
            int capacAux = sc.nextInt();

            Cafetera cafetera = new Cafetera(nomAux, capacAux);

            listaBares.add(cafetera);
            sc.nextLine();
        }

        for (int i = 0; i < listaBares.size(); i++) {
            System.out.println("La cafetera número " + (i + 1) + " tiene el nombre de " + listaBares.get(i).getNombre() + " y una capacidad de " + listaBares.get(i).getCapacidadTotal());
        }

    }
}
