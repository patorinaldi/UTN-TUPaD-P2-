import java.util.Scanner;

public class CalculadoraPrecioFinal {
   
    private double precioBase;
    private Scanner scanner = new Scanner(System.in);
    
    public double solicitarPrecioBase() {
        System.out.print("Ingrese el precio base del producto: ");
        return Double.parseDouble(scanner.nextLine());
    }
    
    public double solicitarPorcentajeImpuesto() {
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        return Double.parseDouble(scanner.nextLine());
    }
    
    public double solicitarPorcentajeDescuento() {
        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        return Double.parseDouble(scanner.nextLine());
    }
    
    public double calcularPrecioFinal(double impuesto, double descuento) {

        double impuestoDecimal = impuesto / 100.0;
        double descuentoDecimal = descuento / 100.0;
        
        double precioFinal = precioBase + (precioBase * impuestoDecimal) - (precioBase * descuentoDecimal);
        
        return precioFinal;
    }
    
    public static void main(String[] args) {
        CalculadoraPrecioFinal calculadora = new CalculadoraPrecioFinal();
        
        calculadora.precioBase = calculadora.solicitarPrecioBase();
        
        double porcentajeImpuesto = calculadora.solicitarPorcentajeImpuesto();
        
        double porcentajeDescuento = calculadora.solicitarPorcentajeDescuento();
        
        double precioFinal = calculadora.calcularPrecioFinal(porcentajeImpuesto, porcentajeDescuento);
        
        System.out.println("El precio final del producto es: " + precioFinal);
    }
}