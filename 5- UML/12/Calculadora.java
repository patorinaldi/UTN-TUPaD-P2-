public class Calculadora {
    
    public void calcular(Impuesto impuesto) {
        System.out.println("=== CALCULANDO IMPUESTO ===");
        System.out.println("Monto base: $" + impuesto.getMonto());
        
        if (impuesto.getContribuyente() != null) {
            System.out.println("Contribuyente: " + impuesto.getContribuyente().getNombre());
            System.out.println("CUIL: " + impuesto.getContribuyente().getCuil());
        }
        
        double iva = impuesto.getMonto() * 0.21;
        double ganancias = impuesto.getMonto() * 0.35;
        double total = impuesto.getMonto() + iva + ganancias;
        
        System.out.println("IVA (21%): $" + iva);
        System.out.println("Ganancias (35%): $" + ganancias);
        System.out.println("TOTAL A PAGAR: $" + total);
        System.out.println("========================");
    }
    
}