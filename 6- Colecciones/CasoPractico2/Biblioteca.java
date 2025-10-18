package CasoPractico2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Biblioteca {
    
    private String nombre;
    private List<Libro> libros;

    

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        libros = new ArrayList<Libro>();
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        libros.add(new Libro(isbn, titulo, anioPublicacion, autor));
    } 

    public void listarLibros() {
        System.out.println("Libros en biblioteca: " + nombre + ":");
        libros.forEach(System.out::println);
        System.out.println();
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        
        return libros.stream()
            .filter(l -> l.getIsbn().equals(isbn))
            .findFirst()
            .orElse(null);
    }

    public void eliminarLibro(String isbn) {

        Libro libro = buscarLibroPorIsbn(isbn);
        
        if (libro != null) {
            libros.remove(libro);
        }
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }

    public void filtrarLibrosPorAnio(int anio) {
        libros.stream().filter(l -> l.getAnioPublicacion() == anio).forEach(System.out::println);;
    }

    public void mostrarAutoresDisponibles() {
        libros.forEach(l -> l.getAutor().mostrarInfo());
    }
} 
