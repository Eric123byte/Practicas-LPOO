
package VehiculoE;

public class VehiculoBaseE {
    private String marca;
    private String modelo;
    
    public VehiculoBaseE(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public VehiculoBaseE(){
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public void encender(){
        System.out.println("Encendido");
    }
    
    public void apagar(){
        System.out.println("Apagado");
    }
    
    public void pitar(){
        System.out.println("Claxon");
    }

}
