package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            try {
                System.out.println("\n╔════════════════════════════════════════════════════╗");
                System.out.println("║       TP8 - PARTE 2: Ejercicios de Excepciones     ║");
                System.out.println("╚════════════════════════════════════════════════════╝\n");
                
                System.out.println("Seleccione un ejercicio:");
                System.out.println("1. División Segura");
                System.out.println("2. Conversión de Cadena a Número");
                System.out.println("3. Lectura de Archivo");
                System.out.println("4. Excepción Personalizada (Edad)");
                System.out.println("5. Try-with-resources");
                System.out.println("0. Salir");
                System.out.print("\nOpción: ");
                
                int opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar buffer
                
                System.out.println("\n" + "=".repeat(50) + "\n");
                
                switch (opcion) {
                    case 0:
                        System.out.println("👋 ¡Hasta luego!");
                        scanner.close();
                        return;
                    case 1:
                        DivisionSegura.main(args);
                        break;
                    case 2:
                        ConversionNumero.main(args);
                        break;
                    case 3:
                        LecturaArchivo.main(args);
                        break;
                    case 4:
                        EdadInvalida.main(args);
                        break;
                    case 5:
                        TryWithResources.main(args);
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, seleccione una opción entre 0 y 5.");
                }
                
            } catch (InputMismatchException e) {
                System.out.println("\nError: Debe ingresar un número entero válido.");
                scanner.nextLine();
                System.out.print("\nPresione Enter para continuar...");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("\nError inesperado: " + e.getMessage());
                scanner.nextLine();
                System.out.print("\nPresione Enter para continuar...");
                scanner.nextLine();
            }
        }
    }
}