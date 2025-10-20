package Kata4;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        System.out.println("KATA 4\n");
        
        List<Animal> animales = new ArrayList<>();
        animales.add(new Perro("Firulais"));
        animales.add(new Gato("Michi"));
        animales.add(new Vaca("Lola"));
        animales.add(new Perro("Rex"));
        animales.add(new Gato("Garfield"));
        
        for (Animal animal : animales) {
            animal.describirAnimal();
            animal.hacerSonido();
            System.out.println();
        }
    }
}   

