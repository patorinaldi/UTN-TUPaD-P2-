import java.util.Scanner;

public class DescuentoEspecial {
   
    private static final double DESCUENTO_ESPECIAL = 0.10;
    
    private double precio;
    private Scanner scanner = new Scanner(System.in);
    
    public double solicitarPrecio() {
        System.out.print("Ingrese el precio del producto: ");
        return Double.parseDouble(scanner.nextLine());
    }
    
    public void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - descuentoAplicado;
        
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
    
    public static void main(String[] args) {
        DescuentoEspecial descuento = new DescuentoEspecial();
        
        descuento.precio = descuento.solicitarPrecio();
        descuento.calcularDescuentoEspecial(descuento.precio);
    }
}