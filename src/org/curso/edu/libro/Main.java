package org.curso.edu.libro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean condicion = true, seguir = true;
        int numCond, numSeguir;

        List<Libro> listLibros = new ArrayList<>();
        Libro libro = new Libro();

         do {

             System.out.println("--¿Que acción desea realizar?--");
             System.out.println("1. Añadir un nuevo Libro a su repositorio");
             System.out.println("2. Registrar en el sistema que un libro ha sido devuelto");
             System.out.println("3. Registrar en el sistema que un libro ha sido prestado");
             System.out.println("4. Obtener información de todos los libros registrados en el sistema");
             System.out.print("Marque una opción: ");
             numCond = sc.nextInt();

             switch (numCond) {
                 case 1:
                     sc.nextLine();
                     System.out.print("Introduce el nombre del libro: ");
                     libro.setTitulo(sc.nextLine());
                     System.out.print("Introduce el autor del libro: ");
                     libro.setAutor(sc.nextLine());
                     System.out.print("Introduce el número de ejemplares disponibles: ");
                     libro.setNumEjemplares(sc.nextInt());
                     System.out.print("Introduce el número de ejemplares que actualmente hay prestados: ");
                     libro.setNumPrestados(sc.nextInt());
                     listLibros.add(new Libro(libro.getTitulo(), libro.getAutor(), libro.getNumEjemplares(), libro.getNumPrestados()));
                     break;
                 case 2:
                     System.out.println(listLibros.get(0).toString());
                     break;
             }


             System.out.print("Si desea continuar con la ejecución del programa pulse 0. De lo contrario pulse cualquier otro número: ");
             numSeguir = sc.nextInt();

             if (numSeguir == 0) {
                 seguir = true;
             } else {
                 seguir = false;
             }

        } while (seguir == true);
    }
}
