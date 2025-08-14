public class Datos { 

    private String nombre = "Patricio";
    private int edad = 37;
    private double altura = 1.88;
    private boolean estudiante = true; 

    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("Es estudiante: " + estudiante);
    }

    public static void main(String[] args) {    
        Datos datos = new Datos();
        datos.imprimir();
    }
}