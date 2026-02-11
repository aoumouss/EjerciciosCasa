package ejercicios.ejercicios40;

public class Ingreso extends Movimiento{
	
	private Integer importe;
	private String descripcion;
	
	
	
	
	
	
	
	
	public Integer getImporte() {
		return importe;
	}








	public void setImporte(Integer importe) {
		this.importe = importe;
	}








	public String getDescripcion() {
		return descripcion;
	}








	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}








	public String toString() {
		return "I - "+getFechaRegistro()+" - "+getImporte()+" - "+getDescripcion();
	}

}
