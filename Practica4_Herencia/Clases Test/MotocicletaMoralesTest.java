
package VehiculoE;

import org.junit.Test;
import static org.junit.Assert.*;

public class MotocicletaMoralesTest {
    
    public MotocicletaMoralesTest() {
    }

    @Test
    public void testConstructor() {
        MotocicletaMorales m1 = new MotocicletaMorales("Italika", "Ultimo Modelo", "Deportiva");
        assertNotNull(m1);
    }
    
    @Test
    public void testSetTipoDeMoto() {
        MotocicletaMorales m1 = new MotocicletaMorales("Italika", "Ultimo Modelo", "Deportiva");
        m1.setTipoDeMoto("Trail");
        assertEquals("Trail", m1.getTipoDeMoto());
    }
    
    @Test
    public void testEncender() {
        MotocicletaMorales m1 = new MotocicletaMorales("Italika", "Ultimo Modelo", "Deportiva");
        m1.encender();
    }
    
    @Test
    public void testApagar() {
        MotocicletaMorales m1 = new MotocicletaMorales("Italika", "Ultimo Modelo", "Deportiva");
        m1.apagar();
    }
    
    @Test
    public void testPitar() {
        MotocicletaMorales m1 = new MotocicletaMorales("Italika", "Ultimo Modelo", "Deportiva");
        m1.pitar();
    }
    
    @Test
    public void testHerencia() {
        MotocicletaMorales m1 = new MotocicletaMorales("Italika", "Ultimo Modelo", "Deportiva");
        assertEquals("Italika", m1.getMarca());
    }
    
    @Test
    public void testToString() {
        MotocicletaMorales m1 = new MotocicletaMorales("Italika", "Ultimo Modelo", "Deportiva");
        assertEquals("Marca: Italika\nModelo: Ultimo Modelo\nTipo de moto: Deportiva\n", m1.toString());
    }
    
}
