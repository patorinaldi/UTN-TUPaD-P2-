public class EditorVideo {
    
    public void exportar(String formato, Proyecto proyecto) {

        System.out.println("=== EXPORTANDO VIDEO ===");
        System.out.println("Proyecto: " + proyecto.getNombre());
        System.out.println("Duración: " + proyecto.getDuracionMin() + " minutos");
        System.out.println("Formato destino: " + formato);
        
        Render render = new Render(formato, proyecto);
        
        System.out.println("\nIniciando proceso de render...");
        System.out.println("10%");
        System.out.println("30%");
        System.out.println("50%");
        System.out.println("70%");
        System.out.println("90%");
        System.out.println("100%");
        
        System.out.println("\nExportación completada!");
        System.out.println("Archivo generado: " + proyecto.getNombre() + "." + formato.toLowerCase());
        System.out.println("Detalles del render: " + render);
        System.out.println("====================");

    }
    
}