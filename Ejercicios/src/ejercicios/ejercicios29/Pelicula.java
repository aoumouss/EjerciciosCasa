package ejercicios.ejercicios29;

import java.util.ArrayList;
import java.util.List;

public class  Pelicula {
	
	private Integer anoEstreno;
	private String titulo;
	private List<Actor> listaActores;
	private Guionista guionista;
	private Director director;
	
	public Pelicula() {
		listaActores = new ArrayList<>();
	}
	
	
	public Integer getAnoEstreno() {
		return anoEstreno;
	}
	public void setAnoEstreno(Integer anoEstreno) {
		this.anoEstreno = anoEstreno;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public List<Actor> getListaActores() {
		return listaActores;
	}
	public void setListaActores(Actor actor) {
		listaActores= new ArrayList<>();
		listaActores.add(actor);
	}
	public Guionista getGuionista() {
		return guionista;
	}
	public void setGuionista(Guionista guionista) {
		this.guionista = guionista;
	}
	public Director getDirector() {
		return director;
	}
	public void setDirector(Director director) {
		this.director = director;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	

}
