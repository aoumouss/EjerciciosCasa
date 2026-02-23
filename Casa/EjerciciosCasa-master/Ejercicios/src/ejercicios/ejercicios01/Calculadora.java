package ejercicios.ejercicios01;

public class Calculadora {
	private Double valor;

	public Calculadora() {
		valor = 0.0;

	}

	public Double sumar(Double sumando) {
		valor += sumando;
		return valor;
	}

	public Double restar(Double resto) {
		valor = valor - resto;
		return valor;
	}

	public Double multiplicar(Double multiplicando) {
		valor = valor * multiplicando;
		return valor;
	}

	public Double dividir(Double dividendo) {
		if (dividendo != 0) {
			valor = valor / dividendo;
		}
		return valor;
	}

	public void cero() {
		valor = 0.0;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	
	
	
}
