
package practica6_clasesabstractas;

public class GerenteMorales extends EmpleadoEM {
    
    private double bono;
    private int evaluacion;
    private String descripcion;
    private boolean promovible = false;
    private String puesto = "Gerente";

    public GerenteMorales() {
    }
    
    public GerenteMorales(String nombre, int edad, String telefono, String correo, double sueldo, int aniosEnEmpresa) {
        setNombre(nombre);
        setEdad(edad);
        setTelefono(telefono);
        setCorreo(correo);
        setSueldo(sueldo);
        setAniosEmpresa(aniosEnEmpresa);
    }
    
    @Override
    public void darBono(double bono) {
        this.bono = bono;
    }

    @Override
    public double verBono() {
        return bono;
    }
    
    @Override
    public void trabajar() {
        System.out.println("Dirige un area de la empresa.");
    }
    
    @Override
    public String mostrarDatos() {
        return ("\nNombre: " + getNombre() +
                "\nEdad: " + getEdad() +
                "\nTelefono: " + getTelefono() +
                "\nCorreo: " + getCorreo() +
                "\nSueldo: " + getSueldo() +
                "\nAnios en la empresa: " + getAniosEmpresa());
    }

    @Override
    public void evaluar(int calif, String descripcion) {
        evaluacion = calif;
        this.descripcion = descripcion;
    }

    @Override
    public void verEvaluacion() {
        System.out.println("\nNombre: " + getNombre() + "\nEvaluacion: " + evaluacion + "\nDescripcion: " + descripcion);
    }

    @Override
    public double darAumentoFijo(double cantidad) {
        double salario;
        salario = getSueldo() + cantidad;
        setSueldo(salario);
        return salario;
    }

    @Override
    public boolean esPromovible() {
        if(getAniosEmpresa() > 2){
            promovible = true;
            return promovible;
        }
        return promovible;
    }

    @Override
    public void promover() {
        if(promovible == true && puesto.contentEquals("Gerente")){
            System.out.println("A sido ascendido a director.");
            puesto = "Director";
        } else {
            System.out.println("Aun no cumple los requisitos para ser promovido o ya fue promovido.");
        }
    }
    
}
