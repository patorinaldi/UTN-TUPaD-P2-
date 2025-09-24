public class Reproductor {
    
    public void reproducir(Cancion cancion) {
        System.out.println("Reproduciendo: " + cancion.getTitulo());
        if (cancion.getArtista() != null) {
            System.out.println("Artista: " + cancion.getArtista().getNombre());
            System.out.println("Género: " + cancion.getArtista().getGenero());
        }
    }
    
}