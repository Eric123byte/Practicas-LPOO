
package practica10_programacionconcurrente;

import java.util.LinkedList;
import java.util.Queue;

public class Buffer {
    
    private Queue<Integer> cola = new LinkedList<>();
    private int limite;

    public Buffer(int limite) {
        this.limite = limite;
    }

    public synchronized void producir(int valor) throws InterruptedException {
        while (cola.size() == limite) {
            wait();
        }
        cola.add(valor);
        System.out.println("Producido: " + valor + " | Tamanio buffer: " + cola.size());
        notifyAll();
    }

    public synchronized int consumir() throws InterruptedException {
        while (cola.isEmpty()) {
            wait();
        }
        int valor = cola.poll();
        System.out.println("Consumido: " + valor + " | Tamanio buffer: " + cola.size());
        notifyAll();
        return valor;
    }
    
}
