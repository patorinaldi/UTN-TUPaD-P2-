import java.util.Scanner;

public class CalculadoraDescuento {
    
    private String categoria;
    private double descuento = 0.0;
    private double precioOriginal;
    private double precioFinal;
    private Scanner scanner = new Scanner(System.in);

    public void solicitarDatos() {
        System.out.print("Ingrese el precio del producto: ");
        precioOriginal = Double.parseDouble(scanner.nextLine());
        System.out.print("Ingrese la categoria del producto (A, B o C): ");
        categoria = scanner.nextLine();
    }

    public void calcularDescuento() {
        if (categoria.equals("A")) {
            descuento = 0.10;
        } else if (categoria.equals("B")) {
            descuento = 0.15;
        } else if (categoria.equals("C")) {
            descuento = 0.20;
        } else {
            System.out.println("Categoria incorrecta.");
        }
    }

    public void calcularPrecioFinal() {
        precioFinal = precioOriginal * descuento;
    }

    public void imprimirResultados() {
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Precio final: " + precioFinal);
    }


    public static void main(String[] args) {
        CalculadoraDescuento calc = new CalculadoraDescuento();
        calc.solicitarDatos();
        calc.calcularDescuento();
        calc.calcularPrecioFinal();
        calc.imprimirResultados();
    }
}
