import java.util.Scanner;

public class TipoInt {
    int x = 0;
    int y = 0;

    Scanner scanner = new Scanner(System.in);

    public void solicitarEImprimir() {
        System.out.println("Ingrese el primer numero entero: ");
        x = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese el segundo numero entero: ");
        y = Integer.parseInt(scanner.nextLine());

        System.out.println(x + " / " + y + " = " + x / y);
    }

    public static void main(String[] args) {
        TipoInt c = new TipoInt();
        c.solicitarEImprimir();
    }
}
