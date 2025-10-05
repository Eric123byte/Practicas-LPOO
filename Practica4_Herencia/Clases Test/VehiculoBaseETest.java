
package VehiculoE;

import org.junit.Test;
import static org.junit.Assert.*;

public class VehiculoBaseETest {
    
    public VehiculoBaseETest() {
    }
    
    @Test
    public void testConstructor() {
        VehiculoBaseE v1 = new VehiculoBaseE("BMW", "A5");
        assertNotNull(v1);
    }
    
    @Test
    public void testSetMarca() {
        VehiculoBaseE v1 = new VehiculoBaseE();
        v1.setMarca("BMW");
        assertEquals("BMW", v1.getMarca());
    }
    
    @Test
    public void testSetModelo() {
        VehiculoBaseE v1 = new VehiculoBaseE();
        v1.setModelo("A5");
        assertEquals("A5", v1.getModelo());
    }
    
    @Test
    public void testEncender() {
        VehiculoBaseE v1 = new VehiculoBaseE();
        v1.encender();
    }
    
    @Test
    public void testApagar() {
        VehiculoBaseE v1 = new VehiculoBaseE("BMW", "A5");
        v1.apagar();
    }
    
    @Test
    public void testPitar() {
        VehiculoBaseE v1 = new VehiculoBaseE("BMW", "A5");
        v1.pitar();
    }
    
}
