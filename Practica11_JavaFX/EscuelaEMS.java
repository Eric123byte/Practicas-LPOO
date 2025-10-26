
package Practica11_GUI;

import java.util.Iterator;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class EscuelaEMS {
    
    private ObservableList<EstudianteEMS> estudiantes;

    public EscuelaEMS() {
    estudiantes = FXCollections.observableArrayList();
    }
    
    public ObservableList<EstudianteEMS> lista(){
        return estudiantes;
    }
    
    public void crearRegistro(String nombre, String apellidoP, String apellidoM, String matricula, String carrera, boolean activo){
        estudiantes.add(new EstudianteEMS(nombre, apellidoP, apellidoM, matricula, carrera, activo));
    }
    
    public EstudianteEMS buscarRegistro(String matricula){
        for(EstudianteEMS est: estudiantes){
            if(est.getMatricula().equals(matricula)){
                return est;
            }
        }
        return null;
    }
    
    public void actualizarRegistro(String matricula, String nombre, String apellidoP, String apellidoM, String carrera, boolean activo){
        Iterator<EstudianteEMS> i = estudiantes.iterator();
        while(i.hasNext()){
            EstudianteEMS est = i.next();
            if(est.getMatricula().equals(matricula)){
                est.setNombre(nombre);
                est.setApellidoP(apellidoP);
                est.setApellidoM(apellidoM);
                est.setCarrera(carrera);
                est.setEstado(activo);
                est.setMatricula(matricula);
                return;
            }
        }
    }
    
    public void eliminarRegistro(String matricula){
        Iterator<EstudianteEMS> i = estudiantes.iterator();
        while(i.hasNext()){
            EstudianteEMS est = i.next();
            if(est.getMatricula().equals(matricula)){
                i.remove();
                return;
            }
        }
    }
    
    @Override
    public String toString(){
        String cadena = "";
        Iterator<EstudianteEMS> i = estudiantes.iterator();
        while(i.hasNext()){
            EstudianteEMS est = i.next();
            cadena += est.toString();
        }
        return cadena;
    }
    
}
