package ejercicios.ejercicios40;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Movimiento {
	
	
	private LocalDate fechaRegistro;
	private BigDecimal importe;
	
	
	DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public BigDecimal getImporte() {
		return importe;
	}

	public void setImporte(BigDecimal importe) {
		this.importe = importe;
	}

	public LocalDate getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(LocalDate fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	
	public abstract String getInicial();
	
	
	

}
