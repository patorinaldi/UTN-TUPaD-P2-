public class GestorPreciosRecursivo {
   
    private double[] precios;
    
    public void inicializarPrecios() {
        precios = new double[]{199.99, 299.5, 149.75, 399.0, 89.99};
    }
    
    public void mostrarPreciosOriginales() {
        System.out.println("Precios originales:");
        mostrarPreciosRecursivo(0);
    }
    
    public void mostrarPreciosRecursivo(int indice) {
        if (indice < precios.length) {
            System.out.println("Precio: $" + precios[indice]);
            mostrarPreciosRecursivo(indice + 1);
        }
    }
    
    public void modificarPrecio(int i, double precio) {
        precios[i] = precio;
    }
    
    public void mostrarPreciosModificados() {
        System.out.println("Precios modificados:");
        mostrarPreciosRecursivo(0);
    }
    
    public static void main(String[] args) {
        GestorPreciosRecursivo gestor = new GestorPreciosRecursivo();
        
        gestor.inicializarPrecios();
        gestor.mostrarPreciosOriginales();
        gestor.modificarPrecio(2, 129.99);
        gestor.mostrarPreciosModificados();
    }
}