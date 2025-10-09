
package practica6_clasesabstractas;

public abstract class EmpleadoEM implements Promovible0509, Bonificable26, Evaluable08{
    // Atributos
    private String nombre;
    private int edad;
    private String telefono;
    private String correo;
    private double sueldo;
    private int aniosEmpresa;
    
    // Metodos abstractos
    public abstract void trabajar();
    public abstract String mostrarDatos();
    
    // Métodos concretos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getAniosEmpresa() {
        return aniosEmpresa;
    }

    public void setAniosEmpresa(int aniosEmpresa) {
        this.aniosEmpresa = aniosEmpresa;
    }
    
}
