package prin;

public class SistemaDeControlDeVuelo {
	String fabricante;
	int modos;
	String tipoSistema; //manual pilotoAutomatico
	
	public static void cambioModo(SistemaDeControlDeVuelo sistema, int modo) {
		sistema.modos = modo;
	}
	
	public static void main(String[] args) {
		SistemaDeControlDeVuelo Sistema1 = new SistemaDeControlDeVuelo();
		SistemaDeControlDeVuelo Sistema2 = new SistemaDeControlDeVuelo();
		SistemaDeControlDeVuelo Sistema3 = new SistemaDeControlDeVuelo();
		
		Sistema1.fabricante = "Sony";
		Sistema2.fabricante = "Samsung";
		Sistema3.fabricante = "Apple";
		
		cambioModo(Sistema3, 3);
		cambioModo(Sistema2, 2);
		cambioModo(Sistema1, 1);
		
		Sistema1.tipoSistema = "IA";
		Sistema2.tipoSistema = "Web";
		Sistema3.tipoSistema = "Ciberseguridad";
		
		System.out.println(Sistema1.fabricante + Sistema1.modos + Sistema1.tipoSistema);
		System.out.println(Sistema2.fabricante + Sistema2.modos + Sistema2.tipoSistema);
		System.out.println(Sistema3.fabricante + Sistema3.modos + Sistema3.tipoSistema);
	}

}
