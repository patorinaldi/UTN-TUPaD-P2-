import java.util.Date;

public class Test8 {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Alberto Ruiz", "alberto@empresa.com");
        Usuario usuario2 = new Usuario("Carmen López", "carmen@empresa.com");
        
        Documento documento = new Documento("Informe Q4", "Contenido del informe");
        
        documento.getFirmaDigital().setCodigoHash("ABC123");
        documento.getFirmaDigital().setFecha(new Date());
        documento.getFirmaDigital().setUsuario(usuario1);
        
        System.out.println("=== Estado inicial ===");
        System.out.println(documento);
        
        System.out.println("\n=== Cambio de usuario (Agregación) ===");
        documento.getFirmaDigital().setUsuario(usuario2);
        System.out.println("Usuario original sigue existiendo: " + usuario1);
        System.out.println("Nueva configuración:");
        System.out.println(documento);
        
        System.out.println("\n=== Usuarios independientes ===");
        Usuario usuario3 = new Usuario("Ana García", "ana@empresa.com");
        System.out.println("Usuario sin firmas: " + usuario3);

    }
    
}