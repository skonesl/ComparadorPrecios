package org.curso.edu.BBDDFestival;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numWhile = 0;
        int opcionInicio;

        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            Connection connection = null;
            Statement statement = null;
            connection = DriverManager.getConnection("jdbc:sqlite:Festival.db");
            System.out.println("Conexión realizada correctamente");

            do {

                System.out.println("¿Qué desea hacer?");
                System.out.println("1. Añadir un nuevo artista contactado");
                System.out.println("2. Ver todos los grupos contactados");
                System.out.print("Marque una opción: ");
                opcionInicio = sc.nextInt();

                switch (opcionInicio) {
                    case 1:
                        sc.nextLine();
                        Artista artista = new Artista();
                        System.out.print("Introduce el nombre del artista: ");
                        artista.setNombre(sc.nextLine());
                        System.out.print("Introduce el coste de contratar este artista: ");
                        artista.setCosteActuacion(sc.nextInt());

                        Statement stmt = connection.createStatement();
                        stmt = connection.createStatement();
                        String sql2 = "CREATE TABLE IF NOT EXISTS GRUPOS "
                                + "(NOMBRE VARCHAR(50) PRIMARY KEY NOT NULL,"
                                + " PRECIO INT NOT NULL)";

                        stmt.executeUpdate(sql2);
                        stmt.close();

                        //INSERTAMOS DATOS
                        stmt = connection.createStatement();
                        String sql = "INSERT INTO GRUPOS (NOMBRE,PRECIO) "
                                + "VALUES ('" + artista.getNombre() + "', " + artista.getCosteActuacion() + ");";

                        stmt.executeUpdate(sql);
                        System.out.println("Datos insertados correctamente");
                        stmt.close();
                        break;
                    case 2:
                        stmt = connection.createStatement();
                        ResultSet rs = stmt.executeQuery("SELECT * FROM GRUPOS");

                        while (rs.next()) {
                            String nombre = rs.getString(1);
                            int precio = rs.getInt(2);
                            System.out.println(nombre + " - " + precio);
                        }
                        System.out.println("Datos extraídos correctamente");
                        stmt.close();
                        break;
                }

            //Aquí creamos tabla (Grupos) en BBDD y agregaremos un switch para elegir entre diferentes opciones

            } while (numWhile != 0);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
