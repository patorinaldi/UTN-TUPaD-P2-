package Kata4;

public class Perro extends Animal {
    
    public Perro(String nombre) {
        super(nombre, "Perro");
    }
    
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Guau guau!");
    }
}