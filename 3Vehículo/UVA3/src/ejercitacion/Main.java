package ejercitacion;

public class Main {

	public static void main(String[] args) {
		Vehiculo vehiculoDesconocido = new Vehiculo();
		Coche volkswagen = new Coche();
		Bicicleta plegable = new Bicicleta();
		
		//Desplazamiento de un vehiculo general
		System.out.println(vehiculoDesconocido.desplazar());

		//Desplazamiento de un coche
		System.out.println(volkswagen.desplazar("Automatico"));
		
		//Desplazamiento de una bicicleta
		System.out.println(plegable.desplazar());
		

	}

}
