import java.util.Date;

public class TarjetaDeCredito {

    private String numero;
    private Date fechaVencimiento;
    private Cliente cliente;
    private Banco banco;
    
    public TarjetaDeCredito() {}
    
    public TarjetaDeCredito(String numero, Date fechaVencimiento) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
    }
    
    public TarjetaDeCredito(String numero, Date fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }
    
    public String getNumero() {
        return numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }
    
    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if (cliente != null && cliente.getTarjetaDeCredito() != this) {
            cliente.setTarjetaDeCredito(this);
        }
    }
    
    public Banco getBanco() {
        return banco;
    }
    
    public void setBanco(Banco banco) {
        this.banco = banco;
    }
    
    
    @Override
    public String toString() {
        return "TarjetaDeCredito{" +
                "numero='" + numero + '\'' +
                ", fechaVencimiento=" + fechaVencimiento +
                ", cliente=" + (cliente != null ? cliente.getNombre() : "null") +
                ", banco=" + (banco != null ? banco.getNombre() : "null") +
                '}';
    }
}