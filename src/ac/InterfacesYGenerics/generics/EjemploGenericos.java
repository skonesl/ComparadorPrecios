package ac.InterfacesYGenerics.generics;

import ac.InterfacesYGenerics.pooInterfacesRepositorio.modelo.Cliente;
import ac.InterfacesYGenerics.pooInterfacesRepositorio.modelo.ClientePremium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploGenericos {
    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Borja", "Vivas"));

        Cliente andres = clientes.iterator().next();

        Cliente [] clientesArreglo = {new Cliente("Celia", "Vivas"), new Cliente("Dori", "Marquina")};
        Integer [] enterosArreglo = {1, 2, 3};

        List <Cliente> clientesLista = fromArrayToList(clientesArreglo);
        List <Integer> enterosLista = fromArrayToList(enterosArreglo);

        clientesLista.forEach(System.out::println);
        enterosLista.forEach(System.out::println);

        List <String> nombres = fromArrayToList(new String [] {"Dskarrila", "System of a Down", "Desakato"}, enterosArreglo);

        List <ClientePremium> grupos = fromArrayToList(new ClientePremium[]{new ClientePremium("Laura", "Dsk")});

        imprimirClientes(grupos);
        imprimirClientes(clientesLista);

        System.out.println("Maximo de 1, 9 y 4 es: " + maximo(1, 9, 4));
        System.out.println("Maximo de 3.9 , 11.6, 7.78 es: " + maximo(3.9, 11.6, 7.78));
        System.out.println("Maximo de zanahoria, arándanos y manzana es: " + maximo("zanahoria", "arándanos", "manzana"));

    }

    public static <T> List <T> fromArrayToList (T[] c) {
        return Arrays.asList(c);
    }

    public static <T extends Number> List <T> fromArrayToList (T[] c) {
        return Arrays.asList(c);
    }

    public static <T extends Cliente> List <T> fromArrayToList (T[] c) {
        return Arrays.asList(c);
    }

    public static <T, G> List <T> fromArrayToList (T[] c, G[] x) {

        for (G elemento: x) {
            System.out.println(elemento);
        }
        return Arrays.asList(c);
    }

    public static void imprimirClientes (List <? extends Cliente> clientes) {
        clientes.forEach(System.out::println);
    }

    public static <T extends Comparable<T>> T maximo (T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

}
