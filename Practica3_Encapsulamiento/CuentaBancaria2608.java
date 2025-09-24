
package encapsulamiento;

public class CuentaBancaria2608 {
    // Atributos
    private String titular;
    private String tipo_de_cuenta;
    private float saldo = 1000f;
    private String estado = "Inactivo";
    
    // Constructor
    public CuentaBancaria2608() {
    }
    
    // Getters y Setters
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular, int password) {
        if(password != 509){
            throw new IllegalArgumentException("Constrasenia incorrecta");
        }
        this.titular = titular;
    }

    public String getTipo_de_cuenta() {
        return tipo_de_cuenta;
    }

    public void setTipo_de_cuenta(String tipo_de_cuenta, int password) {
        if(password != 509){
            throw new IllegalArgumentException("Constrasenia incorrecta");
        }
        this.tipo_de_cuenta = tipo_de_cuenta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo, int password) {
        if(password != 509){
            throw new IllegalArgumentException("Constrasenia incorrecta");
        }
        this.saldo = saldo;
    }

    public String isEstado() {
        return estado;
    }

    public void setEstado(String estado, int password) {
        if(password != 509){
            throw new IllegalArgumentException("Constrasenia incorrecta");
        }
        this.estado = estado;
    }
    
    // Métodos
    @Override
    public String toString() {
        return "Titular: " + this.getTitular() + 
               "\nTipo de cuenta: " + this.getTipo_de_cuenta() +
               "\nSaldo: " + this.getSaldo() +
               "\nEstado: " + this.isEstado();
    }
    
    public void retirar(float monto, int password){
        if(monto <= 0){
            System.out.println("Solo se pueden retirar cantidades mayoresa cero");
        }
        float saldo_disp = this.getSaldo();
        if(saldo_disp < monto){
            System.out.println("No cuenta con suficiente saldo para realizar esta transacción");
        }
        else{
            this.setSaldo(saldo_disp-monto, password);
            System.out.println("Retiro realizado con exito\nSaldo actual: " + this.getSaldo());
        }
    }
    
    public void depositar(float monto, int password){
        if(monto <= 0){
            System.out.println("Solo se pueden depositar cantidades mayores a cero");
        }
        this.setSaldo(this.getSaldo()+monto, password);
        System.out.println("Deposito realizado con exito\nSaldo actual: " + this.getSaldo());
    }
    
    public void solicitarSaldo(){
        System.out.println("Saldo actual: " + this.getSaldo());
    }
    
    public void activarCuenta(int password){
        this.setEstado("Activo", password);
    }
    
    public void desactivarCuenta(int password){
        this.setEstado("Inactivo", password);
    }
    
}
