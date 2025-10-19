
package practica10_programacionconcurrente;

public class ClienteRunnable08 implements Runnable{
    
    private String nombre;
    private CuentaBancaria cuenta;

    public ClienteRunnable08(String nombre, CuentaBancaria cuenta) {
        this.nombre = nombre;
        this.cuenta = cuenta;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            double monto = Math.random() * 500;
            if (Math.random() < 0.5) {
                cuenta.depositar(monto, nombre);
            } else {
                cuenta.retirar(monto, nombre);
            }

            try {
                Thread.sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
