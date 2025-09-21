
package clasesyobjetos;

public class Universidad0509 {
    // Atributos
    EstudianteEM[] estudiantes = new EstudianteEM[5];
    
    // Constructor
    public Universidad0509() {
    }
    
    // Mtétodos
    public void agregarEstudiante(EstudianteEM estudiante) {
        if(estudiantes[4] != null){
            System.out.println("\nRegistro lleno");
        }
        else{
            for(int i = 0; i < 5; i++){
                if(estudiantes[i] == null){
                    estudiantes[i] = estudiante;
                    break;
                }
            }
        }
    }
    
    public void buscarEstudiante(int matricula) {
        int i = 0, encontrado = 0;
        while(i < 5 && estudiantes[i] != null){
            if(estudiantes[i].getMatricula() == matricula){
                System.out.println("\nEl alumno con matricula " + matricula + " SI se encuentra registrado");
                encontrado = 1;
                break;
            }
            i++;
        }
        if(encontrado == 0){
            System.out.println("\nEl alumno con matricula " + matricula + " NO se encuentra registrado");
        }
    }
    
    public void mostrarRegistro() {
        int i = 0;
        System.out.println("______________________________________________");
        System.out.println("\nRegistro actual:");
        while(i < 5 && estudiantes[i] != null){
            estudiantes[i].mostrarInfo();
            i++;
        }
        System.out.println("______________________________________________");
    }
    
}
