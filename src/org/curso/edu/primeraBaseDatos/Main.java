package org.curso.edu.primeraBaseDatos;

import java.sql.*;

public class Main {
    public static void main(String[] args) {

        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            Connection connection = null;
            Statement statement = null;
            connection = DriverManager.getConnection("jdbc:sqlite:Musica.db");
            //connection.setAutoCommit(false);
            System.out.println("Conexión realizada correctamente");

           statement = connection.createStatement();
           String sql = "INSERT INTO Rock (Artista) VALUES ('Reincidentes')";
           statement.executeUpdate(sql);
           sql = "INSERT INTO test (test) VALUES ('Rosalía')";
           statement.executeUpdate(sql);
           sql = "INSERT INTO Rock (Artista) VALUES ('La Regadera')";
           statement.executeUpdate(sql);
           System.out.println("Datos insertados");


//            String ruta = "Musica.db";
//            Connection conexion = DriverManager.getConnection("jdbc:sqlite:" + ruta);
//            System.out.println("Conexión con Base de Datos correcta");
//            Statement consulta = conexion.createStatement();
//            String sql ="CREATE TABLE IF NOT EXISTS Mestizaje"
//                    +"(Grupo VARCHAR(20) PRIMARY KEY NOT NULL)";
//            ResultSet rs = consulta.executeQuery("SELECT * FROM test");
//
//            while (rs.next()) {
//                String grupo = rs.getNString(1);
//                String genero = rs.getNString(2);
//                System.out.println(grupo + " - " + genero);
//            }
//
//            System.out.println("Grupos disponibles");
//            consulta.close();
//
//            Statement stmt = conexion.createStatement();
//            stmt = conexion.createStatement();
//            String sql2 = "CREATE TABLE IF NOT EXISTS PUNK "
//                    + "(NOMBRE VARCHAR(50) PRIMARY KEY NOT NULL,"
//                    + " GENERO VARCHAR(25) NOT NULL, "
//                    + " PRECIO INT NOT NULL)";
//
//            stmt.executeUpdate(sql2);
//            System.out.println("Tabla Punk CREADA");
//            stmt.close();
//
//            //INSERTAMOS DATOS
//            stmt = conexion.createStatement();
//            sql = "INSERT INTO PUNK (NOMBRE,GENERO,PRECIO) "
//                    + "VALUES ('Ska-p', 'Ska-Punk', 18000);";
//            stmt.executeUpdate(sql);
//
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
