
package VehiculoE;

import org.junit.Test;
import static org.junit.Assert.*;

public class Consecionaria0509Test {
    
    public Consecionaria0509Test() {
    }

    @Test
    public void testReponer() {
        Consecionaria0509 con = new Consecionaria0509();
        AutoMorales a1 = new AutoMorales("Audi", "A5", 5, "Deportivo");
        con.reponerVehiculo(a1);
        assertNotNull(con);
    }
    
    @Test
    public void testVender() {
        Consecionaria0509 con = new Consecionaria0509();
        AutoMorales a1 = new AutoMorales("Audi", "A5", 5, "Deportivo");
        con.reponerVehiculo(a1);
        con.venderVehiculo(a1);
        assertTrue(con.vehiculos.isEmpty());
    }
    
    @Test
    public void testPruebaVehiculo() {
        Consecionaria0509 con = new Consecionaria0509();
        AutoMorales a1 = new AutoMorales("Audi", "A5", 5, "Deportivo");
        con.pruebaVehiculo(a1);
    }
    
    @Test
    public void testToString() {
        Consecionaria0509 con = new Consecionaria0509();
        AutoMorales a1 = new AutoMorales("Audi", "A5", 5, "Deportivo");
        con.reponerVehiculo(a1);
        assertEquals("Marca: Audi\nModelo: A5\nNumero de puertas: 5\nTipo de auto: Deportivo\n\n", con.toString());
    }
    
}
