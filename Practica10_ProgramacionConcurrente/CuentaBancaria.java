
package practica10_programacionconcurrente;

public class CuentaBancaria {
    
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public synchronized void depositar(double monto, String cliente) {
        saldo += monto;
        System.out.println(cliente + " deposito $" + monto + " | Saldo actual: $" + saldo);
    }

    public synchronized void retirar(double monto, String cliente) {
        if (monto <= saldo) {
            saldo -= monto;
            System.out.println(cliente + " retiro $" + monto + " | Saldo actual: $" + saldo);
        } else {
            System.out.println(cliente + " intento retirar $" + monto + " pero no tiene fondos suficientes.");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
