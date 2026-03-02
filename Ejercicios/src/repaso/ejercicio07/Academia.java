package repaso.ejercicio07;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Academia {
	
	
	private String ciudad;
	private Integer telefono;
	private List<Curso> listaCurso;
	
	
	
	public Academia() {
		
	}

	
	
	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public List<Curso> getListaCurso() {
		return listaCurso;
	}

	public void setListaCurso(List<Curso> listaCurso) {
		this.listaCurso = listaCurso;
	}
	
	
	public List<Curso> getCursosDisponibles(){
		List<Curso> miLista = new ArrayList<>();
		for (Curso curso : listaCurso) {
			if(curso.isPlazasLibres() && curso.getFechaFin().isBefore(LocalDate.now())) {
				miLista.add(curso);
			}
		}
		return miLista;
	}
	
	
	public BigDecimal getPrecioMedio() {
		BigDecimal total= BigDecimal.ZERO;
		for (Curso curso : listaCurso) {
			total=total.add(curso.getPrecio());
		}
		return total.divide(BigDecimal.valueOf(listaCurso.size()),2, RoundingMode.HALF_DOWN);
	}
	
	
	public void borrarCursosPasados() {
		for (Iterator<Curso> i = listaCurso.iterator(); i.hasNext();) {
			Curso curso = (Curso) i.next();
			if(curso.getFechaFin().isAfter(LocalDate.now())) {
				i.remove();
			}
		}
	}
	
	
	public Curso getCursoMasBarato() {
		Curso c = null;
		BigDecimal p = BigDecimal.ZERO;
		for (Curso curso : listaCurso) {
			if(curso.getPrecioMes().compareTo(p)<0 && curso.getFechaIni().isAfter(LocalDate.now())) {
				c= curso;
				p=curso.getPrecioMes();
			}
		}
		return c;
	}
	
	

}
