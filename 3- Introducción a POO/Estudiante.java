import java.util.Scanner;

public class Estudiante {
    
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;
    private Scanner scanner = new Scanner(System.in);
    
    public void solicitarDatos() {
        System.out.print("Ingrese el nombre del estudiante: ");
        nombre = scanner.nextLine();
        
        System.out.print("Ingrese el apellido del estudiante: ");
        apellido = scanner.nextLine();
        
        System.out.print("Ingrese el curso del estudiante: ");
        curso = scanner.nextLine();
        
        System.out.print("Ingrese la calificacion del estudiante: ");
        calificacion = Double.parseDouble(scanner.nextLine());
    }
    
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificacion: " + calificacion);
    }
    
    public void subirCalificacion(double puntos) {
        calificacion += puntos;
        System.out.println("\nCalificacion aumentada en " + puntos + " puntos.");
    }
    
    public void bajarCalificacion(double puntos) {
        calificacion -= puntos;
        System.out.println("\nCalificacion reducida en " + puntos + " puntos.");
    }
    
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        
        estudiante.solicitarDatos();
        
        System.out.println("\nInformacion inicial:");
        estudiante.mostrarInfo();
        
        estudiante.subirCalificacion(2.5);
        System.out.println("\nDespues de aumentar calificacion:");
        estudiante.mostrarInfo();
        
        estudiante.bajarCalificacion(1.0);
        System.out.println("\nDespues de disminuir calificacion:");
        estudiante.mostrarInfo();
    }
}