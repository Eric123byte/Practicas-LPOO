
package practica10_programacionconcurrente;

public class Consumidor implements Runnable{
    
    private Buffer buffer;

    public Consumidor(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                buffer.consumir();
                Thread.sleep((int)(Math.random() * 600));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
