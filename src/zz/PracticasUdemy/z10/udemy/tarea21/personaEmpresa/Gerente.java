package zz.PracticasUdemy.z10.udemy.tarea21.personaEmpresa;

public class Gerente extends Empleado {

    private double presupuesto;

    public Gerente() {

    }

    public Gerente(String nombre, String apellido, String numFiscal, String direccion, double remuneracion, int empleadoId, double presupuesto) {
        super(nombre, apellido, numFiscal, direccion, remuneracion, empleadoId);
        this.presupuesto = presupuesto;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nSu presupuesto como gerente es de " + presupuesto;
    }
}
