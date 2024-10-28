package imp;

import java.util.Comparator;


public class ComparadorAnio implements Comparator<Libro> {

	@Override
	public int compare(Libro L1, Libro L2) {
		if (L1.getAnio() > L2.getAnio()) return 1;
		else if (L1.getAnio() < L2.getAnio()) return -1;
		return 0;
	}
}