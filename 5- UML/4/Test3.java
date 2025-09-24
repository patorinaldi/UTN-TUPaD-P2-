import java.util.Date;
import java.util.Calendar;

public class Test3 {
    
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(2028, Calendar.DECEMBER, 31);
        Date fechaVencimiento = cal.getTime();
        
        Cliente cliente = new Cliente("Ana López", "11223344");
        Banco banco1 = new Banco("Banco Nación", "30-12345678-9");
        Banco banco2 = new Banco("Banco Galicia", "30-87654321-0");
        
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1234-5678-9012-3456", fechaVencimiento, banco1);
        
        tarjeta.setCliente(cliente);
        
        System.out.println("=== Estado inicial ===");
        System.out.println(tarjeta);
        System.out.println("\n=== Información del Cliente ===");
        System.out.println(cliente);
        System.out.println("Tarjeta del cliente: " + cliente.getTarjetaDeCredito().getNumero());
        
        System.out.println("\n=== Cambiar de banco (Agregación) ===");
        tarjeta.setBanco(banco2);
        
        System.out.println("Banco original sigue existiendo: " + banco1);
        System.out.println("Nueva configuración:");
        System.out.println(tarjeta);
        
        System.out.println("\n=== Objetos independientes ===");
        Banco bancoIndependiente = new Banco("Banco Macro", "30-11111111-1");
        System.out.println("Banco que existe sin tarjetas: " + bancoIndependiente);
    }
}
