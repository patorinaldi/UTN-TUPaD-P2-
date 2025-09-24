public class Libro {
    
    private String titulo;
    private String isbn;
    private Autor autor;
    private Editorial editorial;
    
    public Libro() {}
    
    public Libro(String titulo, String isbn) {
        this.titulo = titulo;
        this.isbn = isbn;
    }
    
    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
    }
    
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getIsbn() {
        return isbn;
    }
    
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    public Autor getAutor() {
        return autor;
    }
    
    
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
    public Editorial getEditorial() {
        return editorial;
    }
    
    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
    
    public void cambiarEditorial(Editorial nuevaEditorial) {
        this.editorial = nuevaEditorial;
        System.out.println("El libro '" + titulo + "' ahora es publicado por: " + nuevaEditorial.getNombre());
    }
    
    public String getInformacionCompleta() {
        StringBuilder info = new StringBuilder();
        info.append("Libro: ").append(titulo);
        info.append(" (ISBN: ").append(isbn).append(")");
        
        if (autor != null) {
            info.append("\nAutor: ").append(autor.getNombre());
            info.append(" (").append(autor.getNacionalidad()).append(")");
        }
        
        if (editorial != null) {
            info.append("\nEditorial: ").append(editorial.getNombre());
        }
        
        return info.toString();
    }
    
    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", isbn='" + isbn + '\'' +
                ", autor=" + (autor != null ? autor.getNombre() : "null") +
                ", editorial=" + (editorial != null ? editorial.getNombre() : "null") +
                '}';
    }
}
