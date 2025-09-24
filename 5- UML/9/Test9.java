import java.util.Date;
import java.util.Calendar;

public class Test9 {
    
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(2024, Calendar.DECEMBER, 15);
        Date fechaCita = cal.getTime();
        
        Paciente paciente1 = new Paciente("María González", "OSDE");
        
        Profesional profesional1 = new Profesional("Dr. Rodríguez", "Cardiología");
        Profesional profesional2 = new Profesional("Dra. Martínez", "Dermatología");
        
        CitaMedica cita1 = new CitaMedica(fechaCita, "14:30");
        cita1.setPaciente(paciente1);
        cita1.setProfesional(profesional1);
        
        System.out.println("=== Cita inicial ===");
        System.out.println(cita1);
        
        System.out.println("\n=== Asociaciones unidireccionales ===");
        System.out.println("La cita conoce al paciente: " + cita1.getPaciente().getNombre());
        System.out.println("La cita conoce al profesional: " + cita1.getProfesional().getNombre());
        System.out.println("El paciente y profesional existen independientemente de la cita");
        
        CitaMedica cita2 = new CitaMedica(fechaCita, "16:00");
        cita2.setPaciente(paciente1);
        cita2.setProfesional(profesional2);
        
        System.out.println("\nNueva cita del mismo paciente: " + cita2);
        
    }

}