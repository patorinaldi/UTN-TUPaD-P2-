public class Test13 {

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Carlos Mendoza", "carlos@empresa.com");
        Usuario usuario2 = new Usuario("Ana García", "ana@empresa.com");
        
        GeneradorQR generador = new GeneradorQR();
        
        System.out.println("=== Primera generación ===");
        generador.generar("https://www.empresa.com/perfil/carlos", usuario1);
        
        System.out.println("\n=== Segunda generación ===");
        generador.generar("Contacto: Ana García - ana@empresa.com", usuario2);
        
        System.out.println("\n=== Tercera generación ===");
        generador.generar("Evento: Conferencia Tech 2024", usuario1);
        
        System.out.println("\n=== Dependencia de creación ===");
        System.out.println("El generador crea códigos QR dentro del método");
        System.out.println("pero no los conserva como atributos");
        
        System.out.println("\n=== Objetos independientes ===");
        Usuario usuarioIndependiente = new Usuario("Roberto Silva", "roberto@empresa.com");
        System.out.println("Usuario sin códigos QR: " + usuarioIndependiente);
        
        CodigoQR codigoIndependiente = new CodigoQR("Texto independiente", null);
        System.out.println("Código QR sin usuario: " + codigoIndependiente);
    }

}