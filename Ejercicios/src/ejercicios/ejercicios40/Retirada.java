package ejercicios.ejercicios40;


public class Retirada extends Movimiento{
	
	
	public String getInicial() {
		return "R";
	}
	
	

	public String toString() {
		return getInicial()+" - "+getFechaRegistro().format(formateador)+" - "+getImporte().setScale(2)+"€";
	}

}
