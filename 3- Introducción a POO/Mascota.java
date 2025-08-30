import java.util.Scanner;

public class Mascota {
    
    private String nombre;
    private String especie;
    private int edad;
    private Scanner scanner = new Scanner(System.in);
    
    public void solicitarDatos() {
        System.out.print("Ingrese el nombre de la mascota: ");
        nombre = scanner.nextLine();
        
        System.out.print("Ingrese la especie de la mascota: ");
        especie = scanner.nextLine();
        
        System.out.print("Ingrese la edad de la mascota: ");
        edad = Integer.parseInt(scanner.nextLine());
    }
    
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
    }
    
    public void cumplirAnios() {
        edad++;
        System.out.println(nombre + " ha cumplido años. Nueva edad: " + edad);
    }
    
    public static void main(String[] args) {
        Mascota mascota = new Mascota();
        
        mascota.solicitarDatos();
        
        System.out.println("\nInformacion inicial de la mascota:");
        mascota.mostrarInfo();
        
        System.out.println("\nSimulando el paso del tiempo...");
        mascota.cumplirAnios();
        
        System.out.println("\nInformacion actualizada:");
        mascota.mostrarInfo();
    }
}