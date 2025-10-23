package Ecommerce;

public class TarjetaCredito implements PagoConDescuento {

    private String numero;
    private String titular;
    private double descuentoAplicado;
    
    public TarjetaCredito(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.descuentoAplicado = 0;
    }
    
    @Override
    public void aplicarDescuento(double porcentaje) {
        this.descuentoAplicado = porcentaje;
        System.out.println("Descuento del " + porcentaje + "% aplicado a tarjeta " + 
            numero.substring(numero.length() - 4));
    }
    
    @Override
    public void procesarPago(double monto) {
        double montoFinal = monto - (monto * descuentoAplicado / 100);
        System.out.println("\nProcesando pago con Tarjeta de Crédito:");
        System.out.println("   Titular: " + titular);
        System.out.println("   Tarjeta: **** **** **** " + numero.substring(numero.length() - 4));
        if (descuentoAplicado > 0) {
            System.out.println("   Monto original: $" + String.format("%.2f", monto));
            System.out.println("   Descuento: " + descuentoAplicado + "%");
        }
        System.out.println("   Monto a pagar: $" + String.format("%.2f", montoFinal));
        System.out.println("   Pago procesado exitosamente");
    }
    
    public String getNumero() {
        return numero;
    }
    
    public String getTitular() {
        return titular;
    }
}