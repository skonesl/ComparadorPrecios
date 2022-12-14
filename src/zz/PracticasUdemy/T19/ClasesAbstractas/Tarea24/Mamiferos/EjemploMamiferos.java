package zz.PracticasUdemy.T19.ClasesAbstractas.Tarea24.Mamiferos;

import zz.PracticasUdemy.T19.ClasesAbstractas.Tarea24.Mamiferos.Caninos.Perro;

import java.util.ArrayList;
import java.util.List;

public class EjemploMamiferos {
    public static void main(String[] args) {

        List <Mamifero> listaMamiferos = new ArrayList<>();
        listaMamiferos.add(new Perro("Domestico", 80, 120,
                25, "Perrus", "Blanco", 5, 200));

    }
}
