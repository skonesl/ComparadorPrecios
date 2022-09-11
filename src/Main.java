import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca 1 para añadir productos y 2 para cerrar el programa: ");
        int condicion = sc.nextInt();
        Supermercado superm = new Supermercado();
        Producto producto;
        superm.setNombre("Mercadona");

        while (condicion == 1) {

            switch (condicion) {
                case 1:
                    sc.nextLine();
                    System.out.print("Introduzca un nombre: ");
                    String auxNombre = sc.nextLine();
                    System.out.print("Introduzca un precio: ");
                    double auxPrecio = sc.nextInt();

                    superm.listaProductos(new Producto(auxNombre, auxPrecio));
                    break;
                case 2:
                    System.out.println("Saliendo del programa");
                    break;
                case default:
                    System.out.println("Se equivocó de botón");
                    break;
            }

            System.out.print("Introduzca 1 para seguir añadiendo productos y 2 para cerrar el programa: ");
            condicion = sc.nextInt();

        }

        for (int i = 0; i < superm.getProductos().size(); i++) {
            System.out.println(superm.getProductos().get(i).getNombre() + " " + superm.getProductos().get(i).getPrecio());
        }

        superm.precioMasBajo(superm.getProductos());

    }
}