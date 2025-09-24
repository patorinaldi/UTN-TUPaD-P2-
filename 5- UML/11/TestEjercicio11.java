public class TestEjercicio11 {
    public static void main(String[] args) {

        Artista artista1 = new Artista("The Beatles", "Rock");
        Artista artista2 = new Artista("Adele", "Pop");
        
        Cancion cancion1 = new Cancion("Yesterday", artista1);
        Cancion cancion2 = new Cancion("Rolling in the Deep", artista2);
        Cancion cancion3 = new Cancion("Come Together", artista1);
        
        Reproductor reproductor = new Reproductor();
        
        System.out.println("=== Primer canción ===");
        reproductor.reproducir(cancion1);
        
        System.out.println("\n=== Segunda canción ===");
        reproductor.reproducir(cancion2);
        
        System.out.println("\n=== Tercera canción ===");
        reproductor.reproducir(cancion3);
        
        System.out.println("\n=== Asociación unidireccional ===");
        System.out.println("La canción conoce a su artista: " + cancion1.getArtista().getNombre());
        System.out.println("El artista existe independientemente");
        
        System.out.println("\n=== Dependencia de uso ===");
        System.out.println("El reproductor usa la canción como parámetro");
        System.out.println("pero no la almacena como atributo");
        
        System.out.println("\n=== Objetos independientes ===");
        Artista artistaIndependiente = new Artista("Queen", "Rock");
        System.out.println("Artista sin canciones: " + artistaIndependiente);
    }
}