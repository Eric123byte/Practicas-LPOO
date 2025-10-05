
package VehiculoE;

public class AutoMorales extends VehiculoBaseE {
    
    int numeroDePuertas;
    String tipoDeAuto;
    
    public AutoMorales(String marca, String modelo, int numeroDePuertas, String tipoDeAuto){
        super(marca, modelo);
        this.numeroDePuertas = numeroDePuertas;
        this.tipoDeAuto = tipoDeAuto;
    }
    
    public void setNumeroDePuertas(int num){
        this.numeroDePuertas = num;
    }
    
    public int getNumeroDePuertas(){
        return this.numeroDePuertas;
    }
    
    public void setTipoDeAuto(String tipo){
        this.tipoDeAuto = tipo;
    }
    
    public String getTipoDeAuto(){
        return this.tipoDeAuto;
    }
    
    @Override
    public void encender(){
        System.out.println("Brrrruuuummm");
    }
    
    @Override
    public void apagar(){
        System.out.println("FUUUUuuuumm");
        super.apagar();
    }
    
    @Override
    public void pitar(){
        System.out.println("Piiiiippp");
    }
    
    @Override
    public String toString(){
        return "Marca: " + this.getMarca() +
        "\nModelo: " + this.getModelo() +
        "\nNumero de puertas: " + this.getNumeroDePuertas() +
        "\nTipo de auto: " + this.getTipoDeAuto() +
        "\n";
    }

}
