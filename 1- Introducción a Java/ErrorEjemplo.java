import java.util.Scanner;

public class ErrorEjemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine(); // ERROR
        System.out.println("Hola, " + nombre);
    }
}

/* El error que contenia era que se llamaba a la función nextInt que nos devuelve un int 
 * pero intentabamos almacenarlo en una variable de tipo String
 */