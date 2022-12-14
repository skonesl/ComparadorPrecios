package zz.PracticasUdemy.T19.ClasesAbstractas.Tarea24.Mamiferos.Caninos;

import zz.PracticasUdemy.T19.ClasesAbstractas.Tarea24.Mamiferos.Mamifero;

public class Perro extends Canino {

    private int fuerzaMordida;

    public Perro(String habitat, float altura, float largo, float peso, String nombreCientifico, String color, float tamanioColmillos, int fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanioColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    @Override
    public String comer() {
        return "El perro está comiendo";
    }

}
