import java.util.Date;

public class FirmaDigital {
    private String codigoHash;
    private Date fecha;
    private Usuario usuario;
    
    public FirmaDigital() {}
    
    public FirmaDigital(String codigoHash, Date fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }
    
    public String getCodigoHash() {
        return codigoHash;
    }
    
    public void setCodigoHash(String codigoHash) {
        this.codigoHash = codigoHash;
    }
    
    public Date getFecha() {
        return fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    @Override
    public String toString() {
        return "FirmaDigital{" +
                "codigoHash='" + codigoHash + '\'' +
                ", fecha=" + fecha +
                ", usuario=" + (usuario != null ? usuario.getNombre() : "null") +
                '}';
    }
}