package ejercicios.ejercicios40;

public class Cargo extends Movimiento {

	private Integer importe;
	private String cif;
	
	
	
	
	
	public Integer getImporte() {
		return importe;
	}





	public void setImporte(Integer importe) {
		this.importe = importe;
	}





	public String getCif() {
		return cif;
	}





	public void setCif(String cif) {
		this.cif = cif;
	}





	public String toString() {
		return "C - "+getFechaRegistro()+" - "+getImporte()+" - "+getCif();
	}
}
