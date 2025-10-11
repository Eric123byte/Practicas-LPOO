
package practica7_excepciones;

public class Practica7_Excepciones {
    
    public static void main(String[] args) {
        
        SistemaBancoEM banco = new SistemaBancoEM();
        
        ClientesEM c1 = new ClientesEM("2090509", "Eric Morales Sanchez");
        ClientesEM c2 = new ClientesEM("2091234", "Mario Hugo Perez Munioz");
        
        banco.agregarCliente(c1);
        
        // Agregar los comandos necesarios para hacer el archivo log
        try{
            banco.bajaCliente(c2);
        } catch (ExceptionMoralesBase e){
            Logger.escribirExcepcion(e);
        }
        
        banco.agregarCliente(c2);
        
        try{
            banco.mostrarInfo("1234");
        } catch (ExceptionMoralesBase e){
            Logger.escribirExcepcion(e);
        }
        
        try{
            banco.retirar("2091234", 500);
        } catch (ExceptionMoralesBase e){
            Logger.escribirExcepcion(e);
        }
        
        try{
            banco.retirar("2090509", 2000);
        } catch (ExceptionMoralesBase e){
            Logger.escribirExcepcion(e);
        }
        
    }
    
}
