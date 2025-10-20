package Kata4;

public class Animal {
    protected String nombre;
    protected String especie;
    
    public Animal(String nombre, String especie) {
        this.nombre = nombre;
        this.especie = especie;
    }
    
    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
    
    public void describirAnimal() {
        System.out.println("Animal: " + nombre + " - Especie: " + especie);
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getEspecie() {
        return especie;
    }
    
    public void setEspecie(String especie) {
        this.especie = especie;
    }
}