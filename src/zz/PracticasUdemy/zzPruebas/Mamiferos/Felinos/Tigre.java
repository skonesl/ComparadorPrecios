package zz.PracticasUdemy.zzPruebas.Mamiferos.Felinos;

import zz.PracticasUdemy.zzPruebas.Mamiferos.Caninos.Canino;

public class Tigre extends Canino {

    private String especie;

    public Tigre(String habitat, float altura, float largo, float peso, String nombreCientifico, String color, float tamanioColmillos, String especie) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanioColmillos);
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String comer() {
        return "El tigre está comiendo";
    }

    @Override
    public String dormir() {
        return "El tigre está durmiendo";
    }

    @Override
    public String correr() {
        return "El tigre está corriendo";
    }

    @Override
    public String comunicarse() {
        return "El tigre intenta comunicarse";
    }

    @Override
    public String toString() {
        return "Tigre{" +
                "especie='" + especie + '\'' +
                ", color='" + color + '\'' +
                ", tamanioColmillos=" + tamanioColmillos +
                ", habitat='" + habitat + '\'' +
                ", altura=" + altura +
                ", largo=" + largo +
                ", peso=" + peso +
                ", nombreCientifico='" + nombreCientifico + '\'' +
                '}';
    }
}
