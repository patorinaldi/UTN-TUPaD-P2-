import java.util.Scanner;

public class SumaPares {
    
    private int sumaPares = 0; 
    private int numero;
    Scanner scanner = new Scanner(System.in);

    public void leerNumeros() {
        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = Integer.parseInt(scanner.nextLine());
            if (numero % 2 == 0) {
                sumaPares += numero;
            }
        } while (numero != 0);
    }

    public void imprimirResultado() {
        System.out.println("La suma de los números pares es: " + sumaPares);
    }

    public static void main(String[] args) {
        SumaPares sumaPares = new SumaPares();
        sumaPares.leerNumeros();
        sumaPares.imprimirResultado();
    }

}
