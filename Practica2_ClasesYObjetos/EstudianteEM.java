
package clasesyobjetos;

public class EstudianteEM {
    // Atributos
    String nombre, carrera;
    int matricula, edad, semestreActual;

    // Constructores
    public EstudianteEM() {
    }

    public EstudianteEM(String nombre, int matricula, int edad) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.edad = edad;
    }
    
    public EstudianteEM(String nombre, String carrera, int matricula, int edad, int semestreActual) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.matricula = matricula;
        this.edad = edad;
        this.semestreActual = semestreActual;
    }
    
    // Métodos

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public void cambiarNombre(String nombre) {
        this.nombre = nombre;
        System.out.println("\nNuevo nombre: " + this.nombre);
    }
    
    public void cambioCarrera(String carrera, int semestreNuevo) {
        this.carrera = carrera;
        this.semestreActual = semestreNuevo;
        System.out.println("\nEl alumno " + this.nombre + " se cambio a la carrera " + this.carrera + 
                "\nSemestre actual: " + this.semestreActual);
    }
    
    public void mostrarSemestre() {
        System.out.println("\nEl semestre actual del estudiante " + this.nombre + " es " + this.semestreActual);
    }
    
    public void actualizarSemestre(int semestre) {
        this.semestreActual = semestre;
        System.out.println("\nSemestre actualizado a " + this.semestreActual);
    }
    
    public void actualizarEdad(int edad) {
        this.edad = edad;
        System.out.println("\nSe cambio la edad a " + this.edad);
    }
    
    public void mostrarInfo() {
        System.out.println("\nNombre: " + this.nombre);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Edad: " + this.edad);
        System.out.println("Carrera: " + this.carrera);
        System.out.println("Semestre actual: " + this.semestreActual);
    }
    
}
