package ejercitacion;

public class Bicicleta extends Vehiculo{
	
	//En cambio en este caso si es necesario para que asi sobreescribir el metodo anteriormente creado en Vehiculo
	@Override
	public String desplazar() {
		return "La bicicleta esta siendo pedaleada";
	}
}
