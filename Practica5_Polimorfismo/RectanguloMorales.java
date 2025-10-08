
package practica5_polimorfismo_codigo;

public class RectanguloMorales extends Figura26 implements CalculableE{
    // Atributos
    private double ladoMayor = 0;
    private double ladoMenor = 0;
    
    // Constructores
    public RectanguloMorales() {
    }
    
    public RectanguloMorales(double ladoMayor, double ladoMenor) {
        this.ladoMayor = ladoMayor;
        this.ladoMenor = ladoMenor;
    }
    
    // Getters y Setters
    public double getLadoMayor() {
        return ladoMayor;
    }

    public void setLadoMayor(double ladoMayor) {
        this.ladoMayor = ladoMayor;
    }

    public double getLadoMenor() {
        return ladoMenor;
    }

    public void setLadoMenor(double ladoMenor) {
        this.ladoMenor = ladoMenor;
    }
    
    // Métodos de la interfaz
    @Override
    public double calcularArea() {
        area = ladoMayor * ladoMenor;
        return area;
    }
    
    public double calcularArea(double ladoMayor, double ladoMenor) {
        return (ladoMayor * ladoMenor);
    }

    @Override
    public double calcularPerimetro() {
        perimetro = (2 * ladoMayor) + (2 * ladoMenor);
        return perimetro;
    }
    
    public double calcularPerimetro(double ladoMayor, double ladoMenor) {
        return ((2 * ladoMayor) + (2 * ladoMenor));
    }

    @Override
    public String mostrarDatos() {
        return "\nRECTANGULO\nArea: " + getArea() + "\nPerimetro: " + getPerimetro() + 
                "\nLado mayor: " + ladoMayor + "\nLado menor: " + ladoMenor;
    }
    
    public String mostrarDatos(double ladoMayor, double ladoMenor) {
        return "\nRECTANGULO\nArea: " + getArea() + "\nPerimetro: " + getPerimetro() + 
                "\nLado mayor: " + ladoMayor + "\nLado menor: " + ladoMenor;
    }
    
}
