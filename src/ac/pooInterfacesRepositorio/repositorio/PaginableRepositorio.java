package ac.pooInterfacesRepositorio.repositorio;

import ac.pooInterfacesRepositorio.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio {

    List<Cliente> listar (int desde, int hasta);

}
