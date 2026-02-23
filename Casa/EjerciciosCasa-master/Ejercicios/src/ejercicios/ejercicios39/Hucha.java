package ejercicios.ejercicios39;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Hucha {
	
	private BigDecimal valorHucha;
	
	public Hucha() {
		valorHucha = BigDecimal.ZERO;
	}
	
	
	

	
	public BigDecimal meterDinero(BigDecimal importe) {
		valorHucha=valorHucha.add(importe).setScale(2,RoundingMode.HALF_DOWN);
		return valorHucha;
	}
	
	
	
	public BigDecimal sacarDinero(BigDecimal importe) {
		if(importe.compareTo(valorHucha)>0) {
			BigDecimal loQueSaco=valorHucha;
			valorHucha=BigDecimal.ZERO;
			return loQueSaco.setScale(2, RoundingMode.HALF_UP);
		}
		valorHucha=valorHucha.subtract(importe);
		return importe.setScale(2,RoundingMode.HALF_DOWN);
	}
	
	
	
	
	public BigDecimal contarDinero() {
		return valorHucha.setScale(2, RoundingMode.HALF_UP);
	}
	
	public BigDecimal romperHucha() {
		BigDecimal ahorroPrevio=valorHucha;
		valorHucha=BigDecimal.ZERO;
		return ahorroPrevio.setScale(2,RoundingMode.HALF_DOWN);
	}
	
	
	
	
	
	public String toString() {
		
		return valorHucha.setScale(2, RoundingMode.HALF_UP)+"€";
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
