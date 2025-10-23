package Excepciones;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {

        System.out.println("=== EJERCICIO 5: Try-with-resources ===\n");
        
        String nombreArchivo = "datos.txt";
        
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            
            System.out.println("Contenido del archivo:\n");
            String linea;
            int numeroLinea = 1;
            
            while ((linea = reader.readLine()) != null) {
                System.out.println(numeroLinea + ": " + linea);
                numeroLinea++;
            }
            
            System.out.println("\nArchivo leído correctamente");
            System.out.println("Recursos cerrados automáticamente");
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            if (e instanceof java.io.FileNotFoundException) {
                System.out.println("El archivo '" + nombreArchivo + "' no existe");
                System.out.println("Cree un archivo llamado 'datos.txt' en la raíz del proyecto");
            }
        }
    }
}