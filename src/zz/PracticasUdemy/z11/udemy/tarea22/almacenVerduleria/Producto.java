package zz.PracticasUdemy.z11.udemy.tarea22.almacenVerduleria;

public class Producto {

    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", precio=" + precio;
    }
}
