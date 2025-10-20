package Kata2;

public class Main {

    public static void main(String[] args) {
        System.out.println("KATA 2\n");
        
        Figura[] figuras = new Figura[3];
        figuras[0] = new Circulo(5);
        figuras[1] = new Rectangulo(4, 6);
        figuras[2] = new Circulo(3);
        
        for (Figura figura : figuras) {
            System.out.println(figura.getNombre() + " - Área: " + 
                String.format("%.2f", figura.calcularArea()));
        }
    }
    
}
