import java.util.Scanner;

public class GestorStock {
   
    private int stockActual;
    private int cantidadVendida;
    private int cantidadRecibida;
    private Scanner scanner = new Scanner(System.in);
    
    public int solicitarStockActual() {
        System.out.print("Ingrese el stock actual del producto: ");
        return Integer.parseInt(scanner.nextLine());
    }
    
    public int solicitarCantidadVendida() {
        System.out.print("Ingrese la cantidad vendida: ");
        return Integer.parseInt(scanner.nextLine());
    }
    
    public int solicitarCantidadRecibida() {
        System.out.print("Ingrese la cantidad recibida: ");
        return Integer.parseInt(scanner.nextLine());
    }
    
    public int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        int nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
        return nuevoStock;
    }
    
    public void mostrarResultado(int nuevoStock) {
        System.out.println("El nuevo stock del producto es: " + nuevoStock);
    }
    
    public static void main(String[] args) {
        GestorStock gestor = new GestorStock();
        
        gestor.stockActual = gestor.solicitarStockActual();
        gestor.cantidadVendida = gestor.solicitarCantidadVendida();
        gestor.cantidadRecibida = gestor.solicitarCantidadRecibida();
        
        int stockActualizado = gestor.actualizarStock(gestor.stockActual, 
                                                      gestor.cantidadVendida, 
                                                      gestor.cantidadRecibida);
        
        gestor.mostrarResultado(stockActualizado);
    }
}