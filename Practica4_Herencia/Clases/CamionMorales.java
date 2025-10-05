
package VehiculoE;

public class CamionMorales extends VehiculoBaseE {
    
    String tipo;
    int cantidadRuedas;
    double peso;
    double altura;
    double longitud;
    
    public CamionMorales(String marca, String modelo, String tipo, int cantidadRuedas, double peso, double altura, double longitud){
        super(marca, modelo);
        this.tipo = tipo;
        this.cantidadRuedas = cantidadRuedas;
        this.peso = peso;
        this.altura = altura;
        this.longitud = longitud;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public void setCantidadRuedas(int ruedas){
        this.cantidadRuedas = ruedas;
    }
    
    public void setPeso(double peso){
        this.peso = peso;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public void setLongitud(double longitud){
        this.longitud = longitud;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public int getCantidadDeRuedas(){
        return this.cantidadRuedas;
    }
    
    public double getPeso(){
        return this.peso;
    }
    
    public double getAltura(){
        return this.altura;
    }
    
    public double getLongitud(){
        return this.longitud;
    }
    
    @Override
    public void encender(){
        System.out.println("BROOOOMMM");
    }
    
    @Override
    public void apagar(){
        System.out.println("tssssss");
        super.apagar();
    }
    
    @Override
    public void pitar(){
        System.out.println("TUUUUUNN TUUUUUUNN");
    }
    
    public void choque(){
        System.out.println("CRAAAAAASSSSSHHHHHHH");
        System.out.println("OOOO NOOOO!!, el " + this.tipo + " de modelo " + this.getModelo() + " choco!");
    }
    
    @Override
    public String toString(){
        return "Marca: " + this.getMarca() +
        "\nModelo: " + this.getModelo() +
        "\nTipo de camion: " + this.getTipo() + 
        "\nCantidad de ruedas: " + this.getCantidadDeRuedas() + 
        "\nPeso: " + this.getPeso() + 
        "\nAltura: " + this.getAltura() + 
        "\nLongitud: " + this.getLongitud() +
        "\n";
    }

}
