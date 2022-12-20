package zz.PracticasUdemy.zzPruebas.Mamiferos.Caninos;

public class Lobo extends Canino {

    private int camada;
    private String especieLobo;

    public Lobo(String habitat, float altura, float largo, float peso, String nombreCientifico, String color, float tamanioColmillos, int camada, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanioColmillos);
        this.camada = camada;
        this.especieLobo = especieLobo;
    }

    public int getCamada() {
        return camada;
    }

    public void setCamada(int camada) {
        this.camada = camada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    public void setEspecieLobo(String especieLobo) {
        this.especieLobo = especieLobo;
    }

    @Override
    public String comer() {
        return "El lobo está comiendo";
    }

    @Override
    public String dormir() {
        return "El lobo está durmiendo";
    }

    @Override
    public String correr() {
        return "El lobo está corriendo";
    }

    @Override
    public String comunicarse() {
        return "El lobo se está intentando comunicar";
    }

    @Override
    public String toString() {
        return "Lobo{" +
                "camada=" + camada +
                ", especieLobo='" + especieLobo + '\'' +
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
