package repaso.ejercicio01_03;

import java.math.BigDecimal;

public class LocalizadorGPS {
	
	private BigDecimal x;
	private BigDecimal y;
	
	public LocalizadorGPS(BigDecimal x, BigDecimal y) {
		this.x=x;
		this.y=y;
	}

	public BigDecimal getX() {
		return x;
	}

	public void setX(BigDecimal x) {
		this.x = x;
	}

	public BigDecimal getY() {
		return y;
	}

	public void setY(BigDecimal y) {
		this.y = y;
	}
	
	
	

}
