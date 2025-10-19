package CasoPractico3;

public class Curso {
    
    private String codigo;
    private String nombre;
    private Profesor profesor;    
    
    public Curso() {
    }

    public Curso(String codigo, String nombre, Profesor profesor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = profesor;
    }

    public void setProfesor(Profesor p) {

        if (p == null) {
            profesor = p;
            return;
        }

        if (profesor != null) {
            profesor.eliminarCurso(this);
        } 

        p.agregarCurso(this);        
        profesor = p;

    }

    public void mostrarInfo() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        String nombreProfesor = (profesor != null) ? profesor.getNombre() : "Sin asignar";
        return "================================\n" +
            "Codigo: " + codigo + "\n" +
            "Nombre: " + nombre + "\n" +
            "Profesor: " + nombreProfesor + "\n" + 
            "================================";

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }
    
    
}
