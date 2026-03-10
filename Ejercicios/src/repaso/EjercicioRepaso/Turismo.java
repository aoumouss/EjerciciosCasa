package repaso.EjercicioRepaso;

import java.math.BigDecimal;

public class Turismo extends Automovil{
	
	private Integer ocupantes;
	
	
	
	
	
	
	
	

	public Integer getOcupantes() {
		return ocupantes;
	}

	public void setOcupantes(Integer ocupantes) {
		this.ocupantes = ocupantes;
	}
	
	@Override
	public BigDecimal getTonelaje() {
		return BigDecimal.ZERO;
	}
	
	 
	@Override
	public BigDecimal getCostePeaje() { 
		return super.getCostePeaje().add((BigDecimal.valueOf(ocupantes)).multiply(BigDecimal.valueOf(5)));
	}
	
	
	
	

}
