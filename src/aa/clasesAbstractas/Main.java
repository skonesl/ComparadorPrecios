package aa.clasesAbstractas;

import aa.clasesAbstractas.form.ElementoForm;
import aa.clasesAbstractas.form.InputForm;
import aa.clasesAbstractas.form.SelectForm;
import aa.clasesAbstractas.form.TextareaForm;
import aa.clasesAbstractas.form.select.Opcion;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        InputForm username = new InputForm("username");
        InputForm password = new InputForm("clave", "password");
        InputForm email = new InputForm("email", "email");
        InputForm edad = new InputForm("edad", "number");

        TextareaForm experiencia = new TextareaForm("exp", 5, 9);

        SelectForm lenguaje = new SelectForm("lenguaje");
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
        password.setValor("programador");
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

    }
}
