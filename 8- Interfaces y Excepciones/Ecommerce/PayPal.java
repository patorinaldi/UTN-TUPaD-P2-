package Ecommerce;

public class PayPal implements PagoConDescuento {
    
    private String email;
    private double descuentoAplicado;
    
    public PayPal(String email) {
        this.email = email;
        this.descuentoAplicado = 0;
    }
    
    @Override
    public void aplicarDescuento(double porcentaje) {
        this.descuentoAplicado = porcentaje;
        System.out.println("Descuento del " + porcentaje + "% aplicado a cuenta PayPal " + email);
    }
    
    @Override
    public void procesarPago(double monto) {
        double montoFinal = monto - (monto * descuentoAplicado / 100);
        System.out.println("\nProcesando pago con PayPal:");
        System.out.println("   Cuenta: " + email);
        if (descuentoAplicado > 0) {
            System.out.println("   Monto original: $" + String.format("%.2f", monto));
            System.out.println("   Descuento: " + descuentoAplicado + "%");
        }
        System.out.println("   Monto a pagar: $" + String.format("%.2f", montoFinal));
        System.out.println("   Pago procesado exitosamente");
    }
    
    public String getEmail() {
        return email;
    }
}