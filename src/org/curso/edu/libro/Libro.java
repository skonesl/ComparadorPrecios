package org.curso.edu.libro;

public class Libro {

    private String titulo;
    private String autor;
    private int numEjemplares;
    private int numPrestados;

    public Libro() {
    }

    public Libro(String titulo, String autor, int numEjemplares, int numPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numEjemplares = numEjemplares;
        this.numPrestados = numPrestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    public int getNumPrestados() {
        return numPrestados;
    }

    public void setNumPrestados(int numPrestados) {
        this.numPrestados = numPrestados;
    }

    public boolean prestamo () {

        boolean disponible;

        if (numEjemplares > 0 && numEjemplares > numPrestados) {
            if (numEjemplares >= numPrestados) {
                disponible = true;
                numPrestados++;
            } else {
                disponible = false;
            }
        } else {
            disponible = false;
        }

        return disponible;
    }

    public boolean devolucion () {

        boolean disponible;

        if (numEjemplares > 0) {
            if (numEjemplares >= numPrestados) {
                disponible = true;
                numPrestados--;
            } else {
                disponible = false;
            }
        } else {
            disponible = false;
        }

        return disponible;

    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numEjemplares=" + numEjemplares +
                ", numPrestados=" + numPrestados +
                '}';
    }
}
