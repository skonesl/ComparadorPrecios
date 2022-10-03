package aa.clasesAbstractas.validador;

public class EmailValidador extends Validador{

    protected String mensaje = "El formato del Email no es válido";
    private final static String EMAIL_REGEX ="ˆ(.+)@(.+)$";

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
        return valor.matches(EMAIL_REGEX);
    }
}
