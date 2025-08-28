import java.util.Scanner;

public class CalculadoraEnvio {
   
    private double precioProducto;
    private double peso;
    private String zona;
    private Scanner scanner = new Scanner(System.in);
    
    public double solicitarPrecioProducto() {
        System.out.print("Ingrese el precio del producto: ");
        return Double.parseDouble(scanner.nextLine());
    }
    
    public double solicitarPeso() {
        System.out.print("Ingrese el peso del paquete en kg: ");
        return Double.parseDouble(scanner.nextLine());
    }

    public String solicitarZona() {
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        return scanner.nextLine();
    }
    
    public double calcularCostoEnvio(double peso, String zona) {
        double costoPorKg;
        
        if (zona.equalsIgnoreCase("Nacional")) {
            costoPorKg = 5.0; // $5 por kg
        } else if (zona.equalsIgnoreCase("Internacional")) {
            costoPorKg = 10.0; // $10 por kg
        } else {
            costoPorKg = 0.0; // Zona inválida
        }
        
        return peso * costoPorKg;
    }

    public double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
    
    public void mostrarResultados(double costoEnvio, double totalCompra) {
        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + totalCompra);
    }
    
    public static void main(String[] args) {
        CalculadoraEnvio calculadora = new CalculadoraEnvio();
        
        calculadora.precioProducto = calculadora.solicitarPrecioProducto();
        
        calculadora.peso = calculadora.solicitarPeso();
        
        calculadora.zona = calculadora.solicitarZona();
        
        double costoEnvio = calculadora.calcularCostoEnvio(calculadora.peso, calculadora.zona);
        
        double totalCompra = calculadora.calcularTotalCompra(calculadora.precioProducto, costoEnvio);
        
        calculadora.mostrarResultados(costoEnvio, totalCompra);
    }
}