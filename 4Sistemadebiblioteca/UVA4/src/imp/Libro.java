package imp;


public class Libro implements Comparable<Libro>{
	private String titulo;
	private String autor;
	private int anio;
	private int ISBN;
	
	public String toString(Libro L) {
		return "Titulo: "+ titulo + "\nautor: " + autor + "\n año: " + anio + "\nISBN: " + ISBN;
	}
	
	public Libro(String titulo, String autor, int anio, int ISBN) {
		this.titulo = titulo;
		this.autor = autor;
		this.anio = anio;
		this.ISBN = ISBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int ISBN) {
		this.ISBN = ISBN;
	}
	
	public String toString() {
		return "{ titulo: " + titulo + ", autor: " + autor + ", año: " + anio + ", ISBN: " + ISBN + " }";
	}
	
	//Hago la comparacion por título, autor y año de publicación, si son iguales da 0, sino -1
	@Override
	public int compareTo(Libro L) {
		if ( (this.titulo == L.titulo) && (this.autor == L.autor) && (this.anio == L.anio)) return 0;
		else return -1;
	}
}
