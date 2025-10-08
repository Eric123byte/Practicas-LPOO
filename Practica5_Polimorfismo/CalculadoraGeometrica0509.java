
package practica5_polimorfismo_codigo;

public class CalculadoraGeometrica0509 {
    
    private RectanguloMorales rectangulo = new RectanguloMorales();
    private CirculoMorales circulo = new CirculoMorales();
    private TrianguloMorales triangulo = new TrianguloMorales();
    
    public double calcularArea(Figura26 figura) {
        double area;
        if(figura instanceof RectanguloMorales){
            rectangulo = (RectanguloMorales)figura;
            area = rectangulo.calcularArea();
        }
        else if(figura instanceof CirculoMorales){
            circulo = (CirculoMorales)figura;
            area = circulo.calcularArea();
        }
        else{
            triangulo = (TrianguloMorales)figura;
            area = triangulo.calcularArea();
        }
        return area;
    }
    
    public double calcularPerimetro(Figura26 figura) {
        double perimetro;
        if(figura instanceof RectanguloMorales){
            rectangulo = (RectanguloMorales)figura;
            perimetro = rectangulo.calcularPerimetro();
        }
        else if(figura instanceof CirculoMorales){
            circulo = (CirculoMorales)figura;
            perimetro = circulo.calcularPerimetro();
        }
        else{
            triangulo = (TrianguloMorales)figura;
            perimetro = triangulo.calcularPerimetro();
        }
        return perimetro;
    }
    
    public String mostrarDatos(Figura26 figura) {
        String cadena;
        if(figura instanceof RectanguloMorales){
            rectangulo = (RectanguloMorales)figura;
            cadena = rectangulo.mostrarDatos();
        }
        else if(figura instanceof CirculoMorales){
            circulo = (CirculoMorales)figura;
            cadena = circulo.mostrarDatos();
        }
        else{
            triangulo = (TrianguloMorales)figura;
            cadena = triangulo.mostrarDatos();
        }
        return cadena;
    }
    
}
