package imp;

import java.util.Scanner;
import java.util.Set;

public class InterfazUsuario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GestionColeccion Gestion = new GestionColeccion();
		Set<Libro> libros = Gestion.crearListaGestion();
		
		int dec = 0;
		while(dec != 5) {
			System.out.print("Que decision quiere tomar?\n 1)Agregar libro\n 2)Eliminar libro\n 3)Buscar libro\n 4)Mostrar todos los libros\n 5)Salir");
			dec = sc.nextInt();
			if(dec == 1) {
				String libro = sc.next();
				Libro rta = Gestion.busqueda(libros, libro);
				if(rta == null) {
					Gestion.agregar(libros, rta);
					System.out.println("El libro ha sido añadido exitosamente");
				}
				else {
					System.out.println("El libro ya existe en el catalogo");
				}
			}
			if(dec == 2) {
				String libro = sc.next();
				Libro rta = Gestion.busqueda(libros, libro);
				if(rta != null) {
					Gestion.eliminar(libros, rta);
					System.out.println("El libro ha sido eliminado exitosamente");
				}
				else {
					System.out.println("El libro no existe en el catalogo");
				}
			}
			if(dec == 3) {
				String valorBusqueda = sc.next();
				Libro resultado = Gestion.busqueda(libros, valorBusqueda);
				if(resultado == null) {
					System.out.println("No se encuentra este libro en nuestro catalogo");
				}
				else {
					System.out.println("Este libro si se encuentra en nuestro catalogo");
				}
			}
			if(dec == 4) {
				System.out.println(libros);
			}
		}

	}

}
