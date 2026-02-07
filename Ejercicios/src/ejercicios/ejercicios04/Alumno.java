package ejercicios.ejercicios04;

import java.util.Objects;

import ejercicios.ejercicios07.Persona;
import ejercicios.ejercicios08.Curso;

public class Alumno extends Persona {
	private String dni;
	private Double nota;
	private Curso curso; 
	
	
	
public Alumno(String dni) {
	this.dni=dni.toUpperCase();
}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni.toUpperCase();
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

	public void aprobar() {
		if(nota<5) {		
			nota = 5.0;
		}
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nota=" + nota + ", curso=" + curso.getIdentificador()+" "+curso.getDescripcion() + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(dni, other.dni);
	}

	
	public Boolean validarDNI() {
		return !(dni==null || dni.isEmpty() || dni.length()!=9);
	}
	
	
	
	public Boolean validar() {
		if(!validarDNI()) {
			return false;
		}
		if(curso==null) {
			return false;
		}
		if(nombre==null || nombre.length()<10) {
			return false;
		}
		if(edad ==null || edad <12 || edad >65) {
			return false;
		}
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}