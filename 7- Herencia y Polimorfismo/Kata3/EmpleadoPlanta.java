package Kata3;

public class EmpleadoPlanta extends Empleado {
    private double sueldoBase;
    private double bonificacion;
    
    public EmpleadoPlanta(String nombre, String id, double sueldoBase, double bonificacion) {
        super(nombre, id);
        this.sueldoBase = sueldoBase;
        this.bonificacion = bonificacion;
    }
    
    @Override
    public double calcularSueldo() {
        return sueldoBase + bonificacion;
    }
    
    public double getSueldoBase() {
        return sueldoBase;
    }
    
    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
    
    public double getBonificacion() {
        return bonificacion;
    }
    
    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }
    
}