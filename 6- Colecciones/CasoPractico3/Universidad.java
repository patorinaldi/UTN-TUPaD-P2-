package CasoPractico3;

import java.beans.Customizer;
import java.util.ArrayList;
import java.util.List;

public class Universidad {
    
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;
    
    public void agregarProfesor(Profesor p) {
        profesores.add(p);
    }

    public void agregarCurso(Curso c) {
        cursos.add(c);
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Profesor profesor = profesores.stream()
            .filter(p -> p.getId().equals(idProfesor))
            .findFirst().orElse(null);
            
        Curso curso = cursos.stream()
            .filter(c -> c.getCodigo().equals(codigoCurso))
            .findFirst().orElse(null);

        if (profesor == null) { 
            System.out.println("Error: Profesor con ID: '" + idProfesor + "' no encontrado.");
        } else if (curso == null) {
            System.out.println("Error: Curso con codigo: '" + codigoCurso + "' no encontrado.");
        } else {
            curso.setProfesor(profesor);
            System.out.println("Profesor asignado correctamente al curso.");
        }
    
    }

    public void listarCursos() {
        System.out.println("Cursos: ");
        cursos.forEach(c -> c.mostrarInfo());
    }

    public void listarProfesores() {
        System.out.println("Profesores: ");
        profesores.forEach(p -> p.mostrarInfo());
    }

    public Profesor buscarProfesorPorId(String id) {
        return profesores.stream()
            .filter(p -> p.getId().equals(id))
            .findFirst()
            .orElse(null);
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        return cursos.stream()
            .filter(c -> c.getCodigo().equals(codigo))
            .findFirst()
            .orElse(null);
    }

    public void eliminarCurso(String codigo) {
        Curso curso = buscarCursoPorCodigo(codigo);
        if (curso != null) {
            Profesor profesor = curso.getProfesor();
            if (profesor != null) {
                profesor.eliminarCurso(curso);
            }
            
            cursos.remove(curso);
            System.out.println("Curso eliminado con exito.");
        }
    }

    public void eliminarProfesor(String id) {
        Profesor profesor = buscarProfesorPorId(id);
        if (profesor != null) {
            new ArrayList<>(profesor.getCursos()).forEach(c -> c.setProfesor(null)); 
            profesores.remove(profesor);
        }
    }

    public Universidad(String nombre) {
        this.nombre = nombre;
        profesores = new ArrayList<>();
        cursos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
    
}