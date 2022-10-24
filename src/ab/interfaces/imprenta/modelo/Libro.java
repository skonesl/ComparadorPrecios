package ab.interfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Imprimible{

    private List<Hoja> paginas;
    private Persona autor;
    private String titulo;
    private Genero genero;

    public Libro(Persona autor, String titulo, Genero genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.paginas = new ArrayList<>();
    }

    public Libro addPagina (Hoja pagina) {
        paginas.add(pagina);
        return this;
    }
    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("Titulo: ");
        sb.append(this.titulo).append("\n")
                .append("Autor: ").append(this.autor.toString()).append("\n")
                .append("Genero: ").append(genero).append("\n");
        for(Hoja pag: this.paginas) {
            sb.append(pag.imprimir()).append("\n");
        }
        return sb.toString();
    }
}
