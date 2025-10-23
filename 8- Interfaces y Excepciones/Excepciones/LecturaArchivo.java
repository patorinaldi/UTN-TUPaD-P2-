package Excepciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LecturaArchivo {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 3: Lectura de Archivo ===\n");
        
        String nombreArchivo = "datos.txt";
        BufferedReader reader = null;
        
        try {
            reader = new BufferedReader(new FileReader(nombreArchivo));
            String linea;
            
            System.out.println("Contenido del archivo:\n");
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo '" + nombreArchivo + "' no existe");
            System.out.println("Por favor, cree el archivo en la raíz del proyecto");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Error al cerrar el archivo");
                }
            }
        }
    }
}