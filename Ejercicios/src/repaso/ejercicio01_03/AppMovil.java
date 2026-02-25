package repaso.ejercicio01_03;

import java.math.BigDecimal;

public class AppMovil {

	public static void main(String[] args) {
		
		LocalizadorGPS loc= new LocalizadorGPS(BigDecimal.valueOf(15,4747),BigDecimal.valueOf(12));
		Movil movil = new Movil(654654654,loc);
		Fijo fijo = new Fijo(954954954,"Calle Sevilla");
		
	   System.out.println(movil.consultarNumero());
	   System.out.println(fijo.consultarNumero());

	   
	   movil.marcar(654654654);
	   movil.marcar(610610610);
	   movil.colgar();
	   movil.colgar();
	}

}
