
package practica7_excepciones;

public class ClientesEM {
    
    private String matricula;
    private String nombre;
    private double saldo = 1000;

    public ClientesEM(String matricula, String nombre) {
        this.matricula = matricula;
        this.nombre = nombre;
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void cambiarNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void depositar(double deposito){
        saldo += deposito;
        System.out.println("\nSaldo disponible: " + saldo);
    }
    
    public void retiro(double monto){
        saldo -= monto;
        System.out.println("\nSaldo disponible: " + saldo);
    }
    
    public double solicitarSaldo(){
        return saldo;
    }
    
    public String solicitarInfo(){
        return "\nMatricula: " + matricula +
               "\nNombre: " + nombre +
               "\nSaldo: " + saldo;
    }
    
}
