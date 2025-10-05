
package VehiculoE;

import org.junit.Test;
import static org.junit.Assert.*;

public class AutoMoralesTest {
    
    public AutoMoralesTest() {
    }

    @Test
    public void testConstructor() {
        AutoMorales a1 = new AutoMorales("Audi", "A5", 5, "Deportivo");
        assertNotNull(a1);
    }
    
    @Test
    public void testSetNumeroPuertas() {
        AutoMorales a1 = new AutoMorales("Audi", "A5", 3, "Deportivo");
        a1.setNumeroDePuertas(5);
        assertEquals(5, a1.getNumeroDePuertas());
    }
    
    @Test
    public void testSetTipoDeAuto() {
        AutoMorales a1 = new AutoMorales("Audi", "A5", 5, "Deportivo");
        a1.setTipoDeAuto("Estandar");
        assertEquals("Estandar", a1.getTipoDeAuto());
    }
    
    @Test
    public void testEncender() {
        AutoMorales a1 = new AutoMorales("Audi", "A5", 3, "Deportivo");
        a1.encender();
    }
    
    @Test
    public void testApagar() {
        AutoMorales a1 = new AutoMorales("Audi", "A5", 3, "Deportivo");
        a1.apagar();
    }
    
    @Test
    public void testPitar() {
        AutoMorales a1 = new AutoMorales("Audi", "A5", 3, "Deportivo");
        a1.pitar();
    }
    
    @Test
    public void testHerencia() {
        AutoMorales a1 = new AutoMorales("Audi", "A5", 3, "Deportivo");
        assertEquals("Audi", a1.getMarca());
    }
    
    @Test
    public void testToString() {
        AutoMorales a1 = new AutoMorales("Audi", "A5", 3, "Deportivo");
        assertEquals("Marca: Audi\nModelo: A5\nNumero de puertas: 3\nTipo de auto: Deportivo\n", a1.toString());
    }
    
}
