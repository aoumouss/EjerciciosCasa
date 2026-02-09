package ejercicios.ejercicios08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ejercicios.ejercicios04.Alumno;

public class Curso {

	private Integer identificador;
	private String descripcion;
	private Alumno[] alumnos;
	private Integer cantAlumnosMatriculados;
	private List<Alumno> alumnos2;

	public Curso(Integer cantAlumnos) {
		alumnos=new Alumno[cantAlumnos];
		alumnos2=new ArrayList<>();
	}
	
	
	public Alumno[] getAlumnos() {
		return alumnos;
	}
	
	
	public void addAlumno(Alumno alumno) {
		
		if(cantAlumnosMatriculados<alumnos.length) {
			alumnos[cantAlumnosMatriculados]=alumno;
			cantAlumnosMatriculados++;
		}
	}
	
	public void addAlumnos2(Alumno alumno2) {
		alumnos2.add(alumno2);
	}
	
	
	
	public Integer getIdentificador() {
		return identificador;
	}

	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
