package ejercicios.ejercicios40;

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

	public String toString() {
		return getInicial()+" - "+getFechaRegistro().format(formateador)+" - "+getImporte().setScale(2)+"€"+" - "+getDescripcion();
	}

}
