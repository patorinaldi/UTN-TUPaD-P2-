package CasoPractico1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Inventario {
    
    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        if (buscarProducto(p.getId()) == null) {
            System.out.println("Producto: " + p.getNombre() + " agregado exitosamente.");
            productos.add(p);
        } else {
            System.out.println("No se puede agregar productos con el mismo ID");
        }
    }

    public void listarProductos() {
        for (Producto producto : productos) {
            producto.mostrarInfo();
        }
    }

    public Producto buscarProducto(String id) {
        return productos.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }

    public void eliminarProducto(String id) {
        Producto producto = buscarProducto(id);
        if (producto != null) {
            productos.remove(producto);
            System.out.println("Producto " + producto.getNombre() + "eliminado exitosamente.");
        } else {
            System.out.println("No se encontro el producto.");
        }
    }

    public void actualizarStock(String id, int nuevaCantidad) {
        Producto producto = buscarProducto(id);
        if (producto != null) {
            producto.setCantidad(nuevaCantidad);
            System.out.println("Producto " + producto.getNombre() + " actualizado exitosamente.");
        } else {
            System.out.println("No se encontro el producto.");
        }
    }

    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoriaProducto) {
        return productos.stream().filter(p -> p.getCategoria().equals(categoriaProducto)).collect(Collectors.toCollection(ArrayList::new));
    }

    public int obtenerTotalStock() {
        return productos.stream().mapToInt(p-> p.getCantidad()).sum();
    }

    public Producto obtenerProductoConMayorStock() {
        return productos.stream().max(Comparator.comparingInt(p -> p.getCantidad())).orElse(null);
    }

    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max) {
        return productos.stream().filter(p -> p.getPrecio() >= min && p.getPrecio() <= max).collect(Collectors.toCollection(ArrayList::new));
    }

    public void mostrarCategoriasDisponibles() {
        System.out.println("Categorias disponibles:");
        productos.stream().map(p -> p.getCategoria()).distinct().forEach(c -> System.out.println(c + ": " + c.getDescripcion()));
    }

}