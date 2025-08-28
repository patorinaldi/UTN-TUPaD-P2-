import java.util.Scanner;

public class ClasificadorEdad {
    
    private int edad;
    private Scanner scanner = new Scanner(System.in);
    private String etapa;

    public void leerEdad() {
        System.out.print("Ingrese su edad: ");
        edad = scanner.nextInt();
    }

    public void imprimirResultado() {
        System.out.println("Eres un " + etapa);
    }

    public void clasificar() {
        if (edad < 12) {
            etapa = "Niño";
        } else if (edad >= 12 & edad <= 17) {
            etapa = "Adolescente";
        } else if (edad >= 18 & edad <= 59) {
            etapa = "Adulto";
        } else {
            etapa = "Adulto mayor";
        } 
    }

    public static void main(String[] args) {
        ClasificadorEdad clasificadorEdad = new ClasificadorEdad();
        clasificadorEdad.leerEdad();
        clasificadorEdad.clasificar();
        clasificadorEdad.imprimirResultado();
    }
}
