package zz.PracticasUdemy.z10.udemy.tarea21.personaEmpresa;

public class Cliente extends Persona{

    private int clienteId;

    public Cliente(int clienteId) {
        this.clienteId = clienteId;
    }

    public Cliente(String nombre, String apellido, String numFiscal, String direccion, int clienteId) {
        super(nombre, apellido, numFiscal, direccion);
        this.clienteId = clienteId;
    }

    public int getClienteId() {
        return clienteId;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "clienteId=" + clienteId +
                '}';
    }
}
