package ejercicios.ejercicios40;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Ingreso extends Movimiento{
	
	private String descripcion;
	


	
	public String getInicial() {
		return "I";
	}
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
	
	public BigDecimal getImporteSumar() {
		return getImporte();
	}
	
	
	public String toString() {
		DecimalFormat formatDecimal= new DecimalFormat("#,###.00 €");
		return getInicial()+" - "+getFechaRegistro().format(formateador)+" - "+formatDecimal.format(getImporte())+" - "+getDescripcion();
	}

}
