import java.util.Scanner;

public class Libro {
    
    private String titulo;
    private String autor;
    private int añoPublicacion;
    private Scanner scanner = new Scanner(System.in);
    
    public void solicitarDatos() {
        System.out.print("Ingrese el titulo del libro: ");
        titulo = scanner.nextLine();
        
        System.out.print("Ingrese el autor del libro: ");
        autor = scanner.nextLine();
        
        System.out.print("Ingrese el año de publicacion: ");
        añoPublicacion = Integer.parseInt(scanner.nextLine());
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public int getAñoPublicacion() {
        return añoPublicacion;
    }
    
    public void setAñoPublicacion(int nuevoAño) {
        if (nuevoAño > 0 && nuevoAño <= 2025) {
            añoPublicacion = nuevoAño;
            System.out.println("Año de publicacion actualizado correctamente a: " + nuevoAño);
        } else {
            System.out.println("Error: Año inválido. Debe estar entre 1 y 2025.");
        }
    }
    
    public void mostrarInfo() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicacion: " + añoPublicacion);
    }
    
    public static void main(String[] args) {
        Libro libro = new Libro();
        
        libro.solicitarDatos();
        
        System.out.println("\nInformacion inicial del libro:");
        libro.mostrarInfo();
        
        System.out.println("\nIntentando modificar el año con valor invalido (-500):");
        libro.setAñoPublicacion(-500);
        
        System.out.println("\nIntentando modificar el año con valor valido (2023):");
        libro.setAñoPublicacion(2023);
        
        System.out.println("\nInformacion final del libro:");
        libro.mostrarInfo();
    }
}