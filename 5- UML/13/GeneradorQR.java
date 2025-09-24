public class GeneradorQR {
    
    public void generar(String valor, Usuario usuario) {
        System.out.println("=== GENERANDO CÓDIGO QR ===");
        System.out.println("Valor a codificar: " + valor);
        
        if (usuario != null) {
            System.out.println("Usuario: " + usuario.getNombre());
            System.out.println("Email: " + usuario.getEmail());
        }
        
        CodigoQR codigoQR = new CodigoQR(valor, usuario);
        
        System.out.println("Procesando...");
        System.out.println("█████████████████████");
        System.out.println("█ ▄▄▄▄▄ █▀█ █ ▄▄▄▄▄ █");
        System.out.println("█ █   █ █▀▀ █ █   █ █");
        System.out.println("█ █▄▄▄█ █▀█ █ █▄▄▄█ █");
        System.out.println("█▄▄▄▄▄▄▄█▄█▄█▄▄▄▄▄▄▄█");
        System.out.println("█████████████████████");
        
        System.out.println("Código QR generado exitosamente!");
        System.out.println("Detalles: " + codigoQR);
        System.out.println("=======================");
    }
}