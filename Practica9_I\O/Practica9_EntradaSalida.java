
package practica9_entradasalida;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Practica9_EntradaSalida {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        GestorArchivosMorales0509 gestor = new GestorArchivosMorales0509();
        List<PersonaESerializable> personas = new ArrayList<>();
        List<String> backups = new ArrayList<>();
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        
        scheduler.scheduleAtFixedRate(() -> backups.add(gestor.serializarPersonaBackup(personas)), 0, 30, TimeUnit.SECONDS);
        
        int op;
        
        do{
            op = 0;
            System.out.println("\n----------------------------------------------");
            System.out.println("\nMenu");
            System.out.println("\n1. Escribir en archivo 'datos'\n2. Leer archivo 'datos'\n3. Crear registro de una persona\n4. Mostrar backup\n5. Mostrar informacion del estudiante\n6. Salir");
            do{
                while(true){
                    try{
                        System.out.print("\nIngrese la opcion deseada: ");
                        op = Integer.parseInt(in.nextLine());
                        break;
                    } catch (NumberFormatException e){
                        System.out.println("\nSolo se permiten numeros enteros");
                    }
                }
            }while(op < 1 || op > 6);
            switch(op){
                case 1:     // Escribir en archivo txt
                    String texto;
                    System.out.println("\nIngrese el texto que desea guardar en el archivo 'datos_2090509.txt':");
                    texto = in.nextLine();
                    gestor.escribirArchivoTxt(texto);
                    break;
                case 2:     // Leer archivo txt
                    String nombre = "datos_2090509.txt";
                    System.out.println("\nTexto del archivo 'datos_2090509.txt':");
                    gestor.leerArchivoTxt(nombre);
                    break;
                case 3:     // Guardar persona
                    String nombreP, apellido;
                    int edad;
                    System.out.print("\nIngrese el nombre de la persona: ");
                    nombreP = in.nextLine();
                    System.out.print("\nIngrese el apellido paterno de la persona: ");
                    apellido = in.nextLine();
                    while (true){
                        try{
                            System.out.print("\nIngrese la edad de la persona: ");
                            edad = Integer.parseInt(in.nextLine());
                            break;
                        } catch (NumberFormatException e){
                            System.out.println("\nSolo se permiten numeros enteros");
                        }
                    }
                    personas.add(new PersonaESerializable(nombreP, apellido, edad));
                    break;
                case 4:     // Mostramos backup
                    System.out.println("\n----------------------------------------------");
                    System.out.println("\nMostrar backup");
                    System.out.println("\n1. Ingresar el nombre del archivo\n2. Ultimo backup realizado");
                    int op2;
                    do{
                        while(true){
                            op2 = 0;
                            try{
                                System.out.print("\nIngrese la opcion deseada: ");
                                op2 = Integer.parseInt(in.nextLine());
                                break;
                            } catch (NumberFormatException e){
                                System.out.println("\nSolo se permiten numeros enteros");
                            }
                        }
                    }while(op2 != 1 && op2 != 2);
                    switch(op2){
                        case 1:     // Mostrar backups por el nombre
                            String nombreA;
                            System.out.print("\nIngrese el nombre del archivo: ");
                            nombreA = in.nextLine();
                            System.out.println("");
                            gestor.leerPersonas(nombreA);
                            break;
                        case 2:     // Mostrar ultimo backup
                            System.out.println("");
                            if (backups.isEmpty()) {
                                System.out.println("\nAún no se ha generado ningún backup.");
                            } else {
                                gestor.leerPersonas(backups.getLast());
                            }
                            break;
                    }
                    break;
                case 5:
                    System.out.println("");
                    gestor.leerEstudianteCSV();
                    break;
                case 6:     
                    scheduler.shutdown();
                    try {
                        if (!scheduler.awaitTermination(3, TimeUnit.SECONDS)) {
                            scheduler.shutdownNow();
                        }
                    } catch (InterruptedException e) {
                        scheduler.shutdownNow();
                        Thread.currentThread().interrupt();
                    }
                    break;
            }
        }while(op != 6);
        
        
    }
    
}
