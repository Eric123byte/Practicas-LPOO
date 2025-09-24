
package encapsulamiento;

public class ClienteMorales {
    // Atributos
    protected String nombre;
    protected String apellidos;
    protected String correo;
    protected String telefono;
    protected CuentaBancaria2608 cuenta = new CuentaBancaria2608();
    
    // Constructor
    public ClienteMorales() {
    }
    
    public ClienteMorales(String nombre, String apellidos, String correo, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void cambiarNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void cambiarApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void cambiarCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void cambiarTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    // Métodos
    public void cambiarDatosCuenta(String titular, String tipoCuenta, int estado, int password){
        cuenta.setTitular(titular, password);
        cuenta.setTipo_de_cuenta(tipoCuenta, password);
        if(estado == 1){
            cuenta.activarCuenta(password);
        }
        else{
            cuenta.desactivarCuenta(password);
        }
    }
    
}
