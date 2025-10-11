
package practica7_excepciones;

import java.util.ArrayList;
import java.util.Iterator;

public class SistemaBancoEM {
    
    ArrayList<ClientesEM> clientes = new ArrayList<>();

    public SistemaBancoEM() {
    }
    
    public void agregarCliente(ClientesEM cliente){
        clientes.add(cliente);
        System.out.println("\nCliente agregado con exito.");
    }
    
    public void bajaCliente(ClientesEM cliente) throws Usuario0509NoEncontradoException{
        boolean found = false;
        Iterator<ClientesEM> c = clientes.iterator();
        while(c.hasNext()){
            ClientesEM aux = c.next();
            if(aux.equals(cliente)){
                found = true;
                c.remove();
            }
        }
        if(found == false){
            throw new Usuario0509NoEncontradoException("\nNo se encontro al cliente que se desea dar de baja.");
        }
    }
    
    public void depositar(String id, double monto) throws ExceptionMoralesBase{
        boolean found = false;
        for(ClientesEM c: clientes){
            if(c.getMatricula().equals(id)){
                found = true;
                c.depositar(monto);
                break;
            }
        }
        if(id.length() != 7){
            throw new Matricula26InvalidaException("\nMatricula invalida.");
        }
        if(found == false){
            throw new Usuario0509NoEncontradoException("\nNo se encontro al cliente deseado.");
        }
    }
    
    public void retirar(String id, double monto) throws ExceptionMoralesBase{
        boolean found = false;
        for(ClientesEM c: clientes){
            if(c.getMatricula().equals(id)){
                found = true;
                if(monto <= c.solicitarSaldo()){
                    c.retiro(monto);
                } else {
                    throw new Saldo08InsuficienteException("\nSaldo insuficiente.");
                }
                break;
            }
        }
        if(id.length() != 7){
            throw new Matricula26InvalidaException("\nMatricula invalida.");
        }
        if(found == false){
            throw new Usuario0509NoEncontradoException("\nNo se encontro al cliente deseado.");
        }
    }
    
    public void mostrarInfo(String id) throws ExceptionMoralesBase{
        boolean found = false;
        for(ClientesEM c: clientes){
            if(c.getMatricula().equals(id)){
                found = true;
                System.out.println(c.solicitarInfo());
                break;
            }
        }
        if(id.length() != 7){
            throw new Matricula26InvalidaException("\nMatricula invalida.");
        }
        if(found == false){
            throw new Usuario0509NoEncontradoException("\nNo se encontro al cliente deseado.");
        }
    }
    
}
