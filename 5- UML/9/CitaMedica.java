import java.util.Date;

public class CitaMedica {

    private Date fecha;
    private String hora;
    private Paciente paciente;
    private Profesional profesional;
    
    public CitaMedica() {}
    
    public CitaMedica(Date fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
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
    
    public Paciente getPaciente() {
        return paciente;
    }
    
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    public Profesional getProfesional() {
        return profesional;
    }
    
    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }
    
    @Override
    public String toString() {
        return "CitaMedica{" +
                "fecha=" + fecha +
                ", hora='" + hora + '\'' +
                ", paciente=" + (paciente != null ? paciente.getNombre() : "null") +
                ", profesional=" + (profesional != null ? profesional.getNombre() : "null") +
                '}';
    }
    
}