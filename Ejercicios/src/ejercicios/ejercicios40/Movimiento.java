package ejercicios.ejercicios40;

import java.time.LocalDate;

public abstract class Movimiento {
	
	private LocalDate fechaRegistro;

	public LocalDate getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(LocalDate fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	
	

}
