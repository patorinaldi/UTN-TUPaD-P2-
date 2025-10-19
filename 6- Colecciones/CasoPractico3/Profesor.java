package CasoPractico3;

import java.util.ArrayList;
import java.util.List;

public class Profesor {
    
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;

    public void agregarCurso(Curso c) {
        cursos.add(c);
    }

    public void eliminarCurso(Curso c) {
        cursos.remove(c);
    }

    public void listarCursos() {
        System.out.println("Cursos:");
        cursos.forEach(System.out::println);
        System.out.println();
    }

    public void mostrarInfo() {
        System.out.println(this.toString());
    }

    public Profesor() {
    }

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    @Override
    public String toString() {
        
        String nombresCursos = cursos.stream()
            .map(Curso::getNombre)
            .reduce((a, b) -> a + ", " + b)
            .orElse("Ninguno");

        return "================================\n" +
            "ID: " + id + "\n" +
            "Nombre: " + nombre + "\n" +
            "Especialidad: " + especialidad + "\n" +
            "Cursos: " + nombresCursos + "\n" + 
            "================================";

    }
    
    
}
