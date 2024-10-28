package prin;

public class MotorDeAvion {

	String marca;
	int hp;
	int empuje;
	
	public void arrancar() {
		System.out.println("Motor arranco");
	}
	
	public void detener() {
		System.out.println("Motor detenido");
	}
	
	public static void main(String[] args) {
		MotorDeAvion motor1 = new MotorDeAvion();
		MotorDeAvion motor2 = new MotorDeAvion();
		
		motor1.marca = "BMW";
		motor2.marca = "Mercedes";
		
		motor1.hp = 500;
		motor2.hp = 700;
		
		motor1.empuje = 600;
		motor2.empuje = 1000;
		
		System.out.println("Su marca es " + motor1.marca + " y su empuje es " + motor1.empuje);
		System.out.println("Su marca es " + motor2.marca + " y su empuje es " + motor2.empuje);
	}

}
