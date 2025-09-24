
package encapsulamiento;

import org.junit.Test;
import static org.junit.Assert.*;

public class CuentaBancaria2608Test {
    
    public CuentaBancaria2608Test() {
    }
    
    @Test
    public void testSetTitular() {
        System.out.println("setTitular");
        CuentaBancaria2608 cuenta = new CuentaBancaria2608();
        cuenta.setTitular("Eric", 509);
        assertEquals("Eric", cuenta.getTitular());
    }
    
    @Test
    public void testSetTipo_de_cuenta() {
        System.out.println("setTipo_de_cuenta");
        String tipo_de_cuenta = "Ahorro";
        CuentaBancaria2608 cuenta = new CuentaBancaria2608();
        cuenta.setTipo_de_cuenta(tipo_de_cuenta, 509);
        assertEquals("Ahorro", cuenta.getTipo_de_cuenta());
    }
    
    @Test
    public void testSetSaldo() {
        System.out.println("setSaldo");
        CuentaBancaria2608 cuenta = new CuentaBancaria2608();
        cuenta.setSaldo(2000f, 509);
        assertEquals(2000, cuenta.getSaldo(), 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetEstadoPasswordIncorrecto() {
        System.out.println("setEstado");
        CuentaBancaria2608 cuenta = new CuentaBancaria2608();
        cuenta.setEstado("Activo", 59);
    }

    @Test
    public void testRetirarYDepositar() {
        System.out.println("retirar y depositar");
        CuentaBancaria2608 cuenta = new CuentaBancaria2608();
        int password = 509;
        float saldoActual = cuenta.getSaldo();
        cuenta.retirar(500f, password);
        cuenta.depositar(1000f, password);
        assertEquals(saldoActual + 500, cuenta.getSaldo(), 0.01);
    }

    @Test
    public void testActivarYDesactivarCuenta() {
        CuentaBancaria2608 cuenta = new CuentaBancaria2608();
        cuenta.activarCuenta(509);
        assertEquals("Activo", cuenta.isEstado());
        cuenta.desactivarCuenta(509);
        assertEquals("Inactivo", cuenta.isEstado());
    }
    
}
