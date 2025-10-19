
package practica10_programacionconcurrente;

public class Practica10_ProgramacionConcurrente {

    public static void main(String[] args) {
        
        long tBancoInicio = System.currentTimeMillis();
        
        System.out.println("-----------------------------------------");
        System.out.println("SIMULADOR DE BANCO CON HILOS\n");

        CuentaBancaria cuenta = new CuentaBancaria(1000);

        ClienteRunnable08 cliente1 = new ClienteRunnable08("Eric", cuenta);
        ClienteRunnable08 cliente2 = new ClienteRunnable08("Ana", cuenta);
        CajeroThread26 cajero1 = new CajeroThread26("1", cuenta);

        Thread t1 = new Thread(cliente1);
        Thread t2 = new Thread(cliente2);
        cajero1.start();
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
            cajero1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nSaldo final en cuenta: $" + cuenta.getSaldo());
        
        long tBancoFin = System.currentTimeMillis();
        
        System.out.println("-----------------------------------------");
        System.out.println("\nPATRON PRODUCTOR-CONSUMIDOR\n");
        
        long tPCInicio = System.currentTimeMillis();
        
        Buffer buffer = new Buffer(3);

        Thread prod1 = new Thread(new Productor(buffer));
        Thread cons1 = new Thread(new Consumidor(buffer));

        prod1.start();
        cons1.start();

        try {
            prod1.join();
            cons1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        long tPCFin = System.currentTimeMillis();

        long tPoolInicio = System.currentTimeMillis();
        
        ThreadPoolMorales pool = new ThreadPoolMorales();
        pool.ejecutarTarea();
        
        long tPoolFin = System.currentTimeMillis();
        
        System.out.println("-----------------------------------------");
        System.out.println("\nFIN DE LA EJECUCION\n");

        System.out.println("Tiempo simulador banco: " + (tBancoFin - tBancoInicio) + " ms");
        System.out.println("Tiempo simulador producto-consumidor: " + (tPCFin - tPCInicio) + " ms");
        System.out.println("Tiempo simulador Threads Pool: " + (tPoolFin - tPoolInicio) + " ms\n");

    }
    
}
