package repaso.ejercicio07;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Academia {

	private String ciudad;
	private Integer telefono;
	private List<Curso> listaCurso;
	private Map<String, Alumno> mapa;

	public Academia() {
		listaCurso = new ArrayList<>();
		mapa = new HashMap<>();

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

	public List<Curso> getCursosDisponibles() {
		List<Curso> miLista = new ArrayList<>();
		for (Curso curso : listaCurso) {
			if (curso.isPlazasLibres() && curso.getFechaFin().isBefore(LocalDate.now())) {
				miLista.add(curso);
			}
		}
		return miLista;
	}

	public BigDecimal getPrecioMedio() {
		BigDecimal total = BigDecimal.ZERO;
		if (listaCurso.isEmpty()) {
			return total;
		}
		for (Curso curso : listaCurso) {
			total = total.add(curso.getPrecio());
		}
		return total.divide(BigDecimal.valueOf(listaCurso.size()), 2, RoundingMode.HALF_DOWN);
	}

	public void borrarCursosPasados() {
		for (Iterator<Curso> i = listaCurso.iterator(); i.hasNext();) {
			Curso curso = i.next();
			if (curso.getFechaFin().isAfter(LocalDate.now())) {
				i.remove();
			}
		}
	}

	// Plantilla de algoritmo para buscar si algo es mas o menos que algo

	public Curso getCursoMasBarato() {
		Curso c = null;
		for (Curso curso : listaCurso) {
			if (curso.getFechaIni().isAfter(LocalDate.now())) {
				if (c == null || curso.getPrecioMes().compareTo(c.getPrecioMes()) < 0)
					c = curso;
			}
		}
		return c;
	}

	public Integer getTotalPlazasLibres() {
		Integer total = 0;
		for (Curso curso : listaCurso) {
			if (curso.isPlazasLibres()) {
				total += (curso.getPlazasTotales() - curso.getPlazasOcupadas());
			}
		}
		return total;

	}

	// Lista con todos los alumnos cuyo tenga la que se pasa por el metodo y esten
	// aprobados

	public List<Alumno> buscarAlumno(String letra) {
		List<Alumno> miLista = new ArrayList<>();
		for (String dni : mapa.keySet()) {
			if (dni.contains(letra) && mapa.get(dni).getNota().compareTo(BigDecimal.valueOf(5)) >= 0) {
				miLista.add(mapa.get(dni));
			}
		}
		return miLista;
	}

	// getPeorNota(BigDecimal minima) y devuelve el alumno con menor nota de los que
	// tienen mayor a la minima

	public Alumno getPeorNota(BigDecimal minima) {
		Alumno alum = null;
		for (String dni : mapa.keySet()) {
			if (mapa.get(dni).getNota().compareTo(minima) > 0) {
				if (alum == null || mapa.get(dni).getNota().compareTo(alum.getNota()) < 0) {
					alum = mapa.get(dni);
				}
			}

		}

		return alum;

	}
	
	//De todos los alumnos de sevilla cual es el mas joven
	
	public Alumno getSevillanoMasJoven() {
		Alumno al = null;
		for (String alumno : mapa.keySet()) {
			if(mapa.get(alumno).getCiudad().equals("Sevilla")) {
				if(al == null || mapa.get(alumno).getFechaNacimiento().isAfter(al.getFechaNacimiento())) {
					al=mapa.get(alumno);
				}
			}
		}
		return al;
	}
	
	
	
	
	
	
	

}
