package ac.InterfacesYGenerics.pooInterfacesRepositorio.repositorio;

import ac.InterfacesYGenerics.pooInterfacesRepositorio.modelo.Cliente;

import java.util.List;

public interface CrudRepositorio {

    List<Cliente> listar ();
    Cliente porId(Integer id);
    void crear (Cliente cliente);
    void editar (Cliente cliente);
    void eliminar (int id);

}
