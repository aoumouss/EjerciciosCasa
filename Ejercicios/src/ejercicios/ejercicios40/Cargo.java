package ejercicios.ejercicios40;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Cargo extends Movimiento {

	private String cif;
	
	
	public Cargo(String cif) {
		this.cif=cif;
	}
	
	public String getInicial() {
		return "C";
	}


	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	
	public BigDecimal getImporteSumar() {
		return getImporte().negate();
	}
	
	
	
	public String toString() {
		DecimalFormat formatDecimal= new DecimalFormat("#,###.00 €");
		return getInicial()+" - "+getFechaRegistro().format(formateador)+" - "+formatDecimal.format(getImporte())+" - "+getCif();
	}
}
