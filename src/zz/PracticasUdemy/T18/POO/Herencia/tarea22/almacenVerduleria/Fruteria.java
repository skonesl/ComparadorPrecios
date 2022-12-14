package zz.PracticasUdemy.T18.POO.Herencia.tarea22.almacenVerduleria;

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

                    int contadorLacteos = 0;

                    for (Producto prod: listaProductos) {
                        if (prod instanceof Lacteo == true) {
                            contadorLacteos++;
                        }
                    }

                    if (contadorLacteos < 2) {
                        System.out.print("Introduzca la marca del lacteo que desea registrar: ");
                        String marca = sc.next();

                        Lacteo lacteo = new Lacteo(marca, 10, 20, 5);
                        listaProductos.add(lacteo);
                    } else {
                        System.out.println("Ha superado el límite de 2 productos por cada tipo disponible");
                    }
                    break;

                case 2:

                    int contadorFruta = 0;

                    for (Producto prod: listaProductos) {
                        if (prod instanceof Fruta == true) {
                            contadorFruta++;
                        }
                    }

                    if (contadorFruta < 2) {
                        System.out.print("Introduzca la marca de la fruta que desea registrar: ");
                        String marca = sc.next();

                        Fruta fruta = new Fruta(marca, 10, 2, "Verde");
                        listaProductos.add(fruta);
                    } else {
                        System.out.println("Ha superado el límite de 2 productos por cada tipo disponible");
                    }
                    break;

                case 3:

                    int contadorLimpieza = 0;

                    for (Producto prod: listaProductos) {
                        if (prod instanceof Limpieza == true) {
                            contadorLimpieza++;
                        }
                    }

                    if (contadorLimpieza < 2) {
                        System.out.print("Introduzca la marca del pruducto de limpieza que desea registrar: ");
                        String marca = sc.next();

                        Limpieza producto = new Limpieza(marca, 10, "Arsénico", 3);
                        listaProductos.add(producto);
                    } else {
                        System.out.println("Ha superado el límite de 2 productos por cada tipo disponible");
                    }
                    break;

                case 4:

                    int contadorNoPere = 0;

                    for (Producto prod: listaProductos) {
                        if (prod instanceof NoPerecible == true) {
                            contadorNoPere++;
                        }
                    }if (contadorNoPere < 2) {
                        System.out.print("Introduzca la marca del pruducto no perecedero que desea registrar: ");
                        String marca = sc.next();

                        NoPerecible producto = new NoPerecible(marca, 10, 150, 3);
                        listaProductos.add(producto);
                    } else {
                        System.out.println("Ha superado el límite de 2 productos por cada tipo disponible");
                    }
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
