package ab.interfaces.imprenta;

import ab.interfaces.imprenta.modelo.*;

public class Principal {
    public static void main(String[] args) {

        Curriculum cv = new Curriculum("Experiencia Laboral", "Borja Vivas", "Desarrollador");
        cv.addExperiencia("Java");
        cv.addExperiencia("Boostrap");
        cv.addExperiencia("Oracle 12");
        cv.addExperiencia("Maven");

        Informe informe = new Informe("Celia Marquina", "Nekkane", "Investigación sobre Java");
        imprimir(cv);
        imprimir(informe);

    }

    public static void imprimir (Hoja imprimible) {
        System.out.println(imprimible.imprimir());
    }

}
