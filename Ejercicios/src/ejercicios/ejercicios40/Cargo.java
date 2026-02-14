package ejercicios.ejercicios40;

public class Cargo extends Movimiento {

	private String cif;
	
	
	public Cargo(String cif) {
		this.cif=cif;
	}
	
	public String getInicial() {
		return "C";
	}


	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String toString() {
		return getInicial()+" - "+getFechaRegistro().format(formateador)+" - "+getImporte().setScale(2)+"€"+" - "+getCif();
	}
}
