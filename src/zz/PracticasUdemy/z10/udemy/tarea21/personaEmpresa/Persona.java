package zz.PracticasUdemy.z10.udemy.tarea21.personaEmpresa;

public class Persona {

    private String nombre;
    private String apellido;
    private String numFiscal;
    private String direccion;

    public Persona() {

    }

    public Persona(String nombre, String apellido, String numFiscal, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numFiscal = numFiscal;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNumFiscal() {
        return numFiscal;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "El trabajador " + nombre + " " + apellido +
                " con número fiscal " + numFiscal +
                " reside en la dirección " + direccion;
    }
}
