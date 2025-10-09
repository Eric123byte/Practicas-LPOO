
package practica6_clasesabstractas;

import java.util.ArrayList;
import java.util.Iterator;

public class EmpresaTIE0509 {
    
    ArrayList<EmpleadoEM> empleados = new ArrayList<>();

    public EmpresaTIE0509() {
    }
    
    public void contratar(EmpleadoEM empleado){
        empleados.add(empleado);
    }
    
    public void despedir(String nombre){
        Iterator<EmpleadoEM> iter = empleados.iterator();
        while (iter.hasNext()) {
            EmpleadoEM e = iter.next();
            if (e.getNombre().equals(nombre)) {
                System.out.println("Se despidio a " + e.getNombre());
                iter.remove();
                break;
            }
        }
    }
    
    public void mostrarEmpleados(){
        for(EmpleadoEM e: empleados){
            System.out.println(e.mostrarDatos());
        }
    }
    
    public void evaluar(String nombre, int calif, String desc){
        for(EmpleadoEM e: empleados){
            if(e.getNombre().contentEquals(nombre)){
                e.evaluar(calif, desc);
            }
        }
    }
    
    public void verEvaluacion(String nombre){
        for(EmpleadoEM e: empleados){
            if(e.getNombre().contentEquals(nombre)){
                e.verEvaluacion();
            }
        }
    }
    
    public void darBono(String nombre, double bono){
        for(EmpleadoEM e: empleados){
            if(e.getNombre().contentEquals(nombre)){
                e.darBono(bono);
                System.out.println("\nBono actual: " + e.verBono());
            }
        }
    }
    
    public void promover(String nombre){
        for(EmpleadoEM e: empleados){
            if(e.getNombre().contentEquals(nombre)){
                e.esPromovible();
                e.promover();
            }
        }
    }
    
    public void aumentarSueldo(String nombre, double aumento){
        for(EmpleadoEM e: empleados){
            if(e.getNombre().contentEquals(nombre)){
                e.darAumentoFijo(aumento);
            }
        }
    }
    
}
