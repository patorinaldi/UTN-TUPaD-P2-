import java.util.Scanner;

public class Gallina {
    
    private String idGallina;
    private int edad;
    private int huevosPuestos;
    private Scanner scanner = new Scanner(System.in);
    
    public void solicitarDatos() {
        System.out.print("Ingrese el ID de la gallina: ");
        idGallina = scanner.nextLine();
        
        System.out.print("Ingrese la edad de la gallina: ");
        edad = Integer.parseInt(scanner.nextLine());
        
        System.out.print("Ingrese los huevos puestos inicialmente: ");
        huevosPuestos = Integer.parseInt(scanner.nextLine());
    }
    
    public void ponerHuevo() {
        huevosPuestos++;
        System.out.println("La gallina " + idGallina + " puso un huevo. Total: " + huevosPuestos);
    }
    
    public void envejecer() {
        edad++;
        System.out.println("La gallina " + idGallina + " envejecio. Nueva edad: " + edad + " años");
    }
    
    public void mostrarEstado() {
        System.out.println("ID: " + idGallina);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Huevos puestos: " + huevosPuestos);
    }
    
    public static void main(String[] args) {
        Gallina gallina1 = new Gallina();
        Gallina gallina2 = new Gallina();
        
        System.out.println("=== GALLINA 1 ===");
        gallina1.solicitarDatos();
        
        System.out.println("\n=== GALLINA 2 ===");
        gallina2.solicitarDatos();
        
        System.out.println("\n=== SIMULANDO ACCIONES ===");
        
        System.out.println("\nAcciones de la Gallina 1:");
        gallina1.envejecer();
        gallina1.ponerHuevo();
        gallina1.ponerHuevo();
        
        System.out.println("\nAcciones de la Gallina 2:");
        gallina2.envejecer();
        gallina2.ponerHuevo();
        
        System.out.println("\n=== ESTADO FINAL ===");
        
        System.out.println("\nEstado de la Gallina 1:");
        gallina1.mostrarEstado();
        
        System.out.println("\nEstado de la Gallina 2:");
        gallina2.mostrarEstado();
    }
}