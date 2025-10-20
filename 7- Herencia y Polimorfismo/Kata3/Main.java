package Kata3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("KATA 3\n");
        
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Juan Pérez", "E001", 50000, 10000));
        empleados.add(new EmpleadoTemporal("María García", "E002", 150, 120));
        empleados.add(new EmpleadoPlanta("Carlos López", "E003", 60000, 15000));
        empleados.add(new EmpleadoTemporal("Ana Martínez", "E004", 200, 100));
        
        System.out.println("Sueldos de empleados:");
        for (Empleado empleado : empleados) {
            System.out.println(empleado.getNombre() + " (" + empleado.getId() + "): $" + 
                String.format("%.2f", empleado.calcularSueldo()));
        }
        
        System.out.println("\nClasificación:");
        int contadorPlanta = 0;
        int contadorTemporal = 0;
        
        for (Empleado empleado : empleados) {
            if (empleado instanceof EmpleadoPlanta) {
                contadorPlanta++;
                System.out.println(empleado.getNombre() + " es empleado de planta");
            } else if (empleado instanceof EmpleadoTemporal) {
                contadorTemporal++;
                System.out.println(empleado.getNombre() + " es empleado temporal");
            }
        }
        
        System.out.println("\nTotal empleados de planta: " + contadorPlanta);
        System.out.println("Total empleados temporales: " + contadorTemporal);

    }

}