
package practica9_entradasalida;

import java.io.Serializable;

public class PersonaESerializable implements Serializable{
    
    private String nombre;
    private String apellido;
    private int edad;

    public PersonaESerializable() {
    }
    
    public PersonaESerializable(String nombre, String Apellido, int edad) {
        this.nombre = nombre;
        this.apellido = Apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String Apellidos) {
        this.apellido = Apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public String toString(){
        return "Nombre: " + nombre +
                ", Apellido: " + apellido +
                ", Edad: " + edad;
    }
    
}
