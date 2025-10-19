
package practica10_programacionconcurrente;

public class Productor implements Runnable{
    
    private Buffer buffer;

    public Productor(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                buffer.producir(i);
                Thread.sleep((int)(Math.random() * 500));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
