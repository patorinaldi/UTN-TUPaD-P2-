import java.util.Scanner;

public class ContadorNumeros {
   
    private int positivos = 0;
    private int negativos = 0;
    private int ceros = 0;
    private Scanner scanner = new Scanner(System.in);
    
    public void leerNumeros() {
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            int numero = Integer.parseInt(scanner.nextLine());
            
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }
    }
    
    public void imprimirResultados() {
        System.out.println("Resultados:");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
    }
    
    public static void main(String[] args) {
        ContadorNumeros contador = new ContadorNumeros();
        contador.leerNumeros();
        contador.imprimirResultados();
    }
}