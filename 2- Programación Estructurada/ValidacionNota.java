import java.util.Scanner;

public class ValidacionNota {
   
    private int nota;
    private Scanner scanner = new Scanner(System.in);
    
    public void leerNota() {
        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = Integer.parseInt(scanner.nextLine());
            
            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
            
        } while (nota < 0 || nota > 10);
    }
    
    public void imprimirResultado() {
        System.out.println("Nota guardada correctamente.");
    }
    
    public static void main(String[] args) {
        ValidacionNota validacion = new ValidacionNota();
        validacion.leerNota();
        validacion.imprimirResultado();
    }
}