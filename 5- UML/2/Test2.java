public class Test2 {
    public static void main(String[] args) {

        Bateria bateria1 = new Bateria("Li-ion 3000", 3000);
        Bateria bateria2 = new Bateria("Li-Po 4000", 4000);
        
        Usuario usuario = new Usuario("María García", "87654321");
        
        Celular celular = new Celular("123456789012345", "Samsung", "Galaxy S21", bateria1);
        
        celular.setUsuario(usuario);
        
        System.out.println("=== Estado inicial ===");
        System.out.println(celular);
        System.out.println("\n=== Información del Usuario ===");
        System.out.println(usuario);
        System.out.println("Celular del usuario: " + usuario.getCelular().getMarca() + " " + usuario.getCelular().getModelo());
        
        System.out.println("\n=== Cambio de batería (Agregación) ===");
        celular.cambiarBateria(bateria2);
        
        System.out.println("Batería original sigue existiendo: " + bateria1);
        System.out.println("Nueva configuración del celular:");
        System.out.println(celular);
        
        System.out.println("\n=== Baterías independientes ===");
        Bateria bateriaIndependiente = new Bateria("Universal 5000", 5000);
        System.out.println("Batería que existe sin celular: " + bateriaIndependiente);
    }
}