
package VehiculoE;

import java.util.ArrayList;

public class Consecionaria0509 {
    
    ArrayList<VehiculoBaseE> vehiculos = new ArrayList<>();
    
    public void reponerVehiculo(VehiculoBaseE v){
        vehiculos.add(v);
    }
    
    public void venderVehiculo(VehiculoBaseE v){
        vehiculos.remove(v);
    }
    
    public void pruebaVehiculo(VehiculoBaseE v){
        v.encender();
        v.pitar();
        v.apagar();
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (VehiculoBaseE v : vehiculos) {
            sb.append(v.toString()).append("\n");
        }
        return sb.toString();
    }
}
