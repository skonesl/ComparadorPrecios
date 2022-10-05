package aa.clasesAbstractas.validador;

public class RequeridoValidador extends Validador{

    protected String mensaje ="El campo %s es obligatorio";

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        return (valor != null && valor.length() > 0);
    }
}
