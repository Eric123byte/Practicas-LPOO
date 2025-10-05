
package VehiculoE;

public class MotocicletaMorales extends VehiculoBaseE {
    
    String tipoDeMoto;
    
    public MotocicletaMorales(String marca, String modelo, String tipoDeMoto){
        super(marca, modelo);
        this.tipoDeMoto = tipoDeMoto;
    }
    
    public void setTipoDeMoto(String tipo){
        this.tipoDeMoto = tipo;
    }
    
    public String getTipoDeMoto(){
        return this.tipoDeMoto;
    }
    
    @Override
    public void encender(){
        System.out.println("Brum Brum");
    }
    
    @Override
    public void apagar(){
        System.out.println("Fmmmmmm");
        super.apagar();
    }
    
    @Override
    public void pitar(){
        System.out.println("pip pip");
    }
    
    @Override
    public String toString(){
        return "Marca: " + this.getMarca() +
        "\nModelo: " + this.getModelo() +
        "\nTipo de moto: " + this.getTipoDeMoto() +
        "\n";
    }

}
