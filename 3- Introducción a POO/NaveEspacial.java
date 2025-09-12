import java.util.Scanner;

public class NaveEspacial {
    
    private String nombre;
    private double combustible;
    private final double COMBUSTIBLE_MAXIMO = 100.0;
    private Scanner scanner = new Scanner(System.in);
    
    public void solicitarDatos() {
        System.out.print("Ingrese el nombre de la nave: ");
        nombre = scanner.nextLine();
        
        System.out.print("Ingrese el combustible inicial: ");
        combustible = Double.parseDouble(scanner.nextLine());
        
        if (combustible > COMBUSTIBLE_MAXIMO) {
            combustible = COMBUSTIBLE_MAXIMO;
            System.out.println("Combustible ajustado al limite maximo: " + COMBUSTIBLE_MAXIMO);
        }
    }
    
    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println(nombre + " ha despegado. Combustible restante: " + combustible);
        } else {
            System.out.println("Error: No hay suficiente combustible para despegar (necesita 10 unidades)");
        }
    }
    
    public void avanzar(double distancia) {
        double combustibleNecesario = distancia * 2;
        
        if (combustible >= combustibleNecesario) {
            combustible -= combustibleNecesario;
            System.out.println(nombre + " avanzo " + distancia + " km. Combustible restante: " + combustible);
        } else {
            System.out.println("Error: No hay suficiente combustible para avanzar " + distancia + " km (necesita " + combustibleNecesario + " unidades)");
        }
    }
    
    public void recargarCombustible(double cantidad) {
        if (combustible + cantidad > COMBUSTIBLE_MAXIMO) {
            double exceso = (combustible + cantidad) - COMBUSTIBLE_MAXIMO;
            combustible = COMBUSTIBLE_MAXIMO;
            System.out.println("Recarga parcial. Tanque lleno. Se desperdiciaron " + exceso + " unidades");
        } else {
            combustible += cantidad;
            System.out.println("Combustible recargado. Nivel actual: " + combustible);
        }
    }
    
    public void mostrarEstado() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Combustible: " + combustible + "/" + COMBUSTIBLE_MAXIMO);
    }
    
    public static void main(String[] args) {
        NaveEspacial nave = new NaveEspacial();
        
        nave.solicitarDatos();
        
        System.out.println("\nEstado inicial:");
        nave.mostrarEstado();
        
        System.out.println("\nIntentando avanzar sin recargar:");
        nave.avanzar(30);
        
        System.out.println("\nRecargando combustible:");
        nave.recargarCombustible(40);
        
        System.out.println("\nDespegando:");
        nave.despegar();
        
        System.out.println("\nAvanzando correctamente:");
        nave.avanzar(15);
        
        System.out.println("\nEstado final:");
        nave.mostrarEstado();
    }
}