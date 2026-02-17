package ejercicios.ejercicios40;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Retirada extends Movimiento{
	
	
	public String getInicial() {
		return "R";
	}
	
	public BigDecimal getImporteSumar() {
		return getImporte().negate();
	}

	public String toString() {
		DecimalFormat formatDecimal= new DecimalFormat("#,###.00 €");
		return getInicial()+" - "+getFechaRegistro().format(formateador)+" - "+formatDecimal.format(getImporte());
	}

}
