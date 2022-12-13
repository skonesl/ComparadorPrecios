package ac.InterfacesYGenerics.pooInterfacesRepositorio;

import ac.InterfacesYGenerics.pooInterfacesRepositorio.modelo.Cliente;
import ac.InterfacesYGenerics.pooInterfacesRepositorio.repositorio.ClienteListRepositorio;
import ac.InterfacesYGenerics.pooInterfacesRepositorio.repositorio.Direccion;
import ac.InterfacesYGenerics.pooInterfacesRepositorio.repositorio.OrdenablePaginableCrudRepositorio;
import ac.InterfacesYGenerics.pooInterfacesRepositorio.repositorio.*;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {

        OrdenablePaginableCrudRepositorio repo = new ClienteListRepositorio();
        repo.crear(new Cliente("Borja", "Vivas"));
        repo.crear(new Cliente("Celia", "Marquina"));
        repo.crear(new Cliente("Nekkane", "García"));
        repo.crear(new Cliente("Laura", "Ruiz"));

        List<Cliente> clientes = repo.listar();
        clientes.forEach(System.out::println);

        System.out.println("\n===== Paginable =====");
        List <Cliente> paginable = repo.listar(1, 3);
        paginable.forEach(System.out::println);

        System.out.println("\n===== Ordenar =====");
        List <Cliente> clientesOrden = repo.listar("nombre", Direccion.ASC);
        for(Cliente c : clientesOrden) {
            System.out.println(c);
        }

        System.out.println("\n===== Editar =====");
        Cliente actualizar = new Cliente ("Claudia", "López");
        actualizar.setId(3);
        repo.editar(actualizar);

        repo.listar("nombre", Direccion.ASC).forEach(System.out::println);

        System.out.println("\n===== Eliminar =====");
        repo.eliminar(1);
        repo.listar().forEach(System.out::println);

        System.out.println("\n===== Total =====");
        System.out.println("Total de registros: " + repo.total());


    }
}
