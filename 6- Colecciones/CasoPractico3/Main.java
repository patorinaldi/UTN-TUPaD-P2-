package CasoPractico3;

public class Main {
    
    public static void main(String[] args) {
        
        // 1
        System.out.println();
        Universidad universidad = new Universidad("UTN");
        System.out.println("Universidad: " + universidad.getNombre() + " creada exitosamente.");
        System.out.println();

        Profesor p1 = new Profesor("P001", "Dr. Juan Pérez", "Matemáticas");
        Profesor p2 = new Profesor("P002", "Dra. María García", "Física");
        Profesor p3 = new Profesor("P003", "Ing. Carlos López", "Programación");

        System.out.println("Profesores creados exitosamente.");
        System.out.println();

        Curso c1 = new Curso("MAT101", "Cálculo I", null);
        Curso c2 = new Curso("MAT102", "Álgebra Lineal", null);
        Curso c3 = new Curso("FIS101", "Física I", null);
        Curso c4 = new Curso("PROG101", "Programación I", null);
        Curso c5 = new Curso("PROG102", "Programación II", null);

        System.out.println("Cursos creados exitosamente.");
        System.out.println();
        
        // 2
        universidad.agregarProfesor(p1);
        universidad.agregarProfesor(p2);
        universidad.agregarProfesor(p3);

        universidad.agregarCurso(c1);
        universidad.agregarCurso(c2);
        universidad.agregarCurso(c3);
        universidad.agregarCurso(c4);
        universidad.agregarCurso(c5);

        System.out.println("Profesores y Cursos agregados a universidad.");
        System.out.println();

        // 3
        universidad.asignarProfesorACurso("MAT101", "P001");
        universidad.asignarProfesorACurso("MAT102", "P001");
        universidad.asignarProfesorACurso("FIS101", "P002");
        universidad.asignarProfesorACurso("PROG101", "P003");
        universidad.asignarProfesorACurso("PROG102", "P003");
        
        // 4
        System.out.println();
        universidad.listarCursos();
        System.out.println();
        universidad.listarProfesores();
        System.out.println();

        System.out.println("\nCursos por profesor:");
        p1.listarCursos();
        p2.listarCursos();
        p3.listarCursos();

        // 5 
        System.out.println("Cambiando el profesor de 'Álgebra Lineal' de Dr. Juan Pérez a Dra. María García\n");
        universidad.asignarProfesorACurso("MAT102", "P002");
        
        System.out.println("\nVerificando sincronización:");
        System.out.println("\nCursos del Dr. Juan Pérez (P001):");
        p1.listarCursos();
        
        System.out.println("Cursos de la Dra. María García (P002):");
        p2.listarCursos();
        
        System.out.println("Info de Álgebra Lineal:");
        c2.mostrarInfo();
        System.out.println();

        // 6         
        System.out.println("Eliminando el curso 'Física I'...");
        universidad.eliminarCurso("FIS101");
        
        System.out.println("\nVerificando que ya no aparece en la lista del profesor:");
        System.out.println("Cursos de la Dra. María García (P002):");
        p2.listarCursos();
        
        System.out.println("Total de cursos en la universidad: " + universidad.getCursos().size());
        System.out.println();

        // 7
        System.out.println("Eliminando al Ing. Carlos López (P003)...");
        universidad.eliminarProfesor("P003");
        
        System.out.println("\nVerificando que los cursos quedaron sin profesor:");
        System.out.println("\nProgramación I:");
        c4.mostrarInfo();
        
        System.out.println("\nProgramación II:");
        c5.mostrarInfo();
        
        System.out.println("\nTotal de profesores en la universidad: " + universidad.getProfesores().size());
        System.out.println();

        System.out.println("REPORTE: Cantidad de cursos por profesor");
        System.out.println("==========================================");

        for (Profesor profesor : universidad.getProfesores()) {
            System.out.println(profesor.getNombre() + ": " + profesor.getCursos().size() + " curso(s)");
        }
        System.out.println("==========================================");

    }

}
