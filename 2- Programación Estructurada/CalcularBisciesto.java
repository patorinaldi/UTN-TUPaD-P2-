import java.util.Scanner;

public class CalcularBisciesto {
    
    private int anio;
    private Scanner scanner = new Scanner(System.in);

    public void solicitarAnio() {
        System.out.print("Ingrese un año: ");
        anio = scanner.nextInt();
    }
    
    public void imprimir(){
        if (esBisciesto(anio)) {
            System.out.println("El año " + anio + " es bisciesto.");
        } else {
            System.out.println("El año " + anio + " no es bisciesto.");
        }
    }

    public boolean esBisciesto(int anio) {
        if (anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        CalcularBisciesto calc = new CalcularBisciesto();
        calc.solicitarAnio();
        calc.imprimir();
    }
}
