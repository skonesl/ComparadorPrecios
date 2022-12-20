package zz.PracticasUdemy.zzPruebas.Mamiferos.Felinos;

public class Leon extends Felino {

    private int manada;
    private float potenciaRugido;

    public Leon(String habitat, float altura, float largo, float peso, String nombreCientifico, int manada, float potenciaRugido) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.manada = manada;
        this.potenciaRugido = potenciaRugido;
    }

    public int getManada() {
        return manada;
    }

    public void setManada(int manada) {
        this.manada = manada;
    }

    public float getPotenciaRugido() {
        return potenciaRugido;
    }

    public void setPotenciaRugido(float potenciaRugido) {
        this.potenciaRugido = potenciaRugido;
    }

    @Override
    public String comer() {
        return "El león está comiendo";
    }

    @Override
    public String dormir() {
        return "El león está durmiendo";
    }

    @Override
    public String correr() {
        return "El león está corriendo";
    }

    @Override
    public String comunicarse() {
        return "El león está intentando comunicarse";
    }

    @Override
    public String toString() {
        return "Leon{" +
                "manada=" + manada +
                ", potenciaRugido=" + potenciaRugido +
                ", tamanioGarras=" + tamanioGarras +
                ", velocidad=" + velocidad +
                ", habitat='" + habitat + '\'' +
                ", altura=" + altura +
                ", largo=" + largo +
                ", peso=" + peso +
                ", nombreCientifico='" + nombreCientifico + '\'' +
                '}';
    }
}
