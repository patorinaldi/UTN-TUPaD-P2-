package Kata3;

public abstract class Empleado {

    protected String nombre;
    protected String id;
    
    public Empleado(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }
    
    public abstract double calcularSueldo();
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
}