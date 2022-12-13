package ac.InterfacesYGenerics.pooInterfacesRepositorio.repositorio;

import ac.InterfacesYGenerics.pooInterfacesRepositorio.modelo.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteListRepositorio implements OrdenablePaginableCrudRepositorio {

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
            if (cli.getId() !=null && cli.getId().equals(id)) {
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
        c.setApellido(cliente.getApellido());
    }

    @Override
    public void eliminar(int id) {
        this.dataSource.remove(this.porId(id));
    }

    @Override
    public List<Cliente> listar(String campo, Direccion dir) {

        List <Cliente> listaOrdenada = new ArrayList<>(this.dataSource);
        dataSource.sort((a, b) -> {
            int result = 0;
            if (dir == Direccion.ASC) {
                switch (campo)  {
                    case "id" ->
                            result = a.getId().compareTo(b.getId());
                    case "nombre" ->
                        result = a.getNombre().compareTo(b.getNombre());
                    case "apellido" ->
                        result = a.getApellido().compareTo(b.getApellido());
                }
            } else if (dir == Direccion.DESC) {
                switch (campo)  {
                    case "id" ->
                            result = b.getId().compareTo(a.getId());
                    case "nombre" ->
                            result = b.getNombre().compareTo(a.getNombre());
                    case "apellido" ->
                            result = b.getApellido().compareTo(a.getApellido());
                }
            }
            return  result;
        });
        return listaOrdenada;
    }

    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }

    @Override
    public int total() {
        return this.dataSource.size();
    }
}
