package ejercicios.ejercicios27;

import java.util.Objects;

public class Resultado {
	private Integer golesLocales;
	private Integer golesVisitante;

	
	public Resultado() {
		golesLocales=0;
		golesVisitante=0;
	}


	public Integer getGolesLocales() {
		return golesLocales;
	}


	public void setGolesLocales(Integer golesLocales) {
		this.golesLocales = golesLocales;
	}


	public Integer getGolesVisitante() {
		return golesVisitante;
	}


	public void setGolesVisitante(Integer golesVisitante) {
		this.golesVisitante = golesVisitante;
	}


	@Override
	public int hashCode() {
		return Objects.hash(golesLocales, golesVisitante);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Resultado other = (Resultado) obj;
		return Objects.equals(golesLocales, other.golesLocales) && Objects.equals(golesVisitante, other.golesVisitante);
	}
	
	
	
	public String toString() {
		return golesLocales+" - "+golesVisitante;
	}
	
	
	public Boolean isVictoriaLocal() {
		return(golesLocales>golesVisitante);
	}
	
	
	public Boolean isVictoriaVisitante() {
		return(golesLocales<golesVisitante);
			
	}
	
	public Boolean isEmpate() {
		return golesLocales.equals(golesVisitante);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
