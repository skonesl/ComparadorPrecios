package ac.pooInterfacesRepositorio.repositorio;

import ac.pooInterfacesRepositorio.modelo.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteListRepositorio implements CrudRepositorio, OrdenableRepositorio, PaginableRepositorio{

    private List <Cliente> dataSource;

    public ClienteListRepositorio() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<Cliente> listar() {
        return dataSource;
    }

    @Override
    public Cliente porId(Integer id) {

        Cliente resultado = null;
        for (Cliente cli: dataSource) {
            if (cli.getId() == id) {
                resultado = cli;
                break;
            }
        }
        return resultado;
    }

    @Override
    public void crear(Cliente cliente) {
        this.dataSource.add(cliente);
    }

    @Override
    public void editar(Cliente cliente) {
        Cliente c = this.porId(cliente.getId());
        c.setNombre(cliente.getNombre());
        c.setNombre(cliente.getApellido());
    }

    @Override
    public void eliminar(int id) {
        this.dataSource.remove(this.porId(id));
    }

    @Override
    public List<Cliente> listar(String campo, Direccion dir) {
        return null;
    }

    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return null;
    }
}
