package Kata2;

public abstract class Figura {
    protected String nombre;
    
    public Figura(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract double calcularArea();
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}