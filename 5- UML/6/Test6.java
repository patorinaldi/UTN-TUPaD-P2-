import java.util.Date;
import java.util.Calendar;

public class Test6 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(2024, Calendar.DECEMBER, 25);
        Date fechaReserva = cal.getTime();
        
        Cliente cliente1 = new Cliente("Roberto Silva", "11-2345-6789");
        Cliente cliente2 = new Cliente("Patricia Ruiz", "11-9876-5432");
        
        Mesa mesa1 = new Mesa(5, 4);
        Mesa mesa2 = new Mesa(12, 8);
        Mesa mesa3 = new Mesa(20, 2);
        
        Reserva reserva1 = new Reserva(fechaReserva, "20:30", cliente1, mesa1);
        
        System.out.println("=== Reserva inicial ===");
        System.out.println(reserva1.toString());
        
        System.out.println("\n=== Asociación unidireccional ===");
        System.out.println("La reserva conoce al cliente: " + reserva1.getCliente().getNombre());
        System.out.println("El cliente existe independientemente de la reserva");
        
        Reserva reserva2 = new Reserva(fechaReserva, "21:00", cliente1, mesa2);
        System.out.println("Nueva reserva del mismo cliente: " + reserva2);
        
        System.out.println("\n=== Cambio de mesa (Agregación) ===");
        reserva1.setMesa(mesa3);
        System.out.println("Después del cambio:");
        System.out.println(reserva1.toString());
        
        System.out.println("La mesa original sigue disponible: " + mesa1);
        
        System.out.println("\n=== Objetos independientes ===");
        System.out.println("Cliente independiente: " + cliente2);
        System.out.println("Mesa sin reserva: " + mesa2);
        
        Reserva reservaIncompleta = new Reserva(fechaReserva, "19:00");
        System.out.println("Reserva sin cliente ni mesa: " + reservaIncompleta);
    }
}
