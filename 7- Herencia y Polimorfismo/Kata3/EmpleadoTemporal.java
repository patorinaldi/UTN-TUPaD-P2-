package Kata3;

public class EmpleadoTemporal extends Empleado {
    
    private double tarifaPorHora;
    private int horasTrabajadas;
    
    public EmpleadoTemporal(String nombre, String id, double tarifaPorHora, int horasTrabajadas) {
        super(nombre, id);
        this.tarifaPorHora = tarifaPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }
    
    @Override
    public double calcularSueldo() {
        return tarifaPorHora * horasTrabajadas;
    }
    
    public double getTarifaPorHora() {
        return tarifaPorHora;
    }
    
    public void setTarifaPorHora(double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }
    
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
    
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

}