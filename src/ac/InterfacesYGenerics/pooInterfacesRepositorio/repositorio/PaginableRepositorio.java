package ac.InterfacesYGenerics.pooInterfacesRepositorio.repositorio;

import ac.InterfacesYGenerics.pooInterfacesRepositorio.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio {

    List<Cliente> listar (int desde, int hasta);

}
