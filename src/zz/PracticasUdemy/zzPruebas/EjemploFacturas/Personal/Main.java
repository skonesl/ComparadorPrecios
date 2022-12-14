package zz.PracticasUdemy.zzPruebas.EjemploFacturas.Personal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList <Factura> listaFacturas = new ArrayList<Factura>();
        Factura primeraFactura = new Factura();
        Cliente cliente = new Cliente();
        Producto producto = new Producto();
        ItemFactura itemFactura = new ItemFactura();
        int contador = 0;

        System.out.println("Comenzamos a rellenar su primera factura: ");
        System.out.print("Introduzca el nombre del cliente al que emitimos esta factura: ");
        cliente.setNombre(sc.nextLine());
        System.out.print("Introduzca el NIF del cliente: ");
        cliente.setNif(sc.nextLine());
        primeraFactura.setCliente(cliente);
        System.out.print("Introduzca el nº de factura: ");
        primeraFactura.setFolio(sc.nextInt());
        sc.nextLine();
        System.out.print("Introduzca el concepto de la factura: ");
        primeraFactura.setDescr(sc.nextLine());
        System.out.println("Se autocompleta la fecha de la factura ");
        primeraFactura.setFecha(new Date());

        ItemFactura itm = new ItemFactura();
        ItemFactura itm2 = itm;
//        System.out.println(itm);
//        System.out.println(itm2);

       List<ItemFactura> aux = new ArrayList<>();
        do {

            System.out.print("Introduce el código del producto: ");
            producto.setCodigo(sc.nextInt());
            sc.nextLine();

            System.out.print("Introduce el nombre del producto: ");
            producto.setNombre(sc.nextLine());

            System.out.print("Introduce el precio del producto: ");
            producto.setPrecio(sc.nextDouble());
            sc.nextLine();

            itemFactura.setProducto(producto);
            System.out.print("Introduce la cantidad de articulos de este producto: ");
            itemFactura.setCantidad(sc.nextInt());
            aux.add(itemFactura);

            System.out.print("Pulse 0 para salir o cualquier otro número para introducir un nuevo producto a esta factura: ");
            contador = sc.nextInt();
            sc.nextLine();
            itemFactura = new ItemFactura();
            producto = new Producto();

        } while (contador != 0);

        primeraFactura.setListaFacturas1(aux);
        System.out.println(primeraFactura.verDetalle());

    }
}
