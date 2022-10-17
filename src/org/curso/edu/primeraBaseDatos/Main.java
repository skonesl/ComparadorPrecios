package org.curso.edu.primeraBaseDatos;

import java.sql.*;

public class Main {
    public static void main(String[] args) {

        try {
            String ruta = "C:\\Users\\borja\\Downloads\\sqlitestudio-3.3.3\\SQLiteStudio\\Musica.db";
            Connection conexion = DriverManager.getConnection("jdbc:sqlite:" + ruta);
            Statement consulta = conexion.createStatement();
            ResultSet rs = consulta.executeQuery("SELECT * FROM Rock");
            while (rs.next()) {
                String grupo = rs.getNString(1);
                String genero = rs.getNString(2);
                System.out.println(grupo + " - " + genero);
            }

            System.out.println("Grupos disponibles");
            consulta.close();

            Statement stmt = conexion.createStatement();
            stmt = conexion.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS PUNK "
                    + "(NOMBRE VARCHAR(50) PRIMARY KEY NOT NULL,"
                    + " GENERO VARCHAR(25) NOT NULL, "
                    + " PRECIO INT NOT NULL)";

            stmt.executeUpdate(sql);
            System.out.println("Tabla Punk CREADA");
            stmt.close();

            //INSERTAMOS DATOS
            stmt = conexion.createStatement();
            sql = "INSERT INTO PUNK (NOMBRE,GENERO,PRECIO) "
                    + "VALUES ('Ska-p', 'Ska-Punk', 18000);";
            stmt.executeUpdate(sql);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
