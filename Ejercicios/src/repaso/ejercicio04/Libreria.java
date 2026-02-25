package repaso.ejercicio04;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Libreria {

	private Integer telefono;
	private String direccion;
	private List<Libro> listaLibros;
	
	
	public Libreria(String direccion,Integer telefono) {
		this.direccion=direccion;
		this.telefono=telefono;
	}
	
	
	public Integer getTelefono() {
		return telefono;
	}
	
	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Libro> getListaLibros() {
		return listaLibros;
	}

	public void setListaLibros(List<Libro> listaLibros) {
		this.listaLibros = listaLibros;
	}



	public Libro obtenerLibroMasAntiguo() {
		Libro lib=null;
		LocalDate fecha=  LocalDate.now();
		for (Libro libro : listaLibros) {
			if(libro.getFechaEdicion().compareTo(fecha)<0) {
				fecha=libro.getFechaEdicion();
				lib=libro;
			}
		}
		return lib;
	}
	
	
	
	public BigDecimal obtenerPesoTotalDeLibros() {
		BigDecimal pesoTotal= BigDecimal.ZERO;
		for (Libro libro : listaLibros) {
			pesoTotal=pesoTotal.add(libro.getPeso());
		}
		return pesoTotal;
	}
	
	
	public Integer obtenerNumPaginasMedio() {
		Integer paginasTotal=0;
		for (Libro libro : listaLibros) {
			paginasTotal+=libro.getNumPaginas();
		}
		paginasTotal=paginasTotal/listaLibros.size();
		return paginasTotal;
	}
	
	
	
	public String toString() {
		return "Direccion"+direccion+"\nLista libros: \n"+listaLibros;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
