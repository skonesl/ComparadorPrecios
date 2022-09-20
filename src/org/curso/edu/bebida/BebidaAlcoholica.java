package org.curso.edu.bebida;

public class BebidaAlcoholica  extends Bebida{

    private double grados;

    public BebidaAlcoholica(double capacidad, String nombre, double grados) {
        super(capacidad, nombre);
        this.grados = grados;
    }

    public double getGrados() {
        return grados;
    }

    public void setGrados(double grados) {
        this.grados = grados;
    }

    @Override
    public String beber () {
        return super.beber() + " porque soy un programa muy borracho";
    }

    @Override
    public String toString() {
        return super.toString() + " en este caso soy una bebida alcohólica con " +
                "una graduación alcohólica de = " + grados + " grados";
    }
}
