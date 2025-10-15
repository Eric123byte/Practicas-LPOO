
package practica8_colecciones;

public class Libro2608 implements Comparable<Libro2608>{
    
    private String titulo;
    private String autor;
    private String genero;
    private String editorial;

    public Libro2608(String titulo, String autor, String genero, String editorial) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.editorial = editorial;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    
    @Override
    public int compareTo(Libro2608 libro) {
        return this.titulo.compareTo(libro.titulo);
    }
    
    @Override
    public String toString(){
        return "\nTitulo: " + titulo +
                "\nAutor: " + autor +
                "\nGenero: " + genero +
                "\nEditorial: " + editorial;
    }
    
}
