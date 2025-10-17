
package practica9_entradasalida;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class GestorArchivosMorales0509 {
    
    public void escribirArchivoTxt(String texto){
        try (FileWriter writer = new FileWriter("datos_2090509.txt")) {
            writer.write(texto);
            System.out.println("\nSe ha escrito en el archivo correctamente.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
    
    public void leerArchivoTxt(String nombre){
        try (BufferedReader br = new BufferedReader(new FileReader(nombre))) {
            String linea;
            System.out.println("");
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void moverArchivo(String inicio, String fin){
        Path origen = Paths.get(inicio);
        Path destino = Paths.get(fin);
        File carpetaBackup = new File("Backups");
        if (!carpetaBackup.exists()) {
            boolean creada = carpetaBackup.mkdirs();
            if (creada) {
                System.out.println("Carpeta 'backups' creada.");
            } else {
                System.out.println("No se pudo crear la carpeta 'backups'.");
            }
        }
        try {
            Files.move(origen, destino, StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {
            System.out.println("Error al mover el archivo: " + e.getMessage());
        }
    }
    
    public String serializarPersonaBackup(List<PersonaESerializable> p){
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String nombreArchivo = "backup_2608_" + timestamp + ".dat";
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            oos.writeObject(p);
        } catch (IOException e) {
            System.out.println("Error al crear el backup: " + e.getMessage());
        }
        moverArchivo(nombreArchivo, "Backups/" + nombreArchivo);
        return nombreArchivo;
    }
    
    public List<PersonaESerializable> leerPersonas(String nombre){
        try{
            try (
                FileInputStream fis = new FileInputStream("Backups/" + nombre);
                ObjectInputStream ois = new ObjectInputStream(fis)
            ) {
                List<PersonaESerializable> p = (List<PersonaESerializable>) ois.readObject();
                p.forEach(System.out::println);
                return p;
            } catch (FileNotFoundException e) {
                System.out.println("\nNo se encontro el archivo. " + e.getMessage());
            } catch (IOException e) {
                System.out.println("Error de E/S al leer el archivo. " + e.getMessage());
            }
        } catch (Exception e){
            System.out.println("Error: La clase del objeto no se encontró.");
        }
        return null;
    }
    
    public void crearEstudianteCSV(){
        String rutaArchivo = "log_Morales.csv";
        try (PrintWriter writer = new PrintWriter(new FileWriter(rutaArchivo))) {
            writer.println("nombre,apellidos,edad");
            writer.println("Eric,MoralesSanchez,19");
        } catch (IOException e) {
            System.out.println("Error al crear el CSV: " + e.getMessage());
        }
    }
    
    public void leerEstudianteCSV(){
        String ruta = "log_Morales.csv";
        try (Scanner scanner = new Scanner(new File(ruta))) {
            boolean primeraLinea = true;
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                if (primeraLinea) {
                    primeraLinea = false;
                    continue;
                }
                String[] partes = linea.split(",");
                String nombre = partes[0].trim();
                String apellidos = partes[1].trim();
                int edad = Integer.parseInt(partes[2].trim());
                PersonaESerializable p = new PersonaESerializable(nombre, apellidos, edad);
                System.out.println(p);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
}
