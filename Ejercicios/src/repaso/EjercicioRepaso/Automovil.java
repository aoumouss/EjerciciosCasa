package repaso.EjercicioRepaso;

import java.math.BigDecimal;

public abstract class Automovil {
	
	private String matricula;
	private BigDecimal kilometros;
	
	
	
	
	
	public abstract BigDecimal getTonelaje();
	
	
	
	 


	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public BigDecimal getKilometros() {
		return kilometros;
	}
	public void setKilometros(BigDecimal kilometros) {
		this.kilometros = kilometros;
	}
	

	public BigDecimal getCostePeaje() {
		return kilometros.multiply(BigDecimal.valueOf(0.5));
	}
	
 

	
	
	
	
	
	
	
	
	

	
}
