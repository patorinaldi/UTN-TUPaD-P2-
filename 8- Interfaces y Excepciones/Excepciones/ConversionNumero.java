package Excepciones;

import java.util.Scanner;

public class ConversionNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== EJERCICIO 2: Conversión de Cadena a Número ===\n");
        
        try {
            System.out.print("Ingrese un número entero: ");
            String texto = scanner.nextLine();
            
            int numero = Integer.parseInt(texto);
            System.out.println("\nConversión exitosa: " + numero);
            System.out.println("El doble es: " + (numero * 2));
            
        } catch (NumberFormatException e) {
            System.out.println("\nError: El texto ingresado no es un número válido");
            System.out.println("Detalle: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}