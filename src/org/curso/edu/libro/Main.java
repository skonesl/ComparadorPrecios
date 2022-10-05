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

                     for (int i = 0; i < listLibros.size(); i++) {
                         System.out.print(i + ". " + listLibros.get(i).getTitulo() + " - ");
                     }
                     System.out.println();
                     int opcion;
                     System.out.print("Elija el libro del que han devuelto una unidad: ");
                     opcion = sc.nextInt();

                     if (opcion > listLibros.size()) {
                         System.out.println("El libro introducido no existe");
                         while (opcion > listLibros.size()) {
                             System.out.print("Vuelva a introducir una opción");
                             opcion = sc.nextInt();
                         }
                     }
                     listLibros.get(opcion).devolucion();
                     System.out.println("Devolución realizada correctamente. Tas este movimiento quedan " + (listLibros.get(opcion).getNumEjemplares() - listLibros.get(opcion).getNumPrestados()) + " libros");
                     System.out.println("De este libro hay un total de " + listLibros.get(opcion).getNumEjemplares());
                     System.out.println("Actualmente quedan en préstamo " + listLibros.get(opcion).getNumPrestados());
                     break;

                 case 3:
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
