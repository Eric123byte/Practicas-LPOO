
package practica6_clasesabstractas;

public class Practica6_ClasesAbstractas {

    public static void main(String[] args) {
        
        EmpresaTIE0509 empresa = new EmpresaTIE0509();
        
        VendedorMorales juan = new VendedorMorales("Juan", 23, "8112345678", "juan@gmail.com", 16000, 1);
        DesarrolladorMorales pedro = new DesarrolladorMorales("Pedro", 24, "8187654321", "pedro@hotmail.com", 15000, 3);
        GerenteMorales ana = new GerenteMorales("Ana", 21, "8118273645", "ana@gmail.com", 20000, 3);
        
        empresa.contratar(juan);
        empresa.contratar(pedro);
        empresa.contratar(ana);
        
        empresa.mostrarEmpleados();
        System.out.println("\n---------------------------------------------------------");
        
        empresa.darBono("Juan", 1000);
        empresa.promover("Pedro");
        empresa.aumentarSueldo("Pedro", 5000);
        
        empresa.evaluar("Ana", 4, "Buen trabajo");
        
        empresa.despedir("Juan");
        
        System.out.println("\n---------------------------------------------------------");
        empresa.mostrarEmpleados();
        
        System.out.println("\n---------------------------------------------------------");
        empresa.verEvaluacion("Ana");
        
    }
    
}
