package Ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {
    
    private String id;
    private List<Producto> productos;
    private Cliente cliente;
    private String estado;

    public Pedido(String id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.estado = "Pendiente";
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    @Override
    public double calcularTotal() {
        return productos.stream().mapToDouble(Producto::calcularTotal).sum();        
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        if (cliente != null) {
            cliente.notificar("Tu pedido " + id + " cambió a estado: " + nuevoEstado);
        }
    }

    public String getId() {
        return id;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n=== PEDIDO ").append(id).append(" ===\n");
        sb.append("Cliente: ").append(cliente.getNombre()).append("\n");
        sb.append("Estado: ").append(estado).append("\n");
        sb.append("Productos:\n");
        
        for (Producto producto : productos) {
            sb.append("  - ").append(producto).append("\n");
        }
        
        sb.append("\nTOTAL: $").append(String.format("%.2f", calcularTotal())).append("\n");
        sb.append("=".repeat(30));
        
        return sb.toString();
    }

}
