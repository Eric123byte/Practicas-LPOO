package encapsulamiento;

import org.junit.Test;
import static org.junit.Assert.*;

public class ClienteMoralesTest {

    @Test
    public void testGetAndSetNombre() {
        ClienteMorales cliente = new ClienteMorales();
        cliente.cambiarNombre("Eric");
        assertEquals("Eric", cliente.getNombre());
    }

    @Test
    public void testGetAndSetApellidos() {
        ClienteMorales cliente = new ClienteMorales();
        cliente.cambiarApellidos("Morales Sánchez");
        assertEquals("Morales Sánchez", cliente.getApellidos());
    }

    @Test
    public void testGetAndSetCorreo() {
        ClienteMorales cliente = new ClienteMorales();
        cliente.cambiarCorreo("eric@example.com");
        assertEquals("eric@example.com", cliente.getCorreo());
    }

    @Test
    public void testGetAndSetTelefono() {
        ClienteMorales cliente = new ClienteMorales();
        cliente.cambiarTelefono("5551234567");
        assertEquals("5551234567", cliente.getTelefono());
    }

    @Test
    public void testCambiarDatosCuentaPasswordCorrecto() {
        ClienteMorales cliente = new ClienteMorales();
        cliente.cambiarDatosCuenta("Eric", "Ahorro", 1, 509);
        assertEquals("Eric", cliente.cuenta.getTitular());
        assertEquals("Ahorro", cliente.cuenta.getTipo_de_cuenta());
        assertEquals("Activo", cliente.cuenta.isEstado());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCambiarDatosCuentaPasswordIncorrecto() {
        ClienteMorales cliente = new ClienteMorales();
        cliente.cambiarDatosCuenta("Eric", "Ahorro", 1, 59);
        assertNull(cliente.cuenta.getTitular());
        assertNull(cliente.cuenta.getTipo_de_cuenta());
    }

    @Test
    public void testRelacionComposicionNoEsNull() {
        ClienteMorales cliente = new ClienteMorales();
        assertNotNull("El cliente debe tener una cuenta bancaria asociada", cliente.cuenta);
    }
}
