
import java.util.Scanner;

public class TipoDouble {


    double x = 0;
    double y = 0;

    Scanner scanner = new Scanner(System.in);

    public void solicitarEImprimir() {
        System.out.println("Ingrese el primer numero flotante: ");
        x = Double.parseDouble(scanner.nextLine());
        System.out.println("Ingrese el segundo numero flotante: ");
        y = Double.parseDouble(scanner.nextLine());

        System.out.println(x + " / " + y + " = " + x / y);
    }

    public static void main(String[] args) {
        TipoDouble d = new TipoDouble();
        d.solicitarEImprimir();
    }
}

    

