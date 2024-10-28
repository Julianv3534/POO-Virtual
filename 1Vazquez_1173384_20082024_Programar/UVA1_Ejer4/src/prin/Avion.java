package prin;

public class Avion {
	String Marca;
	String Modelo;
	AlaAvion Ala1;
	AlaAvion Ala2;
	SistemaDeControlDeVuelo Sistema;
	MotorDeAvion Motor;
	int NumeroAsientos;
	boolean SistemaEntretenimiento;
	
	public class AlaAvion {
		int envergadura;
		String color;
		String material;
		}
	
	public class SistemaDeControlDeVuelo {
		String fabricante;
		int modos;
		String tipoSistema; //manual pilotoAutomatico
	}
	
	public class MotorDeAvion {
		String marca;
		int hp;
		int empuje;
	}
	
	public static void main(String[] args) {
		AlaAvion ala1 = new AlaAvion();
		AlaAvion ala2 = new AlaAvion();
		SistemaDeControlDeVuelo sistema = new SistemaDeControlDeVuelo();
		MotorDeAvion motor = new MotorDeAvion();
		
		Avion avion = new Avion();
		
		avion.Marca = "Acme";
		avion.Modelo = "BeepBeep30i";
		avion.Ala1 = ala1;
		avion.Ala2 = ala2;
		avion.Sistema = sistema;
		avion.Motor = motor;
		avion.NumeroAsientos = 4;
		avion.SistemaEntretenimiento = true;

		System.out.println("El avion es marca " + avion.Marca + " el modelo es " + avion.Modelo + " contiene el motor " + avion.Motor + "con " + avion.NumeroAsientos + " asientos");
	}

}
