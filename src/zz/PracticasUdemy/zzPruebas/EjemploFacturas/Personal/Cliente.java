package zz.PracticasUdemy.zzPruebas.EjemploFacturas.Personal;

public class Cliente {

    private String nombre;
    private String nif;

    public Cliente() {
    }

    public Cliente(String nombre, String nif) {
        this.nombre = nombre;
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }
}
