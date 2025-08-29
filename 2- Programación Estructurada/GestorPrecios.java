public class GestorPrecios {
   
    private double[] precios;
    
    public void inicializarPrecios() {
        precios = new double[]{199.99, 299.5, 149.75, 399.0, 89.99};
    }
    
    public void mostrarPreciosOriginales() {
        System.out.println("Precios originales:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
    }
    
    public void modificarPrecio(int i, double precio) {
        precios[i] = precio;
    }
    
    public void mostrarPreciosModificados() {
        System.out.println("Precios modificados:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
    }
    
    public static void main(String[] args) {
        GestorPrecios gestor = new GestorPrecios();
        
        gestor.inicializarPrecios();
        gestor.mostrarPreciosOriginales();
        gestor.modificarPrecio(2, 129.99);
        gestor.mostrarPreciosModificados();
    }
}