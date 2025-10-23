package Excepciones;

import java.util.Scanner;

public class EdadInvalida {
    
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0) {
            throw new EdadInvalidaException("La edad no puede ser negativa: " + edad);
        }
        if (edad > 120) {
            throw new EdadInvalidaException("La edad no puede ser mayor a 120: " + edad);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== EJERCICIO 4: Excepción Personalizada ===\n");
        
        try {
            System.out.print("Ingrese su edad: ");
            int edad = scanner.nextInt();
            
            validarEdad(edad);
            
            System.out.println("\n✓ Edad válida: " + edad + " años");
            
        } catch (EdadInvalidaException e) {
            System.out.println("\nError de validación: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("\nError: Entrada inválida");
        } finally {
            scanner.close();
        }
    }
}