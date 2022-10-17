package zz.PracticasUdemy.z1.udemy.tarea20.ordenCompra;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdenCompra {

    private int id;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private List <Producto> pruductos = new ArrayList<Producto>();

    public OrdenCompra(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Producto> getPruductos() {
        return pruductos;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addProducto (Producto producto) {
        pruductos.add(producto);
    }

    public int sumarPrecio () {
        int sumaTotal = 0;

        for (Producto pro: pruductos) {
            sumaTotal += pro.getPrecio();
        }

        return sumaTotal;
    }

}
