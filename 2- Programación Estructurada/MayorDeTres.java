import java.util.Scanner;

public class MayorDeTres {
    
    private int x;
    private int y;
    private int z;

    private Scanner scanner = new Scanner(System.in);

    public void leerNumeros() {
        System.out.print("Ingrese el primer numero: ");
        x = scanner.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        y = scanner.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        z = scanner.nextInt();
    }

    public int encontrarMayor(int x, int y, int z) {
        if (x >= y && x >= z) {
            return x;
        } else if (y >= x && y >= z){
            return y;
        } else {
            return z;
        }
    }

    public void imprimirResultado() {
        int mayor = encontrarMayor(x, y, z);
        System.out.println("El mayor es: " + mayor);
    }

    public static void main(String[] args) {
        MayorDeTres mayorDeTres = new MayorDeTres();
        mayorDeTres.leerNumeros();
        mayorDeTres.imprimirResultado();
    }
}