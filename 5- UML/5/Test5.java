public class Test5 { 

    public static void main(String[] args) {
        Propietario propietario = new Propietario("Carlos Mendoza", "22334455");
        
        Computadora computadora = new Computadora("Dell", "DL123456789", "ASUS Prime B450M", "AMD B450");
        
        computadora.setPropietario(propietario);
        
        System.out.println("=== Estado inicial ===");
        System.out.println(computadora);
        System.out.println("\n=== Información del Propietario ===");
        System.out.println(propietario);
        System.out.println("Computadora del propietario: " + propietario.getComputadora().getMarca());
        
        System.out.println("\n=== Actualización de PlacaMadre (Composición) ===");
        computadora.setPlacaMadre("MSI B550M Pro", "AMD B550");
        System.out.println("Después de actualizar:");
        System.out.println(computadora.getPlacaMadre());
        
        System.out.println("\n=== Cambio de propietario ===");
        Propietario nuevoPropietario = new Propietario("Laura Torres", "33445566");
        computadora.setPropietario(nuevoPropietario);
        
        System.out.println("Nuevo propietario: " + computadora.getPropietario().getNombre());
        System.out.println("Propietario anterior ya no tiene computadora: " + 
            (propietario.getComputadora() == null ? "correcto" : "error"));
        
        System.out.println("\n=== Estado final ===");
        System.out.println(computadora);
    }
    
}