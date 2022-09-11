import java.awt.image.TileObserver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Supermercado {

    private String nombre;
    private List <Producto> productos = new ArrayList<Producto>();

    public Supermercado(String nombre, List<Producto> productos) {
        this.nombre = nombre;
        this.productos = productos;
    }

    public Supermercado() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public void listaProductos (Producto productoNuevo) {
        productos.add(productoNuevo);
    }

    public void precioMasBajo (List <Producto> productos) {
        double precioBajo = 10000;
        String nombreProducto = "";

        for (int i = 0; i < productos.size(); i++) {

            if (precioBajo > productos.get(i).getPrecio()) {
                precioBajo = productos.get(i).getPrecio();
                nombreProducto = productos.get(i).getNombre();
            }
        }
        System.out.println("El artículo con el precio más bajo es: " + nombreProducto + " que tiene un precio de " + precioBajo);
    }

    //TODO: Metodo para ordenar la lista no consigo que funcione
//    public void listaOrdenada (List <Producto> productos) {
//
//        productos.sort(Comparator.naturalOrder().reversed());
//
//    }

}
