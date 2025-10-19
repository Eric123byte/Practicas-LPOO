
package practica10_programacionconcurrente;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolMorales {
    
    public void ejecutarTarea(){
        ExecutorService pool = Executors.newFixedThreadPool(3);

        System.out.println("\nEJECUTANDO TAREAS EN POOL DE HILOS\n");

        for (int i = 1; i <= 5; i++) {
            int id = i;
            pool.execute(() -> {
                System.out.println("Tarea " + id + " ejecutada por " + Thread.currentThread().getName());
            });
        }

        pool.shutdown();
    }
    
}
