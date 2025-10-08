
package practica5_polimorfismo_codigo;

public class CirculoMorales extends Figura26 implements CalculableE{
    // Atributos
    private final double pi = 3.14;
    private double radio = 0;
    
    // Constructores
    public CirculoMorales() {
    }
    
    public CirculoMorales(double radio) {
        this.radio = radio;
    }
    
    // Getters y Setters
    public void setRadio(double radio){
        this.radio = radio;
    }
    
    public double getRadio(){
        return radio;
    }
    
    // Métodos de interfaz
    @Override
    public double calcularArea() {
        area = pi * radio * radio;
        return area;
    }
    
    public double calcularArea(double radio) {
        return (pi * radio * radio);
    }

    @Override
    public double calcularPerimetro() {
        perimetro = 2 * pi * radio;
        return perimetro;
    }
    
    public double calcularPerimetro(double radio) {
        return (2 * pi * radio);
    }

    @Override
    public String mostrarDatos() {
        return "\nCIRCULO\nArea: " + getArea() + "\nPerimetro: " + getPerimetro() + "\nRadio: " + getRadio();
    }
    
    public String mostrarDatos(double radio) {
        return "\nCIRCULO\nArea: " + calcularArea(radio) + "\nPerimetro: " + calcularPerimetro(radio) + "\nRadio: " + radio;
    }
    
}
