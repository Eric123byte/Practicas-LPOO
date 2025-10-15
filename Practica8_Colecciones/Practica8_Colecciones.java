
package practica8_colecciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practica8_Colecciones {

    public static void main(String[] args) {
        
        long inicio = 0, fin = 0;
        double tiempo;
        Scanner input = new Scanner(System.in);
        int op, op1, op2, op3, op4;
        Libro2608 lib1 = new Libro2608("Cien anios de soledad", "Gabriel Garcia Marquez", "Novela", "Editorial Sudamericana");
        Libro2608 lib2 = new Libro2608("1984", "George Orwell", "Ciencia Ficcion", "Penguin Random House");
        Libro2608 lib3 = new Libro2608("Don Quijote de la Mancha", "Miguel de Cervantes", "Novela", "Alfaguara");
        Libro2608 lib4 = new Libro2608("Harry Potter y la piedra filosofal", "Joanne Kathleen Rowling", "Fantasia", "Salamandra");
        Libro2608 lib5 = new Libro2608("El senior de los anillos: La comunidad del anillo", "John Ronald Reuel Tolkien", "Aventura", "HarperCollins");
        BibliotecaE0509 biblioteca = new BibliotecaE0509();
        
        // Datos de prueba
        biblioteca.agregarLibroDisponible(lib1);
        biblioteca.agregarLibroDisponible(lib2);
        biblioteca.agregarLibroDisponible(lib3);
        biblioteca.agregarLibroDisponible(lib4);
        biblioteca.agregarLibroDisponible(lib5);
        biblioteca.crearUsuario("2090509", "Eric Morales Sanchez");     // <--- Estudiante(yo)
        biblioteca.crearUsuario("2178921", "Miguel Gutierrez Perez");
        biblioteca.crearUsuario("2128197", "Marta Martinez Meraz");
        
        do{
            
            System.out.println("\nMENU\n\n1. Libros disponibles\n2. Libros reservados\n3. Categorias\n4. Usuarios\n5. Salir");
            do{
                op = 0;
                try{
                    System.out.print("\nIngrese la opcion deseada: ");
                    op = Integer.parseInt(input.nextLine());
                } catch (InputMismatchException e) {
                    System.out.println("\nSolo se permiten numeros enteros.");
                    input.nextLine();
                }
            }while(op < 1 || op > 5);
            
            switch(op){
                case 1:     // Libros disponibles
                    System.out.println("\n---------------------------------------------");
                    System.out.println("\nLibros disponibles.\n");
                    System.out.println("1. Mostrar libros disponibles\n2. Filtrar libros\n3. Agregar\n4. Eliminar\n5. Actualizar\n6. Buscar libro");
                    do{
                        op1 = 0;
                        try{
                            System.out.print("\nIngrese la opcion deseada: ");
                            op1 = Integer.parseInt(input.nextLine());
                        } catch (InputMismatchException e) {
                            System.out.println("\nSolo se permiten numeros enteros.");
                            input.nextLine();
                        }
                    }while(op1 < 1 || op1 > 6);
                    switch(op1){
                        case 1:     // Mostrar libros disponibles
                            System.out.println("\n---------------------------------------------");
                            System.out.println("\nMostrar libros disponibles.");
                            System.out.println("\n1. Por titulo\n2. Por autor\n3. Por categoria\n4. Por editorial");
                            do{
                                op1 = 0;
                                try{
                                    System.out.print("\nIngrese la opcion deseada: ");
                                    op1 = Integer.parseInt(input.nextLine());
                                } catch (InputMismatchException e) {
                                    System.out.println("\nSolo se permiten numeros enteros.");
                                    input.nextLine();
                                }
                            }while(op1 < 1 || op1 > 4);
                            switch(op1){
                                case 1:     // Por titulo
                                    inicio = System.nanoTime();
                                    biblioteca.mostrarLibrosDisponibles();
                                    fin = System.nanoTime();
                                    break;
                                case 2:     // Por autor
                                    inicio = System.nanoTime();
                                    biblioteca.mostrarLibrosDisponiblesOrdenados(1);
                                    fin = System.nanoTime();
                                    break;
                                case 3:     // Por categoria
                                    inicio = System.nanoTime();
                                    biblioteca.mostrarLibrosDisponiblesOrdenados(2);
                                    fin = System.nanoTime();
                                    break;
                                case 4:     // Por editorial
                                    inicio = System.nanoTime();
                                    biblioteca.mostrarLibrosDisponiblesOrdenados(3);
                                    fin = System.nanoTime();
                                    break;
                            }
                            tiempo = (fin - inicio) / 1_000_000_000.0;
                            System.out.println("Tiempo de ejecucion: " + tiempo);
                            break;
                        case 2:     // Filtrar libros
                            System.out.println("\n---------------------------------------------");
                            System.out.println("\nFiltrar libros disponibles.");
                            System.out.println("\n1. Por autor\n2. Por categoria");
                            do{
                                op1 = 0;
                                try{
                                    System.out.print("\nIngrese la opcion deseada: ");
                                    op1 = Integer.parseInt(input.nextLine());
                                } catch (InputMismatchException e) {
                                    System.out.println("\nSolo se permiten numeros enteros.");
                                    input.nextLine();
                                }
                            }while(op1 != 1 && op1 != 2);
                            if(op1 == 1){
                                String nombre;
                                System.out.print("\nIngrese nombre del autor: ");
                                nombre = input.nextLine();
                                inicio = System.nanoTime();
                                biblioteca.filtrarLibrosDisponiblesAutor(nombre);
                                fin = System.nanoTime();
                            } else {
                                String categoria;
                                System.out.print("\nIngrese la categoria: ");
                                categoria = input.nextLine();
                                inicio = System.nanoTime();
                                biblioteca.filtrarLibrosDisponiblesCategoria(categoria);
                                fin = System.nanoTime();
                            }
                            tiempo = (fin - inicio) / 1_000_000_000.0;
                            System.out.println("Tiempo de ejecucion: " + tiempo);
                            break;
                        case 3:     // Agregar
                            String titulo, autor, genero, editorial;
                            System.out.print("\nTitulo: ");
                            titulo = input.nextLine();
                            System.out.print("\nAutor: ");
                            autor = input.nextLine();
                            System.out.print("\nCategoria: ");
                            genero = input.nextLine();
                            System.out.print("\nEditorial: ");
                            editorial = input.nextLine();
                            Libro2608 libro = new Libro2608(titulo, autor, genero, editorial);
                            inicio = System.nanoTime();
                            biblioteca.agregarLibroDisponible(libro);
                            fin = System.nanoTime();
                            tiempo = (fin - inicio) / 1_000_000_000.0;
                            System.out.println("Tiempo de ejecucion: " + tiempo);
                            break;
                        case 4:     // Eliminar
                            System.out.print("\nIngrese el titulo del libro a eliminar: ");
                            titulo = input.nextLine();
                            inicio = System.nanoTime();
                            biblioteca.eliminarLibroDisponible(titulo);
                            fin = System.nanoTime();
                            tiempo = (fin - inicio) / 1_000_000_000.0;
                            System.out.println("Tiempo de ejecucion: " + tiempo);
                            break;
                        case 5:     // Actualizar
                            System.out.print("\nIngrese el titulo del libro: ");
                            titulo = input.nextLine();
                            System.out.print("\nAutor: ");
                            autor = input.nextLine();
                            System.out.print("\nCategoria: ");
                            genero = input.nextLine();
                            System.out.print("\nEditorial: ");
                            editorial = input.nextLine();
                            inicio = System.nanoTime();
                            biblioteca.actualizarLibro(titulo, autor, genero, editorial);
                            fin = System.nanoTime();
                            tiempo = (fin - inicio) / 1_000_000_000.0;
                            System.out.println("Tiempo de ejecucion: " + tiempo);
                            break;
                        case 6:     // Buscar libro
                            System.out.print("\nIngrese el titulo del libro: ");
                            titulo = input.nextLine();
                            inicio = System.nanoTime();
                            libro = biblioteca.buscarLibro(titulo);
                            fin = System.nanoTime();
                            if(libro != null){
                                System.out.println(libro);
                            } else {
                                System.out.println("\nEl libro no se encontro en los libros disponibles");
                            }
                            tiempo = (fin - inicio) / 1_000_000_000.0;
                            System.out.println("Tiempo de ejecucion: " + tiempo);
                            break;
                    }
                    break;
                case 2:     // Libros reservados
                    System.out.println("\n---------------------------------------------");
                    System.out.println("\nLibros reservados.\n");
                    System.out.println("1. Mostrar libros reservados\n2. Agregar a libros reservados\n3. Eliminar de libros reservados");
                    do{
                        op2 = 0;
                        try{
                            System.out.print("\nIngrese la opcion deseada: ");
                            op2 = Integer.parseInt(input.nextLine());
                        } catch (InputMismatchException e) {
                            System.out.println("\nSolo se permiten numeros enteros.");
                            input.nextLine();
                        }
                    }while(op2 < 1 || op2 > 3);
                    switch(op2){
                        case 1:     // Mostrar libros reservados
                            inicio = System.nanoTime();
                            biblioteca.mostrarLibrosReservados();
                            fin = System.nanoTime();
                            tiempo = (fin - inicio) / 1_000_000_000.0;
                            System.out.println("Tiempo de ejecucion: " + tiempo);
                            break;
                        case 2:     // Agregar a libros reservados
                            String titulo, autor, genero, editorial;
                            System.out.print("\nTitulo: ");
                            titulo = input.nextLine();
                            System.out.print("\nAutor: ");
                            autor = input.nextLine();
                            System.out.print("\nCategoria: ");
                            genero = input.nextLine();
                            System.out.print("\nEditorial: ");
                            editorial = input.nextLine();
                            Libro2608 libro = new Libro2608(titulo, autor, genero, editorial);
                            inicio = System.nanoTime();
                            biblioteca.agregarLibroReservas(libro);
                            fin = System.nanoTime();
                            tiempo = (fin - inicio) / 1_000_000_000.0;
                            System.out.println("Tiempo de ejecucion: " + tiempo);
                            break;
                        case 3:     // Eliminar de libros reservados
                            System.out.println("\nSe elimino el primer libro en la cola de reservados: ");
                            inicio = System.nanoTime();
                            libro = biblioteca.quitarLibroDeReservas();
                            fin = System.nanoTime();
                            System.out.println(libro);
                            tiempo = (fin - inicio) / 1_000_000_000.0;
                            System.out.println("Tiempo de ejecucion: " + tiempo);
                            break;
                    }
                    break;
                case 3:     // Categorías
                    System.out.println("\n---------------------------------------------");
                    System.out.println("\nCategorias.\n");
                    System.out.println("1. Mostrar categorias\n2. Agregar categoria\n3. Eliminar categoria");
                    do{
                        op3 = 0;
                        try{
                            System.out.print("\nIngrese la opcion deseada: ");
                            op3 = Integer.parseInt(input.nextLine());
                        } catch (InputMismatchException e) {
                            System.out.println("\nSolo se permiten numeros enteros.");
                            input.nextLine();
                        }
                    }while(op3 < 1 || op3 > 3);
                    switch(op3){
                        case 1:     // Mostrar categorias
                            inicio = System.nanoTime();
                            biblioteca.mostrarCategorias();
                            fin = System.nanoTime();
                            tiempo = (fin - inicio) / 1_000_000_000.0;
                            System.out.println("Tiempo de ejecucion: " + tiempo);
                            break;
                        case 2:     // Agregar categoria
                            String categoria;
                            System.out.print("\nIngrese la categoria que desea aniadir: ");
                            categoria = input.nextLine();
                            inicio = System.nanoTime();
                            biblioteca.agregarCategoria(categoria);
                            fin = System.nanoTime();
                            tiempo = (fin - inicio) / 1_000_000_000.0;
                            System.out.println("Tiempo de ejecucion: " + tiempo);
                            break;
                        case 3:     // Eliminar categoria
                            System.out.print("\nIngrese la categoria que desea eliminar: ");
                            categoria = input.nextLine();
                            inicio = System.nanoTime();
                            biblioteca.eliminarCategorias(categoria);
                            fin = System.nanoTime();
                            tiempo = (fin - inicio) / 1_000_000_000.0;
                            System.out.println("Tiempo de ejecucion: " + tiempo);
                            break;
                    }
                    break;
                case 4:     //Usuarios
                    System.out.println("\n---------------------------------------------");
                    System.out.println("\nUsuarios.\n");
                    System.out.println("1. Buscar usuario\n2. Agregar usuario\n3. Eliminar usuario");
                    do{
                        op4 = 0;
                        try{
                            System.out.print("\nIngrese la opcion deseada: ");
                            op4 = Integer.parseInt(input.nextLine());
                        } catch (InputMismatchException e) {
                            System.out.println("\nSolo se permiten numeros enteros.");
                            input.nextLine();
                        }
                    }while(op4 < 1 || op4 > 3);
                    switch(op4){
                        case 1:     // Buscar usuario
                            System.out.print("\nIngrese la matricula del usuario: ");
                            String matricula = input.nextLine();
                            inicio = System.nanoTime();
                            biblioteca.buscarUsuario(matricula);
                            fin = System.nanoTime();
                            tiempo = (fin - inicio) / 1_000_000_000.0;
                            System.out.println("Tiempo de ejecucion: " + tiempo);
                            break;
                        case 2:     // Agregar usuario
                            System.out.print("\nIngrese la matricula del nuevo usuario: ");
                            matricula = input.nextLine();
                            System.out.print("\nIngrese el nombre del nuevo usuario: ");
                            String nombre = input.nextLine();
                            inicio = System.nanoTime();
                            biblioteca.crearUsuario(matricula, nombre);
                            fin = System.nanoTime();
                            tiempo = (fin - inicio) / 1_000_000_000.0;
                            System.out.println("Tiempo de ejecucion: " + tiempo);
                            break;
                        case 3:     // Eliminar usuario
                            System.out.print("\nIngrese la matricula del usuario a borrar: ");
                            matricula = input.nextLine();
                            inicio = System.nanoTime();
                            biblioteca.borrarUsuario(matricula);
                            fin = System.nanoTime();
                            tiempo = (fin - inicio) / 1_000_000_000.0;
                            System.out.println("Tiempo de ejecucion: " + tiempo);
                            break;
                    }
                    break;
                default:    // Salir
                    break;
            }
            
        }while(op != 5);
        
    }
    
}
