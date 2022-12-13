package ac.InterfacesYGenerics.pooInterfacesRepositorio.repositorio;

import ac.InterfacesYGenerics.pooInterfacesRepositorio.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {

    List<Cliente> listar(String campo, Direccion dir);


}
