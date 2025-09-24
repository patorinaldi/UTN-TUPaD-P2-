public class Documento {
    
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital;
    
    public Documento() {}
    
    public Documento(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmaDigital = new FirmaDigital();
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getContenido() {
        return contenido;
    }
    
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
    public FirmaDigital getFirmaDigital() {
        return firmaDigital;
    }
    
    @Override
    public String toString() {
        return "Documento{" +
                "titulo='" + titulo + '\'' +
                ", contenido='" + contenido + '\'' +
                ", firmaDigital=" + firmaDigital +
                '}';
    }
}