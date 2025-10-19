
package practica10_programacionconcurrente;

public class CajeroThread26 extends Thread{

    private CuentaBancaria cuenta;
    private String nombre;

    public CajeroThread26(String nombre, CuentaBancaria cuenta) {
        super(nombre);
        this.cuenta = cuenta;
        this.nombre = nombre;
    }

    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            double monto = Math.random() * 300;
            if (Math.random() < 0.5) {
                cuenta.retirar(monto, "Cajero " + nombre);
            } else {
                cuenta.depositar(monto, "Cajero " + nombre);
            }

            try {
                Thread.sleep((int) (Math.random() * 800));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
