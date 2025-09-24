public class Test7 {

    public static void main(String[] args) {
        Motor motor1 = new Motor("V6 Gasolina", "MT123456");
        Motor motor2 = new Motor("V8 Diesel", "MT789012");
        
        Conductor conductor = new Conductor("Miguel Fernández", "LIC-2024-001");
        
        Vehiculo vehiculo = new Vehiculo("ABC-123", "Toyota Camry", motor1);
        
        vehiculo.setConductor(conductor);
        
        System.out.println("=== Estado inicial ===");
        System.out.println(vehiculo);
        System.out.println("\n=== Información del Conductor ===");
        System.out.println(conductor);
        System.out.println("Vehículo del conductor: " + conductor.getVehiculo().getPatente());
        
        System.out.println("\n=== Cambio de motor (Agregación) ===");
        vehiculo.cambiarMotor(motor2);
        
        System.out.println("Motor original sigue existiendo: " + motor1);
        System.out.println("Nueva configuración del vehículo:");
        System.out.println(vehiculo);
        
        System.out.println("\n=== Cambio de conductor ===");
        Conductor nuevoConductor = new Conductor("Elena Vásquez", "LIC-2024-002");
        vehiculo.setConductor(nuevoConductor);
        
        System.out.println("Nuevo conductor: " + vehiculo.getConductor().getNombre());
        System.out.println("Conductor anterior ya no tiene vehículo: " + 
            (conductor.getVehiculo() == null ? "correcto" : "error"));
        
        System.out.println("\n=== Objetos independientes ===");
        Motor motorIndependiente = new Motor("Eléctrico", "MT999999");
        System.out.println("Motor que existe sin vehículo: " + motorIndependiente);
        
        System.out.println("\n=== Estado final ===");
        System.out.println(vehiculo);
        
    }
}