package aa.clasesAbstractas;

import aa.clasesAbstractas.form.ElementoForm;
import aa.clasesAbstractas.form.InputForm;
import aa.clasesAbstractas.form.SelectForm;
import aa.clasesAbstractas.form.TextareaForm;
import aa.clasesAbstractas.form.select.Opcion;
import aa.clasesAbstractas.validador.*;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        InputForm username = new InputForm("username");
        username.addValidador(new RequeridoValidador());

        InputForm password = new InputForm("clave", "password");
        password.addValidador(new RequeridoValidador())
                .addValidador(new LargoValidador(6, 12));

        InputForm email = new InputForm("email", "email");
        email.addValidador(new RequeridoValidador())
                .addValidador(new EmailValidador());

        InputForm edad = new InputForm("edad", "number");
        edad.addValidador(new NumeroValidador());

        TextareaForm experiencia = new TextareaForm("exp", 5, 9);

        SelectForm lenguaje = new SelectForm("lenguaje");
        lenguaje.addValidador(new NoNuloValidador());

        Opcion java = new Opcion("1", "Java");
        lenguaje.addOpcion(java)
            .addOpcion(new Opcion("2", "Python"))
            .addOpcion(new Opcion("3", "JavaScript"))
            .addOpcion(new Opcion("4", "TypeScript"))
            .addOpcion(new Opcion("5", "PHP"));

        ElementoForm saludar = new ElementoForm("Saludo") {
            @Override
            public String dibujarHtml() {
                return "<input disabled name ='" + this.nombre + "' value=\"" +this.valor + "\">";
            }
        };

        saludar.setValor("Este campo está deshabilitado");
        username.setValor("borja");
        password.setValor("programa");
        email.setValor("programador@putoamo.com");
        edad.setValor("28");
        experiencia.setValor("Influmierder durante 7 años con mi propio medio de tecnología");
        java.setSelected(true);

        List< ElementoForm> elementos = Arrays.asList(username, password,
                email, edad,
                experiencia, lenguaje,
                saludar);

        elementos.forEach(e -> {
            System.out.println(e.dibujarHtml());
            System.out.println("<br>");
        });

        elementos.forEach(e -> {
            if(!e.esValido()) {
                e.getErrores().forEach(err -> System.out.println(e.getNombre() + " = " + err));
            }
        });

    }
}
