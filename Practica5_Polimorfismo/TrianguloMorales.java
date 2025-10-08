
package practica5_polimorfismo_codigo;

public class TrianguloMorales extends Figura26 implements CalculableE{
    // Atributos
    private double a = 0;
    private double b = 0;
    private double c = 0;
    private double altura = 0;
    
    // Constructores
    public TrianguloMorales() {
    }
    
    public TrianguloMorales(double base, double altura, double catetoA, double catetoC) {
        this.b = base;
        this.altura = altura;
        this.c = catetoC;
        this.a = catetoA;
    }
    
    // Getters y Setters
    public double getBase() {
        return b;
    }

    public void setBase(double base) {
        this.b = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getCatetoA() {
        return a;
    }

    public void setCatetoA(double a) {
        this.a = a;
    }

    public double getCatetoC() {
        return c;
    }

    public void setCatetoC(double c) {
        this.c = c;
    }
    
    // Métodos de la interfaz
    @Override
    public double calcularArea() {
        area = (b * altura) / 2;
        return area;
    }
    
    public double calcularArea(double base, double altura) {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        perimetro = a + b + c;
        return perimetro;
    }
    
    public double calcularPerimetro(double a, double b, double c) {
        return (a + b + c);
    }

    @Override
    public String mostrarDatos() {
        return "\nTRIANGULO\nArea: " + getArea() + "\nPerimetro: " + getPerimetro() + 
                "\nCateto A: " + a + "\nCateto B: " + b + "\nCateto C: " + c;
    }
    
    public String mostrarDatos(double base, double altura, double catetoA, double catetoC) {
        return "\nTRIANGULO\nArea: " + calcularArea(base, altura) +
                "\nPerimetro: " + calcularPerimetro(catetoA, base, catetoC) + 
                "\nCateto A: " + catetoA + "\nCateto B: " + base + "\nCateto C: " + catetoC;
    }
    
}
