import java.util.Date;

public class Reserva {

    private Date fecha;
    private String hora;
    private Cliente cliente;
    private Mesa mesa;
    
    public Reserva() {}
    
    public Reserva(Date fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }
    
    public Reserva(Date fecha, String hora, Cliente cliente, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.mesa = mesa;
    }
    
    public Date getFecha() {
        return fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public String getHora() {
        return hora;
    }
    
    public void setHora(String hora) {
        this.hora = hora;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public Mesa getMesa() {
        return mesa;
    }
    
    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }
    
    @Override
    public String toString() {
        return "Reserva{" +
                "fecha=" + fecha +
                ", hora='" + hora + '\'' +
                ", cliente=" + (cliente != null ? cliente.getNombre() : "null") +
                ", mesa=" + (mesa != null ? mesa.getNumero() : "null") +
                '}';
    }
}