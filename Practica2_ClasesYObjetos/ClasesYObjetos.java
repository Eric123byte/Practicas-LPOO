
package clasesyobjetos;

// Eric Morales Sánchez
// Matrícula: 2090509

public class ClasesYObjetos {

    public static void main(String[] args) {
        // Creamos los objetos
        EstudianteEM alumno1 = new EstudianteEM();
        EstudianteEM alumno2 = new EstudianteEM("Juan", 1234567, 20);
        EstudianteEM alumno3 = new EstudianteEM("Maria", "LM", 7654321, 19, 5);
        EstudianteEM alumno4 = new EstudianteEM("Jose", "LF", 9987654, 18, 4);
        EstudianteEM alumno5 = new EstudianteEM("Mario", "LCC", 4567890, 21, 9);
        
        Universidad0509 fcfm = new Universidad0509();
        
        // Usamos métodos de Estudiante para llenar el objeto alumno1
        System.out.println("\n--Pasamos informacion a 'alumno1'--");
        alumno1.cambiarNombre("Carmen");
        alumno1.cambioCarrera("LSTI", 1);
        alumno1.setMatricula(1029384);
        alumno1.actualizarEdad(17);
        
        // // Usamos los metodos de Universidad para buscar a un estudiante
        System.out.println("\n--Buscamos a un alumno en 'fcfm'--");
        fcfm.buscarEstudiante(4567890);
        
        // Usamos los metodos de Universidad para llenar el registro fcfm
        System.out.println("\n--Llenamos y mostramos nuestro registro--");
        fcfm.agregarEstudiante(alumno1);
        fcfm.agregarEstudiante(alumno2);
        fcfm.agregarEstudiante(alumno3);
        fcfm.agregarEstudiante(alumno4);
        fcfm.agregarEstudiante(alumno5);
        fcfm.mostrarRegistro();
        
        // // Usamos los metodos de Universidad para buscar a un estudiante
        System.out.println("\n--Buscamos nuevamente a un alumno en 'fcfm'--");
        fcfm.buscarEstudiante(4567890);
        
    }
    
}
