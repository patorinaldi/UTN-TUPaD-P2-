package CasoPractico2;

public class Autor {

    private String id;
    private String nombre;
    private String nacionalidad;

    public void mostrarInfo() {
        System.out.println(this.toString());
    }

    public Autor(){
        this.id = "1";
        this.nombre = "Nombre";
        this.nacionalidad = "Argentina";
    }
    
    public Autor(String id, String noimbre, String nacionalidad) {
        this.id = id;
        this.nombre = noimbre;
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "================================\n" +
            "ID: " + id + "\n" +
            "Nombre: " + nombre + "\n" +
            "Nacionalidad: " + nacionalidad + "\n" +
            "================================";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String noimbre) {
        this.nombre = noimbre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
}