
package VehiculoE;

import org.junit.Test;
import static org.junit.Assert.*;

public class CamionMoralesTest {
    
    public CamionMoralesTest() {
    }

    @Test
    public void testConstructor() {
        CamionMorales c1 = new CamionMorales("Marca", "Modelo", "Trailer", 8, 10, 4, 2.6);
        assertNotNull(c1);
    }
    
    @Test
    public void testSetTipo() {
        CamionMorales c1 = new CamionMorales("Marca", "Modelo", "Nada", 8, 10, 4, 2.6);
        c1.setTipo("Trailer");
        assertEquals("Trailer", c1.getTipo());
    }
    
    @Test
    public void testSetCantidadRuedas() {
        CamionMorales c1 = new CamionMorales("Marca", "Modelo", "Trailer", 0, 10, 4, 2.6);
        c1.setCantidadRuedas(8);
        assertEquals(8, c1.getCantidadDeRuedas());
    }
    
    @Test
    public void testSetPeso() {
        CamionMorales c1 = new CamionMorales("Marca", "Modelo", "Trailer", 8, 10000, 4, 2.6);
        c1.setPeso(10);
        assertEquals(10.0, c1.getPeso(), 0.001);
    }
    
    @Test
    public void testSetAltura() {
        CamionMorales c1 = new CamionMorales("Marca", "Modelo", "Trailer", 8, 10, 0, 2.6);
        c1.setAltura(4.0);
        assertEquals(4.0, c1.getAltura(), 0.001);
    }
    
    @Test
    public void testSetLongitud() {
        CamionMorales c1 = new CamionMorales("Marca", "Modelo", "Trailer", 8, 10, 4, 500);
        c1.setLongitud(2.6);
        assertEquals(2.6, c1.getLongitud(), 0.001);
    }
    
    @Test
    public void testEncender() {
        CamionMorales c1 = new CamionMorales("Marca", "Modelo", "Trailer", 8, 10, 4, 2.6);
        c1.encender();
    }
    
    @Test
    public void testApagar() {
        CamionMorales c1 = new CamionMorales("Marca", "Modelo", "Trailer", 8, 10, 4, 2.6);
        c1.apagar();
    }
    
    @Test
    public void testPitar() {
        CamionMorales c1 = new CamionMorales("Marca", "Modelo", "Trailer", 8, 10, 4, 2.6);
        c1.pitar();
    }
    
    @Test
    public void testChoque() {
        CamionMorales c1 = new CamionMorales("Marca", "Modelo", "Trailer", 8, 10, 4, 2.6);
        c1.choque();
    }
    
    @Test
    public void testToString() {
        CamionMorales c1 = new CamionMorales("Marca", "Modelo", "Trailer", 8, 10, 4, 2.6);
        assertEquals("Marca: Marca\nModelo: Modelo\nTipo de camion: Trailer\nCantidad de ruedas: 8\nPeso: 10.0\nAltura: 4.0\nLongitud: 2.6\n",
                c1.toString());
    }
    
}
