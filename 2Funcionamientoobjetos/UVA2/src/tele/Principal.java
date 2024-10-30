package tele;
import tele.Tele;

public class Principal {
	//Mostrar algunas de las caracteristicas del televisor a traves del metodo Get para respetar el ocultamiento de los datos
	//PUNTO 1 DEL TPO
	public static void mostrarCaracteristicas(Tele x) {
		String tele = x.getMarca();
		System.out.println("El televisor " + tele + " contiene las siguientes caracteristicas: " + x.getMarca() + "--" + x.getPulgadas()+ "--" + x.getResolucion()+ "--" + x.esSmart() + "--" + x.getTipo());
	}
	
	//Crear el televisor ---- 
	public static Tele crearTelevisor(String marca, String modelo, int anio_fabricacion , String tipo, int pulgadas, String resolucion, String smart) {
		Tele nuevo = new Tele();
		nuevo.setAnioFabricacion(anio_fabricacion);
		nuevo.setMarca(marca);
		nuevo.setModelo(modelo);
		nuevo.setTipo(tipo);
		nuevo.setPulgadas(pulgadas);
		nuevo.setResolucion(resolucion);
		nuevo.setSmart(smart);
		
		return nuevo;
	}
	
	public static void consultarEstado(Tele x) {
		String tele= x.marca;
		if (x.encendido) {
			System.out.println("El televisor " + tele + " esta encendido");
		} else {
			System.out.println("El televisor " + tele + " esta apagado");
		}
	}
	

	
	public static void main(String[] args) {
		//PUNTO 2 --- DOS TELEVISORES COMPARTIRAN EL MISMO TIPO DE PANTALLA , EN ESTE CASO PLASMA (P)
		Tele tele1 = crearTelevisor("Samsung", "ASTRO", 2015, "P", 55, "4K","smart" );
		Tele tele2 = crearTelevisor("LG", "Master", 2012, "P", 80, "8K","smart");
		mostrarCaracteristicas(tele1);
		mostrarCaracteristicas(tele2);
		
		//Ahora alteraremos los valores del tipo y volveremos a mostrarlos por consola
		tele1.setTipo("O");
		tele2.setTipo("L");
		
		System.out.println("----------------------------------------");
		
		mostrarCaracteristicas(tele1);
		mostrarCaracteristicas(tele2);
		
		//Punto 3
		tele1.Encender();
		tele2.Encender();
		System.out.println("----------------------------------------");
		consultarEstado(tele1);
		consultarEstado(tele2);
		
	}
}