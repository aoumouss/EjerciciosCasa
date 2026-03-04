package repaso.ejercicio07;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.Period;

public class Curso {
	
	
	
	private String nombre;
	private LocalDate fechaIni;
	private LocalDate fechaFin;
	private BigDecimal precio;
	private Integer plazasTotales;
	private Integer plazasOcupadas;
	
	
	public Curso(String nombre, BigDecimal precio, Integer plazasTotales) {
		this.nombre=nombre;
		this.precio=precio;
		this.plazasTotales=plazasTotales;
		plazasOcupadas=0;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public LocalDate getFechaIni() {
		return fechaIni;
	}


	public void setFechaIni(LocalDate fechaIni) {
		this.fechaIni = fechaIni;
	}


	public LocalDate getFechaFin() {
		return fechaFin;
	}


	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}


	public BigDecimal getPrecio() {
		return precio;
	}


	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}


	public Integer getPlazasTotales() {
		return plazasTotales;
	}


	public void setPlazasTotales(Integer plazasTotales) {
		this.plazasTotales = plazasTotales;
	}


	public Integer getPlazasOcupadas() {
		return plazasOcupadas;
	}


	public void setPlazasOcupadas(Integer plazasOcupadas) {
		this.plazasOcupadas = plazasOcupadas;
	}
	
	
	public Integer getDuracionCurso() {
		if(fechaIni== null || fechaFin == null) {
			return 0;
		}
		Period periodo = fechaIni.until(fechaFin);
		return periodo.getMonths()+(periodo.getYears()*12);
	}
	
	
	
	
	public Boolean isPlazasLibres() {
		Boolean estado= false;
		if((plazasTotales-plazasOcupadas)>0) {
			estado=true;
		}
		return estado;
	}
	
	public BigDecimal getPrecioMes() {
		if(getDuracionCurso()==0) {
			return BigDecimal.ZERO;
		}
		return precio.divide(BigDecimal.valueOf(getDuracionCurso()),2, RoundingMode.HALF_DOWN);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
