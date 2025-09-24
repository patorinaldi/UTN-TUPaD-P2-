public class Render {

    private String formato;
    private Proyecto proyecto;
    
    public Render() {}
    
    public Render(String formato, Proyecto proyecto) {
        this.formato = formato;
        this.proyecto = proyecto;
    }
    
    public String getFormato() {
        return formato;
    }
    
    public void setFormato(String formato) {
        this.formato = formato;
    }
    
    public Proyecto getProyecto() {
        return proyecto;
    }
    
    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }
    
    @Override
    public String toString() {
        return "Render{formato='" + formato + "', proyecto=" + 
               (proyecto != null ? proyecto.getNombre() : "null") + "}";
    }
    
}