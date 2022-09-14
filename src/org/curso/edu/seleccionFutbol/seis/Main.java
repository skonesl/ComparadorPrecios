package org.curso.edu.seleccionFutbol.seis;

public class Main {

    public static void main(String[] args) {

        Futbolista fut1 = new Futbolista(07, "Borja", "Vivas", 24, 332, "Delantero");
        Entrenador entr2 = new Entrenador(12, "Pablo", "Marquina", 52, "Entrenador");
        Masajista masaj3 = new Masajista(11, "Nekkane", "Perez", 29, "Licenciado", 5);

        fut1.jugarPartido();
        fut1.entrenar();
        fut1.concentrarse();
        fut1.viajar();
    }

}
