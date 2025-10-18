package CasoPractico2;

public class Libro {
    
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor;

    public void mostrarInfo() {
        System.out.println(this.toString());
    }

    public Libro() {
    }

    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    @Override
    public String toString() {
         return "================================\n" +
            "ISBN: " + isbn + "\n" +
            "Titulo: " + titulo + "\n" +
            "Año de publicación: " + anioPublicacion + "\n" +
            "Autor: " + autor.getNombre() + "\n" +
            "================================";
    }


    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    
}
