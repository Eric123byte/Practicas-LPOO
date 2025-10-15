
package practica8_colecciones;

import java.util.Comparator;

public class CompararPorEditorial implements Comparator<Libro2608>{
    
    @Override
    public int compare(Libro2608 lib1, Libro2608 lib2) {
        return lib1.getEditorial().compareToIgnoreCase(lib2.getEditorial());
    }
    
}
