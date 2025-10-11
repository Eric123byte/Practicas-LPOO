
package practica7_excepciones;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    
    private static final String RUTA_LOG = "LogErrores.log";
    private static final String INFO_ESTUDIANTE = "Alumno: Eric Morales Sánchez | Matrícula: A01234567";

    public static void escribirExcepcion(Exception e) {
        try (FileWriter fw = new FileWriter(RUTA_LOG, true);
             PrintWriter pw = new PrintWriter(fw)) {

            String fecha = LocalDateTime.now()
                    .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            
            pw.println("--------------------------------------------------");
            pw.println(INFO_ESTUDIANTE);
            pw.println("Fecha: " + fecha);
            pw.println("Excepción: " + e.getClass().getSimpleName());
            pw.println("Mensaje: " + e.getMessage());
            e.printStackTrace(pw);
        } catch (IOException io) {
            System.err.println("Error al escribir en el log: " + io.getMessage());
        }
    }
    
}
