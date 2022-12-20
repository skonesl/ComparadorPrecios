package zz.PracticasUdemy.T19.ClasesAbstractas.Tarea24.Mamiferos;

import zz.PracticasUdemy.T19.ClasesAbstractas.Tarea24.Mamiferos.Caninos.Lobo;
import zz.PracticasUdemy.T19.ClasesAbstractas.Tarea24.Mamiferos.Caninos.Perro;
import zz.PracticasUdemy.T19.ClasesAbstractas.Tarea24.Mamiferos.Felinos.Guepardo;
import zz.PracticasUdemy.T19.ClasesAbstractas.Tarea24.Mamiferos.Felinos.Leon;
import zz.PracticasUdemy.T19.ClasesAbstractas.Tarea24.Mamiferos.Felinos.Tigre;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjemploMamiferos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List <Mamifero> listaMamiferos = new ArrayList<>();
        int opcion;

        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            Connection connection = null;
            Statement statement = null;
            connection = DriverManager.getConnection("jdbc:sqlite:Animales.db");
            System.out.println("Conexión realizada correctamente");

            System.out.println("¿Qué acción desea realizar?");
            System.out.println("1. Añadir un perro");
            System.out.println("2. Añadir un lobo");
            System.out.println("3. Añadir un guepardo");
            System.out.println("4. Añadir un león");
            System.out.println("5. Añadir un tigre");
            System.out.println("0. Cerrar el programa");
            System.out.print("Marque una opción: ");
            opcion = sc.nextInt();

            do {
                switch (opcion) {
                    case 0:
                        System.out.println("Cerrando el programa...");
                        break;
                    case 1:
                        System.out.print("Introduce el nombre del perro: ");
                        String nombreCientifico = sc.next();
                        listaMamiferos.add(new Perro("Domestico", 80, 120,
                                25, nombreCientifico, "Blanco", 5, 200));
                        sc.nextLine();
                        break;
                    case 2:
                        listaMamiferos.add(new Lobo("Selva", 95, 150, 42,
                                "LobusEnormus", "Manchas", 16, 42, "Lobo Salvaje"));
                        break;
                    case 3:
                        listaMamiferos.add(new Guepardo("Amazonas", 70, 110, 34, "Guepardus"));
                        break;
                    case 4:
                        listaMamiferos.add(new Leon("Amazonas", 85f, 160f, 68f, "Leonus Salvajus",
                                25, 22.5f));
                        break;
                    case 5:
                        listaMamiferos.add(new Tigre("Selva", 100, 170, 60, "Tigretone",
                                "Moteado", 18, "Salvaje"));
                        break;
                    default:
                        System.out.println("La opción introducida no es válida");
                        break;
                }

                System.out.println("¿Qué acción desea realizar?");
                System.out.println("1. Añadir un perro" + "\n2. Añadir un lobo" + "\n3. Añadir un guepardo");
                System.out.println("4. Añadir un león" + "\n5. Añadir un tigre" + "\n0. Cerrar el programa");
                System.out.print("Marque una opción: ");
                opcion = sc.nextInt();

            } while (opcion != 0);


            for (Mamifero a : listaMamiferos) {

                if (a instanceof Perro) {
                    System.out.println(a.comunicarse());
                } else if (a instanceof Lobo) {
                    System.out.println(a.comer());
                } else if (a instanceof Guepardo) {
                    System.out.println(a.dormir());
                } else if (a instanceof Leon) {
                    System.out.println(a.correr());
                } else if (a instanceof Tigre) {
                    System.out.println(a.dormir());
                }

                System.out.println(a.toString());
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
