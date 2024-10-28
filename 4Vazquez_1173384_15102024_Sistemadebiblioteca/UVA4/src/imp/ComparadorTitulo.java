package imp;

import java.util.Comparator;


public class ComparadorTitulo implements Comparator<Libro> {

	@Override
	public int compare(Libro L1, Libro L2) {
		 if (L1.getTitulo().equals(L2.getTitulo())) return 1;
		 else {
			 return -1;
		 }
	}
}