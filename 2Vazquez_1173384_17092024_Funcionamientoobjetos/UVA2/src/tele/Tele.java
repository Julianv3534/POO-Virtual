package tele;

public class Tele { // PUNTO 1 DEL TPO
		//ATRIBUTOS
		String marca;
		String modelo;
		int anio_fabricacion;
		String tipo; // tipo P = plasma, tipo O= OLED , tipo L = LCD
		
		//ATRIBUTOS basicos del televisor
		int pulgadas;
		String resolucion;
		String smart; //Smart o No Smart
		
		boolean encendido;
		//Metodos
		
		//Obtener algunos atributos
		public String getMarca() {
			return marca;
		}
		
		public int getPulgadas() {
			return pulgadas;
		}
		
		public String getResolucion() {
			return resolucion;
		}
		
		public String getTipo() {
			return tipo;
		}
		
		public String esSmart() {
			return smart;
		}
		
		public void setMarca(String x) {
			marca= x;
		}
		
		public void setModelo(String x) {
			modelo= x;
		}
		
		public void setAnioFabricacion(int x) {
			anio_fabricacion= x;
		}
		
		public void setPulgadas(int x ) {
			pulgadas= x;
		}
		
		public void setResolucion(String x) {
			resolucion= x;
		}
		
		public void setSmart(String x) {
			smart= x;
		}
		
		public void setTipo(String x) {
			tipo= x;
		}
		
		//PUNTO 3 -> ENCENDER Y APAGAR TELEVISOR
		
		public void Encender() {
			encendido = true;
		}
		
		public void Apagar() {
			encendido = false;
		}
	
}