package ejercicios.ejercicios40;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class CuentaAhorros {
	
	private String codigo;
	private List<Movimiento> listaMovimientos;

	
	public CuentaAhorros(String codigo) {
		this.codigo=codigo;
		listaMovimientos=new ArrayList<>();
	}
	
	
	public void anadirMovimiento(Movimiento movimiento) {
		listaMovimientos.add(movimiento);
		
	}
	
	DecimalFormat formatDecimal= new DecimalFormat("#,###.00 €");

	public BigDecimal getDinero() {
		BigDecimal cantidad= new BigDecimal("0");
		for (Movimiento movimiento : listaMovimientos) {
			cantidad=cantidad.add(movimiento.getImporteSumar().setScale(2,RoundingMode.HALF_DOWN));
		}
		return cantidad;
	}
	
	
	public List<String> listaCadenas() {
		List<String> lista= new ArrayList<>();
		for (Movimiento mov : listaMovimientos) {
			lista.add(mov.toString());
		}
		return lista;
	}

	

	public String listaRetiradas() {
		String retirada="";
		for (Movimiento movimiento : listaMovimientos) {
			if(movimiento.getInicial().equals("R")) {
				retirada+= movimiento.toString()+"\n";
			}
		}
		return retirada;
	}
	
	
	
	public String listaCargos() {
		String retirada="";
		for (Movimiento movimiento : listaMovimientos) {
			if(movimiento.getInicial().equals("C")) {
				retirada+= movimiento.toString()+"\n";
			}
		}
		return retirada;
	}
	
	
	
	
	public String listaIngresos() {
		String retirada="";
		for (Movimiento movimiento : listaMovimientos) {
			if(movimiento.getInicial().equals("I")) {
				retirada+= movimiento.toString()+"\n";
			}
		}
		return retirada;
	}

	
	
	
	public String toString() {
		DecimalFormat formatDecimal= new DecimalFormat("#,###.00 €");

		return "Código de Cuenta: "+codigo+ " Dinero en la cuenta: "+formatDecimal.format(getDinero());
	}
	
	
	
	
}
