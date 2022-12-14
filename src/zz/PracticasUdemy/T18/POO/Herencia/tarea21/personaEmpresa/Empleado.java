package zz.PracticasUdemy.T18.POO.Herencia.tarea21.personaEmpresa;

public class Empleado extends Persona {

    private double remuneracion;
    private int empleadoId;

    public Empleado() {

    }

    public Empleado(String nombre, String apellido, String numFiscal, String direccion, double remuneracion, int empleadoId) {
        super(nombre, apellido, numFiscal, direccion);
        this.remuneracion = remuneracion;
        this.empleadoId = empleadoId;
    }

    public double getRemuneracion() {
        return remuneracion;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nTiene el ID de empleado " + empleadoId +
                " y un salario de " + remuneracion;
    }

    public double devolverSueldo (int porcentaje) {

        double calculo = (remuneracion * porcentaje) / 100;
        remuneracion += calculo;

        return remuneracion;

    }

}
