import java.util.Date;

public class Pasaporte {

    private String numero;
    private Date fechaEmision;
    private Foto foto; 
    private Titular titular; 
    
    public Pasaporte() {}
    
    public Pasaporte(String numero, Date fechaEmision) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        
        this.foto = new Foto();
    }
    
    public Pasaporte(String numero, Date fechaEmision, String imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        
        this.foto = new Foto(imagen, formato);
    }
    
    
    public String getNumero() {
        return numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public Date getFechaEmision() {
        return fechaEmision;
    }
    
    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }
    
    public Foto getFoto() {
        return foto;
    }
    
    public void setFoto(String imagen, String formato) {
        if (this.foto == null) {
            this.foto = new Foto(imagen, formato);
        } else {
            this.foto.setImagen(imagen);
            this.foto.setFormato(formato);
        }
    }
    
    public Titular getTitular() {
        return titular;
    }
    
    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getPasaporte() != this) {
            titular.setPasaporte(this);
        }
    }
    
    @Override
    public String toString() {
        return "Pasaporte{" +
                "numero='" + numero + '\'' +
                ", fechaEmision=" + fechaEmision +
                ", foto=" + foto +
                ", titular=" + (titular != null ? titular.getNombre() : "null") +
                '}';
    }
}