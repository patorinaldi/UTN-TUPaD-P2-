    import java.util.Date;

public class Test1 {

    public static void main(String[] args) {

        Titular titular = new Titular("Juan Pérez", "12345678");
        
        Pasaporte pasaporte = new Pasaporte("AR1234567", new Date(), "foto_juan.jpg", "JPEG");
        
        pasaporte.setTitular(titular);
        
        System.out.println("=== Información del Pasaporte ===");
        System.out.println(pasaporte);
        System.out.println("\n=== Información del Titular ===");
        System.out.println(titular);
        System.out.println("Pasaporte asociado: " + titular.getPasaporte().getNumero());
        
        pasaporte.setFoto("foto_juan_nueva.png", "PNG");
        System.out.println("\n=== Después de actualizar foto ===");
        System.out.println(pasaporte.getFoto());
    }

    
}
