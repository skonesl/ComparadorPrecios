package zz.PracticasUdemy.zzPruebas.Mamiferos.Felinos;

public class Guepardo  extends Felino {

    public Guepardo(String habitat, float altura, float largo, float peso, String nombreCientifico) {
        super(habitat, altura, largo, peso, nombreCientifico);
    }

    @Override
    public String comer() {
        return "El Guepardo está corriendo";
    }

    @Override
    public String dormir() {
        return "El Guepardo está durmiendo";
    }

    @Override
    public String correr() {
        return "El guepardo está corriendo";
    }

    @Override
    public String comunicarse() {
        return "El Guepardo está intentando comunicarse";
    }

    @Override
    public String toString() {
        return "Guepardo{" +
                "tamanioGarras=" + tamanioGarras +
                ", velocidad=" + velocidad +
                ", habitat='" + habitat + '\'' +
                ", altura=" + altura +
                ", largo=" + largo +
                ", peso=" + peso +
                ", nombreCientifico='" + nombreCientifico + '\'' +
                '}';
    }
}
