package repaso.ejercicio04;

import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class Libro {
	
	private String titulo;
	private String autor;
	private LocalDate fechaEdicion;
	private Integer numPaginas;
	
	
	

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
	public LocalDate getFechaEdicion() {
		return fechaEdicion;
	}
	public void setFechaEdicion(LocalDate fechaEdicion) {
		this.fechaEdicion = fechaEdicion;
	}
	public Integer getNumPaginas() {
		return numPaginas;
	}
	public void setNumPaginas(Integer numPaginas) {
		this.numPaginas = numPaginas;
	}

	
	public abstract BigDecimal getPeso();
	
	
	
	public String toString() {
		return titulo+", "+autor+", "+numPaginas+", "+getPeso()+", "+fechaEdicion+"\n";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
