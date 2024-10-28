package ejercitacion;

public class Coche extends Vehiculo{
	
	//En este caso no necesita Override, ya que al no pedir modo en el primero y en este si, aplicamos polimorfismo
	public String desplazar(String modo){
		return "El coche se desplaza de manera " + modo; 
	}
}
