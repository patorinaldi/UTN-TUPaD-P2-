package CasoPractico2;

public class Main {
    
    
    public static void main(String[] args) {
        // 1 
        Biblioteca biblioteca = new Biblioteca("Biblioteca UTN");

        // 2
        Autor autor1 = new Autor("A001", "Gabriel García Márquez", "Colombiana");
        Autor autor2 = new Autor("A002", "Isabel Allende", "Chilena");
        Autor autor3 = new Autor("A003", "Jorge Luis Borges", "Argentina");

        // 3
        biblioteca.agregarLibro("978-0307474728", "Cien años de soledad", 1967, autor1);
        biblioteca.agregarLibro("978-1400034680", "El amor en los tiempos del cólera", 1985, autor1);
        biblioteca.agregarLibro("978-8497592437", "La casa de los espíritus", 1982, autor2);
        biblioteca.agregarLibro("978-0525433453", "Largo pétalo de mar", 2019, autor2);
        biblioteca.agregarLibro("978-0802130303", "Ficciones", 1944, autor3);

        // 4
        System.out.println("\n========== 4. LISTADO DE TODOS LOS LIBROS ==========");
        biblioteca.listarLibros();

        // 5
        System.out.println("\n========== 5. BUSCAR LIBRO POR ISBN ==========");
        Libro libro = biblioteca.buscarLibroPorIsbn("978-0307474728");
        if (libro != null) {
            libro.mostrarInfo();
        } else {
            System.out.println("Libro no encontrado.");
        }

        // 6 
        System.out.println("\n========== 6. LIBROS PUBLICADOS EN 1985 ==========");
        biblioteca.filtrarLibrosPorAnio(1985);

        // 7 
        System.out.println("\n========== 7. ELIMINAR LIBRO Y LISTAR RESTANTES ==========");
        System.out.println("Eliminando libro con ISBN: 978-0802130303 (Ficciones)");
        biblioteca.eliminarLibro("978-0802130303");
        System.out.println("\nLibros restantes:");
        biblioteca.listarLibros();

        // 8
        System.out.println("\n========== 8. CANTIDAD TOTAL DE LIBROS ==========");
        System.out.println("Total de libros en biblioteca: " + biblioteca.obtenerCantidadLibros());

        // 9
        System.out.println("\n========== 9. AUTORES DISPONIBLES ==========");
        biblioteca.mostrarAutoresDisponibles();
    }
}
