package Excepciones;

import java.util.Scanner;

public class DivisionSegura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== EJERCICIO 1: División Segura ===\n");
        
        try {
            System.out.print("Ingrese el dividendo: ");
            int dividendo = scanner.nextInt();
            
            System.out.print("Ingrese el divisor: ");
            int divisor = scanner.nextInt();
            
            int resultado = dividendo / divisor;
            System.out.println("\nResultado: " + dividendo + " / " + divisor + " = " + resultado);
            
        } catch (ArithmeticException e) {
            System.out.println("\nError: No se puede dividir por cero");
        } catch (Exception e) {
            System.out.println("\nError: Entrada inválida");
        } finally {
            scanner.close();
        }
    }
}