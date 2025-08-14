package tp1;

import java.util.Scanner;

public class SolicitarDatos {
    
    private Scanner scanner = new Scanner(System.in);
    
    private String nombre;
    private int edad;
    private double altura;
    private boolean estudiante;
    
    public void solicitar() {
        
        System.out.println("Ingrese su nombre: ");
        nombre = scanner.nextLine();
        
        System.out.println("Ingrese su edad: ");
        edad = scanner.nextInt();
        
        System.out.println("Ingrese su altura: ");
        altura = scanner.nextDouble();
        
        System.out.println("Es estudiante? (true or false): ");
        estudiante = scanner.nextBoolean();
       
    }
    
    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("Es estudiante: " + estudiante);
    }
    
    public static void main(String[] args) {    
        SolicitarDatos datos = new SolicitarDatos();
        datos.solicitar();
        datos.imprimir();
    }
    
}
