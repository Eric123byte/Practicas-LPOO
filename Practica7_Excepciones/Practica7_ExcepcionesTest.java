
package practica7_excepciones;

import org.junit.Test;
import static org.junit.Assert.*;

public class Practica7_ExcepcionesTest {
    
    public Practica7_ExcepcionesTest() {
    }

    @Test(expected = Matricula26InvalidaException.class)
    public void testExcepcionMatricula() throws ExceptionMoralesBase {
        SistemaBancoEM banco = new SistemaBancoEM();
        try{
            banco.mostrarInfo("1234");
        } catch (Matricula26InvalidaException e){
            Logger.escribirExcepcion(e);
            throw new Matricula26InvalidaException("\nMatricula invalida.");
        }
    }
    
    @Test(expected = Usuario0509NoEncontradoException.class)
    public void testExcepcionUsuario() throws ExceptionMoralesBase {
        SistemaBancoEM banco = new SistemaBancoEM();
        try{
            banco.mostrarInfo("1234567");
        } catch (Usuario0509NoEncontradoException e){
            Logger.escribirExcepcion(e);
            throw new Usuario0509NoEncontradoException("\nNo se encontro al cliente que se desea mostrar.");
        }
    }
    
    @Test
    public void testUsuarioYMatriculaValido() throws ExceptionMoralesBase {
        SistemaBancoEM banco = new SistemaBancoEM();
        ClientesEM c2 = new ClientesEM("2091234", "Mario Hugo Perez Munioz");
        
        banco.agregarCliente(c2);
        
        try{
            banco.mostrarInfo("2091234");
        } catch (Saldo08InsuficienteException e){
            throw new Saldo08InsuficienteException("\nSaldo insuficiente.");
        }
        assertEquals("\nMatricula: 2091234\nNombre: Mario Hugo Perez Munioz\nSaldo: 1000.0",
               "\nMatricula: " + c2.getMatricula() +
               "\nNombre: " + c2.getNombre() +
               "\nSaldo: " + c2.solicitarSaldo());
    }
    
    @Test(expected = Saldo08InsuficienteException.class)
    public void testExcepcionSaldoInsuficiente() throws ExceptionMoralesBase {
        SistemaBancoEM banco = new SistemaBancoEM();
        ClientesEM c2 = new ClientesEM("2091234", "Mario Hugo Perez Munioz");
        
        banco.agregarCliente(c2);
        
        try{
            banco.retirar("2091234", 2000);
        } catch (Saldo08InsuficienteException e){
            Logger.escribirExcepcion(e);
            throw new Saldo08InsuficienteException("\nSaldo insuficiente.");
        }
    }
    
    @Test
    public void testExcepcionSaldoSuficiente() throws ExceptionMoralesBase {
        SistemaBancoEM banco = new SistemaBancoEM();
        ClientesEM c2 = new ClientesEM("2091234", "Mario Hugo Perez Munioz");
        
        banco.agregarCliente(c2);
        
        try{
            banco.retirar("2091234", 200);
        } catch (Saldo08InsuficienteException e){
            throw new Saldo08InsuficienteException("\nSaldo insuficiente.");
        }
        assertEquals("\nSaldo disponible: 800.0", "\nSaldo disponible: " + c2.solicitarSaldo());
    }
    
}
