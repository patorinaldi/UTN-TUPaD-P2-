package Kata1;

public class Auto extends Vehiculo {

    private int cantidadPuertas;
    
    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }
    
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Cantidad de puertas: " + cantidadPuertas);
    }
    
    public int getCantidadPuertas() {
        return cantidadPuertas;
    }
    
    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }
} 
