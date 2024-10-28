package imp;
import java.util.Set;
import java.util.HashSet;

public class GestionColeccion {
	
	/*
	 Si necesitas preservar el orden de los libros según se agregaron o permitir duplicados
	 (por ejemplo, diferentes ediciones del mismo libro con el mismo título pero diferente ISBN), ArrayList es la mejor opción.
	 Si te interesa más el rendimiento en búsquedas y no necesitas duplicados, HashSet es más adecuado.
	 Por lo tanto usaremos HashSet ya que no queremos duplicados
	 */
	
	public Set<Libro> crearListaGestion() {
		Set<Libro> lista = new HashSet<Libro> (); 
		return lista;
	}
	
	public void agregar(Set<Libro> list, Libro L) {
		list.add(L);
	}
	
	public void eliminar(Set<Libro> list, Libro L) {
		list.remove(L);
	}
	
	//No tiene mucho sentido hacer una busqueda y devolver la posicion, ya que el HashSet no tiene orden
	//Por lo tanto me parece mas logico hacer la busqueda con el nombre y devolver el objeto completo
	public Libro busqueda(Set<Libro> list, String Nombre) {
		for(Libro libro: list) {
			if(libro.getTitulo().equals(Nombre)) {
				return libro;
			}
		}
		return null; //Si no se encuentra el libro, devuelvo null
	}
	
}
