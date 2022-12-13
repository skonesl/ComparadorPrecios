package zz.PracticasUdemy.T14.POO.ClasesObjetos.tarea20.ordenCompra;

public class Main {
    public static void main(String[] args) {

        OrdenCompra uno = new OrdenCompra("Productos Informáticos");
        Cliente borja = new Cliente("Borja", "Vivas");
        uno.setCliente(borja);
        Producto ordenador = new Producto("Microsoft", "Surface", 1200);
        Producto smartphone = new Producto("BQ", "Aquaris", 200);
        Producto altavoz = new Producto("Amazon", "Echo", 29);
        uno.addProducto(ordenador);
        uno.addProducto(smartphone);
        uno.addProducto(altavoz);

        StringBuilder sb = new StringBuilder("La orden de compra: ")
                .append(uno.getDescripcion())
                .append(" realizada por el cliente ")
                .append(borja.getNombre() + " " + borja.getApellido())
                .append(" está compuesta por los siguientes productos ");
        System.out.println(sb);

        for (int i = 0; i < uno.getPruductos().size(); i++) {

            StringBuilder impProductos = new StringBuilder("Nombre: " + uno.getPruductos().get(i).getNombre())
                    .append(" fabricado por: " + uno.getPruductos().get(i).getFabricante())
                    .append(" con un precio de: " + uno.getPruductos().get(i).getPrecio());

            System.out.println(impProductos);
        }

        System.out.println("El precio total de todo el pedido es de: " + uno.sumarPrecio());

    }
}
