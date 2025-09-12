class Empleado {
    
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;
    
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }
    
    public Empleado(String nombre, String puesto) {
        this.id = (int)(Math.random() * 10000) + 1000;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 800000.0;
        totalEmpleados++;
    }
    
    public void actualizarSalario(double porcentaje) {
        this.salario = this.salario + (this.salario * porcentaje / 100);
        System.out.println("Salario actualizado con " + porcentaje + "% de aumento");
    }
    
    public void actualizarSalario(int cantidadFija) {
        this.salario = this.salario + cantidadFija;
        System.out.println("Salario actualizado con aumento fijo de $" + cantidadFija);
    }
    
    @Override
    public String toString() {
        return "Empleado [ID: " + id + ", Nombre: " + nombre + 
               ", Puesto: " + puesto + ", Salario: $" + salario + "]";
    }
    
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getPuesto() {
        return puesto;
    }
    
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
}

public class PruebaEmpleado {
    
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTION DE EMPLEADOS ===\n");
        
        Empleado emp1 = new Empleado(100, "Carlos", "Desarrollador", 850000.0);
        Empleado emp2 = new Empleado(101, "Ana", "Diseñadora", 820000.0);
        Empleado emp3 = new Empleado("Juan", "Analista");
        Empleado emp4 = new Empleado("Maria", "Tester");
        
        System.out.println("Empleados creados:");
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);
        
        System.out.println("\n=== ACTUALIZANDO SALARIOS ===");
        
        System.out.println("\nActualizando salario de " + emp1.getNombre() + ":");
        emp1.actualizarSalario(10.0);
        System.out.println(emp1);
        
        System.out.println("\nActualizando salario de " + emp2.getNombre() + ":");
        emp2.actualizarSalario(50000);
        System.out.println(emp2);
        
        System.out.println("\nActualizando salario de " + emp3.getNombre() + ":");
        emp3.actualizarSalario(15.0);
        System.out.println(emp3);
        
        System.out.println("\nActualizando salario de " + emp4.getNombre() + ":");
        emp4.actualizarSalario(30000);
        System.out.println(emp4);
        
        System.out.println("\n=== INFORMACION FINAL ===");
        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());
        
        System.out.println("\nListado final de empleados:");
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);
    }
}