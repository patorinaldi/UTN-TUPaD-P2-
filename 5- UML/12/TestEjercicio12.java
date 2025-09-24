public class TestEjercicio12 {
    public static void main(String[] args) {

        Contribuyente contribuyente1 = new Contribuyente("Empresa ABC S.A.", "30-12345678-9");
        Contribuyente contribuyente2 = new Contribuyente("Juan Rodríguez", "20-87654321-0");
        
        Impuesto impuesto1 = new Impuesto(10000.0, contribuyente1);
        Impuesto impuesto2 = new Impuesto(5000.0, contribuyente2);
        Impuesto impuesto3 = new Impuesto(15000.0, contribuyente1);
        
        Calculadora calculadora = new Calculadora();
        
        System.out.println("=== Primer cálculo ===");
        calculadora.calcular(impuesto1);
        
        System.out.println("\n=== Segundo cálculo ===");
        calculadora.calcular(impuesto2);
        
        System.out.println("\n=== Tercer cálculo ===");
        calculadora.calcular(impuesto3);
        
    }
    
}