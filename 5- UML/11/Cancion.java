public class Cancion {

    private String titulo;
    private Artista artista;
    
    public Cancion() {}
    
    public Cancion(String titulo, Artista artista) {
        this.titulo = titulo;
        this.artista = artista;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public Artista getArtista() {
        return artista;
    }
    
    public void setArtista(Artista artista) {
        this.artista = artista;
    }
    
    @Override
    public String toString() {
        return "Cancion{titulo='" + titulo + "', artista=" + 
               (artista != null ? artista.getNombre() : "null") + '}';
    }
    
}