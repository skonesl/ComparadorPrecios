package ac.pooInterfacesRepositorio.repositorio;

import ac.pooInterfacesRepositorio.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {

    List<Cliente> listar(String campo, Direccion dir);


}
