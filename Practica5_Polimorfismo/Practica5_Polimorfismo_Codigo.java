
package practica5_polimorfismo_codigo;

// Eric Morales Sánchez

public class Practica5_Polimorfismo_Codigo {

    public static void main(String[] args) {
        CirculoMorales c = new CirculoMorales(5);
        TrianguloMorales t = new TrianguloMorales(3, 4, 5, 5);
        RectanguloMorales r = new RectanguloMorales(5, 3);
        
        Figura26[] figuras = new Figura26[3];
        figuras[0] = c;
        figuras[1] = t;
        figuras[2] = r;
        
        CalculadoraGeometrica0509 calculadora = new CalculadoraGeometrica0509();
        
        for(Figura26 f: figuras){
            calculadora.calcularArea(f);
            calculadora.calcularPerimetro(f);
            System.out.println(calculadora.mostrarDatos(f));
        }
        
    }
    
}
