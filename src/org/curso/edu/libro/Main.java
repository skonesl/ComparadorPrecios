package org.curso.edu.libro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean condicion = true;

        List<Libro> listLibros = new ArrayList<>();
        Libro libro = new Libro();

        do {
            System.out.print("Introduce el nombre del libro: ");
            libro.setTitulo(sc.nextLine());
            System.out.print("Introduce el autor del libro: ");
            libro.setAutor(sc.nextLine());
            System.out.print("Introduce el número de ejemplares disponibles: ");
            libro.setNumEjemplares(sc.nextInt());
            System.out.print("Introduce el número de ejemplares que actualmente hay prestados: ");
            libro.setNumPrestados(sc.nextInt());
            listLibros.add(new Libro());

            System.out.print("Pulse 1 si desea añadir otro libro o cualquier otro número para salir: ");
            int num = sc.nextInt();

            if(num == 1) {
                condicion = true;
            } else {
                condicion = false;
            }

            sc.nextLine();

        } while (condicion == true);

        listLibros.get(0).prestamo();
        System.out.println(listLibros.get(0).prestamo());
        System.out.println(listLibros.get(0).getNumPrestados());
    }
}
