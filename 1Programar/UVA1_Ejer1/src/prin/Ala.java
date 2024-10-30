package prin;

public class Ala {
	int envergadura;
	String color;
	String material;
	
	private void flap() {
		System.out.print("El flap esta en uso");
	}
	
	public static void main(String[] args) {
		Ala ala1 = new Ala();
		Ala ala2 = new Ala();
		
		ala1.envergadura = 3;
		ala1.color = "rojo";
		ala1.material= "hierro";
		
		ala2.envergadura = 8;
		ala2.color = "azul";
		ala2.material= "madera";
		
		ala1.flap();
		ala2.flap();
	}

}
