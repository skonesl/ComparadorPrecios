package ab.interfaces.imprenta;

import ab.interfaces.imprenta.modelo.*;

public class Principal {
    public static void main(String[] args) {

        Curriculum cv = new Curriculum("Experiencia Laboral", new Persona("Borja", "Vivas"), "Desarrollador");
        cv.addExperiencia("Java")
            .addExperiencia("Boostrap")
            .addExperiencia("Oracle 12")
            .addExperiencia("Maven");

        Libro libro = new Libro(new Persona("Chema", "Alonso"), "Criptomonedas, el negocio del sigo", Genero.PROGRAMACION);
        libro.addPagina(new Pagina("Las criptomonedas, ese gran desconocido"))
                .addPagina(new Pagina("¿Qué es el blockchain?"))
                .addPagina(new Pagina("Todo lo que debes saber sobre el bitcoin"));

        Informe informe = new Informe(new Persona("Celia", "Marquina"), new Persona("Nekkane", "Toboso"), "Investigación sobre Java");
        imprimir(cv);
        imprimir(informe);
        imprimir(libro);

    }

    public static void imprimir (Imprimible imprimible) {
        System.out.println(imprimible.imprimir());
    }

}
