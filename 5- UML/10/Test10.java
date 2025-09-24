import java.util.Date;

public class Test10 {

    public static void main(String[] args) {
        Titular titular = new Titular("Roberto Sánchez", "34567890");
        
        CuentaBancaria cuenta = new CuentaBancaria("1234567890123456789012", 15000.50);
        
        cuenta.getClaveSeguridad().setCodigo("1234");
        cuenta.getClaveSeguridad().setUltimaModificacion(new Date());
        cuenta.setTitular(titular);
        
        System.out.println("=== Estado inicial ===");
        System.out.println(cuenta);
        System.out.println("\n=== Información del Titular ===");
        System.out.println(titular);
        System.out.println("CBU de la cuenta: " + titular.getCuentaBancaria().getCbu());
        
        System.out.println("\n=== Composición ===");
        System.out.println("La cuenta contiene su clave de seguridad:");
        System.out.println(cuenta.getClaveSeguridad());
        
        System.out.println("\n=== Cambio de clave (Composición) ===");
        cuenta.getClaveSeguridad().setCodigo("5678");
        cuenta.getClaveSeguridad().setUltimaModificacion(new Date());
        System.out.println("Clave actualizada:");
        System.out.println(cuenta.getClaveSeguridad());
        
        System.out.println("\n=== Cambio de titular ===");
        Titular nuevoTitular = new Titular("Ana Morales", "45678901");
        cuenta.setTitular(nuevoTitular);
        
        System.out.println("Nuevo titular: " + cuenta.getTitular().getNombre());
        
        System.out.println("\n=== Estado final ===");
        System.out.println(cuenta);
    }
    
}