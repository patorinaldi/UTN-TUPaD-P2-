package Ecommerce;

public class Producto implements Pagable {
    
    private String nombre;
    private double precio;

    @Override
    public double calcularTotal() {
        return precio;
    }

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return nombre + " - $" + String.format("%.2f", precio);
    }
    
}
