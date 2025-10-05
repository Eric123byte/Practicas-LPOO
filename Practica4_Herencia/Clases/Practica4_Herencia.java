
package VehiculoE;

public class Practica4_Herencia {

    public static void main(String[] args) {
        
        AutoMorales bocho = new AutoMorales("Hiundai", "El ultimo", 11, "Bocho Usado");
	CamionMorales c1 = new CamionMorales("BMW", "A1", "Trailer", 8, 15, 5, 20);
	Consecionaria0509 con = new Consecionaria0509();
	
	bocho.encender();
	bocho.apagar();
	bocho.setTipoDeAuto("Bocho nuevo");
	System.out.println(bocho.getTipoDeAuto());
	System.out.println();
	
	c1.setTipo("Trailer");
	c1.setAltura(5);
	c1.setModelo("Ultimo modelo");
	c1.encender();
	c1.pitar();
	c1.choque();
	c1.apagar();
	System.out.println();
	
	con.reponerVehiculo(bocho);
	con.reponerVehiculo(c1);
	System.out.println(con);
	con.venderVehiculo(bocho);
	System.out.println("\nBocho vendido\n");
	System.out.println(con);
	con.pruebaVehiculo(c1);
    
    }
    
}
