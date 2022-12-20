package zz.PracticasUdemy.zzPruebas.Mamiferos.Felinos;

import zz.PracticasUdemy.zzPruebas.Mamiferos.Mamifero;

public class Felino extends Mamifero {

    protected float tamanioGarras;
    protected int velocidad;

    public Felino(String habitat, float altura, float largo, float peso, String nombreCientifico) {
        super(habitat, altura, largo, peso, nombreCientifico);
    }

    public float getTamanioGarras() {
        return tamanioGarras;
    }

    public void setTamanioGarras(float tamanioGarras) {
        this.tamanioGarras = tamanioGarras;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String comer() {
        return null;
    }

    @Override
    public String dormir() {
        return null;
    }

    @Override
    public String correr() {
        return null;
    }

    @Override
    public String comunicarse() {
        return null;
    }
}
