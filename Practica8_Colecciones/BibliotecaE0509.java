
package practica8_colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class BibliotecaE0509 {
    
    private ArrayList<Libro2608> libros_disp = new ArrayList<>();
    private LinkedList<Libro2608> reservas = new LinkedList<>();
    private HashMap<String, String> usuarios = new HashMap<>();
    private HashSet<String> categorias = new HashSet<>();
    
    // Libros disponibles
    
    public void agregarLibroDisponible(Libro2608 libro){
        libros_disp.add(libro);
        Collections.sort(libros_disp);
        categorias.add(libro.getGenero());
    }
    
    public void eliminarLibroDisponible(String titulo){
        Libro2608 buscar = buscarLibro(titulo);
        if(buscar != null){
            Iterator<Libro2608> i = libros_disp.iterator();
            while(i.hasNext()){
                Libro2608 actual = i.next();
                if(actual.equals(buscar)){
                    i.remove();
                    break;
                }
            }
        } else {
            System.out.println("\nNo se encontró el libro.");
        }
    }
    
    public void actualizarLibro(String titulo, String autor, String genero, String editorial){
        Libro2608 libro = buscarLibro(titulo);
        Libro2608 libroNuevo = new Libro2608(titulo, autor, genero, editorial);
        if(libro != null){
            int index = libros_disp.indexOf(libro);
            libros_disp.set(index, libroNuevo);
        } else {
            System.out.println("\nNo se encontro ningun libro con ese titulo.");
        }
    }
    
    public Libro2608 buscarLibro(String titulo){
        for(Libro2608 lib: libros_disp){
            if(lib.getTitulo().equals(titulo)){
                return lib;
            }
        }
        return null;
    }
    
    public void mostrarLibrosDisponibles(){
        if(libros_disp.isEmpty()){
            System.out.println("\nNo hay libros disponibles.");
        } else {
            System.out.println("\n_______________________________________________________________");
            System.out.println("\nLibros disponibles:");
            libros_disp.forEach(libro -> System.out.println(libro));
            System.out.println("\n_______________________________________________________________");
        }
    }
    
    public void mostrarLibrosDisponiblesOrdenados(int op){
        if(libros_disp.isEmpty()){
            System.out.println("\nNo hay libros disponibles.");
        } else {
            System.out.println("\n_______________________________________________________________");
            switch(op){
                case 1:     // Ordenados por autor
                    System.out.println("\nLibros disponibles por autor:");
                    libros_disp.stream().sorted(new CompararPorAutor()).forEach(System.out::println);
                    break;
                case 2:     // Ordenados por género
                    System.out.println("\nLibros disponibles por categoria:");
                    libros_disp.stream().sorted(new CompararPorGenero()).forEach(System.out::println);
                    break;
                default:    // Ordenados por editorial
                    System.out.println("\nLibros disponibles por editorial:");
                    libros_disp.stream().sorted(new CompararPorEditorial()).forEach(System.out::println);
            }
            System.out.println("\n_______________________________________________________________");
        }
    }
    
    public void filtrarLibrosDisponiblesAutor(String autor){
        if(libros_disp.isEmpty()){
            System.out.println("\nNo hay libros disponibles.");
        } else {
            System.out.println("\n_______________________________________________________________");
            System.out.println("\nLibros del(la) autor(a) " + autor +":");
            libros_disp.stream().filter(l -> l.getAutor().equalsIgnoreCase(autor)).forEach(System.out::println);
            System.out.println("\n_______________________________________________________________");
        }
    }
    
    public void filtrarLibrosDisponiblesCategoria(String categoria){
        if(libros_disp.isEmpty()){
            System.out.println("\nNo hay libros disponibles.");
        } else {
            System.out.println("\n_______________________________________________________________");
            System.out.println("\nLibros del la categoria '" + categoria +"':");
            libros_disp.stream().filter(l -> l.getGenero().equalsIgnoreCase(categoria)).forEach(System.out::println);
            System.out.println("\n_______________________________________________________________");
        }
    }
    
    // Libros reservados
    
    public void agregarLibroReservas(Libro2608 libro){
        reservas.addLast(libro);
        if(libros_disp.contains(libro)){
            libros_disp.remove(libro);
        }
    }
    
    public Libro2608 quitarLibroDeReservas(){
        Libro2608 libro = reservas.getFirst();
        if(buscarLibro(libro.getTitulo()) == null){
            agregarLibroDisponible(reservas.getFirst());
        }
        reservas.removeFirst();
        return libro;
    }
    
    public void mostrarLibrosReservados(){
        if(reservas.isEmpty()){
            System.out.println("\nNo hay libros reservados.");
        } else {
            System.out.println("\n_______________________________________________________________");
            System.out.println("\nLibros reservados:");
            reservas.forEach(libro -> System.out.println(libro));
            System.out.println("\n_______________________________________________________________");
        }
    }
    
    // Categorías
    
    public void agregarCategoria(String categoria){
        categorias.add(categoria);
    }
    
    public void mostrarCategorias(){
        if(categorias.isEmpty()){
            System.out.println("\nNo se han ingresado categorias.");
        } else {
            System.out.println("\n_______________________________________________________________");
            System.out.println("\nCategorias actuales:\n");
            categorias.forEach(categ -> System.out.println(categ));
            System.out.println("\n_______________________________________________________________");
        }
    }
    
    public void eliminarCategorias(String categoria){
        if(categorias.contains(categoria)){
            categorias.remove(categoria);
            System.out.println("\nCategoria '" + categoria + "' eliminada");
        } else {
            System.out.println("\nNo se encontro la categoria.");
        }
    }
    
    // Usuarios
    
    public void crearUsuario(String matricula, String nombre){
        usuarios.put(matricula, nombre);
    }
    
    public void buscarUsuario(String matricula){
        if(usuarios.containsKey(matricula)){
            System.out.println("\nUsuario encontrado: " + usuarios.get(matricula));
        } else {
            System.out.println("\nNo se encontro al usuario.");
        }
    }
    
    public void borrarUsuario(String matricula){
        if(usuarios.containsKey(matricula)){
            usuarios.remove(matricula);
        } else {
            System.out.println("\nNo se encontro al usuario.");
        }
    }
    
}
