package CasoPractico1;

public class Main {

    public static void main(String[] args) {
        
        Inventario inventario = new Inventario();

        // 1
        System.out.println("\n========== 1: Agregar productos ==========");
        Producto p1 = new Producto("P001", "Laptop HP", 2500.0, 15, CategoriaProducto.ELECTRONICA);
        Producto p2 = new Producto("P002", "Arroz Integral", 850.0, 100, CategoriaProducto.ALIMENTOS);
        Producto p3 = new Producto("P003", "Camisa Formal", 1500.0, 30, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Sillon", 10000.0, 20, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Celular Samsung", 3000.0, 10, CategoriaProducto.ELECTRONICA);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4); 
        inventario.agregarProducto(p5);

        // 2
        System.out.println("\n========== 2: Listar productos  ==========");
        inventario.listarProductos();
        System.out.println();

        // 3
        System.out.println("\n========== 3: Buscar producto por ID ==========");
        Producto encontrado = inventario.buscarProducto("P001");
        if (encontrado != null) {
            encontrado.mostrarInfo();
        } else {
            System.out.println("Producto no encontrado");
        }
        System.out.println();

        // 4
        System.out.println("\n========== 4: Filtrar por categoria ==========");
        inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA).forEach(Producto::mostrarInfo);
        System.out.println();

        // 5 
        System.out.println("\n========== 5: Eliminar Producto y listar ==========");
        inventario.eliminarProducto("P002");
        inventario.listarProductos();
        System.out.println();

        // 6
        System.out.println("\n========== 6: Actualizar stock de producto ==========");
        inventario.actualizarStock("P003", 40);
        System.out.println();

        // 7 
        System.out.println("\n========== 7: Imprimir stock total disponible ==========");
        System.out.println("\nStock total disponible: " + inventario.obtenerTotalStock() + " unidades.");
        System.out.println();

        // 8
        System.out.println("\n========== 8: Mostrar producto con mayor stock ==========");
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        if (mayorStock != null) {
            mayorStock.mostrarInfo();
        }

        // 9 
        System.out.println("\n========== 9: Filtrar productos por precio ==========");
        inventario.filtrarProductosPorPrecio(1000, 3000).forEach(Producto::mostrarInfo);
        System.out.println();

        // 10
        System.out.println("\n========== 10: Mostrar categorias disponibles ==========");
        inventario.mostrarCategoriasDisponibles();
        System.out.println();
    }
    
}
