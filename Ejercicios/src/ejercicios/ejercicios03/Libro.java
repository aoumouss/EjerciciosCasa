package ejercicios.ejercicios03;

import java.util.Iterator;

public class Libro {
	String titulo;
	String autor;
	Integer paginasLeidas;
	Integer totalPaginas;


	public Libro(String titulo,String autor, Integer totalPaginas){
		this.autor=autor;
		this.titulo=titulo;
		this.totalPaginas=totalPaginas;
		paginasLeidas=0;
	
	}
	
	public Integer leer(Integer paginas) {
		paginasLeidas+=paginas;
		if(paginasLeidas>totalPaginas) {
			paginasLeidas=totalPaginas;
		}
		return paginasLeidas;
	}
	
	
	
	public Integer retroceder(Integer paginas) {
		paginasLeidas+=paginas;
		if(paginasLeidas<0) {
			paginasLeidas=0;
		}
		return paginasLeidas;
	}
	
	
	public void reiniciar() {
		paginasLeidas=0;
	}
	
	public Integer progreso() {
		return paginasLeidas*100/totalPaginas;
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
	
	
	


















}