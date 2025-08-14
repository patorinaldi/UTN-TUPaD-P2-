import java.util.Scanner;

public class Calculadora {
    
    private Scanner scanner = new Scanner(System.in);
    private int num1;
    private int num2;


    public void solicitar() {
        System.out.println("Ingrese primer numero: ");
        num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Ingrese segundo numero: ");
        num2 = Integer.valueOf(scanner.nextLine());   
    }

    public void imprimir() {
        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicación: " + (num1 * num2));
        System.out.println("División: " + (num1 / num2));
    }

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        calculadora.solicitar();
        calculadora.imprimir();
    }

}
