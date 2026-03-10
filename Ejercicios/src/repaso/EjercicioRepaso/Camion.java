package repaso.EjercicioRepaso;

import java.math.BigDecimal;

public class Camion extends Automovil{
	
	private BigDecimal tonelaje;
	
	
	
 
	public BigDecimal getTonelaje() {
		return tonelaje;
	}

	public void setTonelaje(BigDecimal tonelaje) {
		this.tonelaje = tonelaje;
	}
	
	 
	@Override
	public BigDecimal getCostePeaje() {
		return super.getCostePeaje().add((BigDecimal.valueOf(0.20).multiply(tonelaje)));
		// aqui llamas al método del padre y lo modificas según requiera
	}
	

}
