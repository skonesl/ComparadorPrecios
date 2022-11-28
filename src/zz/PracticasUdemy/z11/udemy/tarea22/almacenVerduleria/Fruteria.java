package zz.PracticasUdemy.z11.udemy.tarea22.almacenVerduleria;

import java.util.ArrayList;
import java.util.Scanner;

public class Fruteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Producto> listaProductos = new ArrayList<Producto>();
        int numUsuario = 0, opcion;

        do {

            System.out.println("Elija el tipo de producto que desea registrar");
            System.out.println("1. Lacteo");
            System.out.println("2. Fruta");
            System.out.println("3. Limpieza");
            System.out.println("4. No Perecible");
            System.out.println("5. salir");
            System.out.print("¿Que opción escoge?: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduzca la marca del lacteo que desea registrar: ");
                    String marca = sc.next();

                    Lacteo lacteo = new Lacteo(marca, 10, 20, 5);
                    listaProductos.add(lacteo);
                    break;

                case 5:
                    numUsuario = 1;
                    break;
                default:
                    System.out.println("El valor introducido es erróneo, vuelva a intentarlo");
                    break;
            }

        } while (numUsuario != 1);

        for (Producto prod: listaProductos) {

            System.out.println(prod);

        }

    }
}
