public class Test14 {

    public static void main(String[] args) {

        Proyecto proyecto1 = new Proyecto("Documental Naturaleza", 45);
        Proyecto proyecto2 = new Proyecto("Comercial TV", 2);
        Proyecto proyecto3 = new Proyecto("Video Corporativo", 15);
        
        EditorVideo editor = new EditorVideo();
        
        System.out.println("=== Primera exportación ===");
        editor.exportar("MP4", proyecto1);
        
        System.out.println("\n=== Segunda exportación ===");
        editor.exportar("AVI", proyecto2);
        
        System.out.println("\n=== Tercera exportación ===");
        editor.exportar("MOV", proyecto3);
        
        System.out.println("\n=== Misma proyecto, diferente formato ===");
        editor.exportar("WMV", proyecto1);
        
        
    }

}