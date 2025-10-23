package Ecommerce;

public class Main {
    public static void main(String[] args) {

        System.out.println("╔════════════════════════════════════════════════════╗");
        System.out.println("║     SISTEMA DE E-COMMERCE - PARTE 1: Interfaces    ║");
        System.out.println("╚════════════════════════════════════════════════════╝\n");
        

        Cliente cliente = new Cliente("Juan Pérez", "juan@email.com");
        
        Producto p1 = new Producto("Laptop HP", 850.00);
        Producto p2 = new Producto("Mouse Logitech", 25.50);
        Producto p3 = new Producto("Teclado Mecánico", 120.00);
        
        Pedido pedido = new Pedido("PED-001", cliente);
        pedido.agregarProducto(p1);
        pedido.agregarProducto(p2);
        pedido.agregarProducto(p3);
        
        System.out.println(pedido);

        System.out.println();
        pedido.cambiarEstado("PROCESANDO");
        
        
        // Procesar pago con tarjeta de crédito
        System.out.println("\n--- Procesando pago con Tarjeta ---");
        TarjetaCredito tarjeta = new TarjetaCredito("1234567812345678", "Juan Pérez");
        tarjeta.aplicarDescuento(10);
        tarjeta.procesarPago(pedido.calcularTotal());
        
        System.out.println();
        pedido.cambiarEstado("ENVIADO");
        pedido.cambiarEstado("ENTREGADO");
        
        // Crear otro pedido y pagar con PayPal
        System.out.println("\n\n--- Nuevo Pedido ---");
        Cliente cliente2 = new Cliente("María García", "maria@email.com");
        Pedido pedido2 = new Pedido("PED-002", cliente2);
        pedido2.agregarProducto(new Producto("Monitor Samsung", 350.00));
        pedido2.agregarProducto(new Producto("Webcam", 75.00));
        
        System.out.println(pedido2);

        System.out.println();
        pedido2.cambiarEstado("PROCESANDO");
        
        System.out.println("\n--- Procesando pago con PayPal ---");
        PayPal paypal = new PayPal("maria@email.com");
        paypal.aplicarDescuento(5);
        paypal.procesarPago(pedido2.calcularTotal());

        System.out.println();
        pedido2.cambiarEstado("ENVIADO");
        pedido2.cambiarEstado("ENTREGADO");
        System.out.println();
    }
}