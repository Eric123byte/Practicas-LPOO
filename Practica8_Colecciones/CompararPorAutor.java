
package practica8_colecciones;

import java.util.Comparator;

public class CompararPorAutor implements Comparator<Libro2608> {

    @Override
    public int compare(Libro2608 lib1, Libro2608 lib2) {
        return lib1.getAutor().compareToIgnoreCase(lib2.getAutor());
    }
    
}
