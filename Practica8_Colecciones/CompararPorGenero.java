
package practica8_colecciones;

import java.util.Comparator;

public class CompararPorGenero implements Comparator<Libro2608>{
    
    @Override
    public int compare(Libro2608 lib1, Libro2608 lib2) {
        return lib1.getGenero().compareToIgnoreCase(lib2.getGenero());
    }
    
}
