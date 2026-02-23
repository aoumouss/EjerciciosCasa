package ejercicios.ejercicios41;

import java.math.BigDecimal;

public class AppEvaluacion {

	public static void main(String[] args) {

		
		Evaluacion ev = new Evaluacion();
		ev.addNota("12345678A", BigDecimal.valueOf(9));
		ev.addNota("23456789B", BigDecimal.valueOf(3));
		
		
//		ev.corregirNota("1", BigDecimal.valueOf(3));
		
		
//		System.out.println(ev.obetenerNotaAlumno("1"));
	
		
		System.out.println("Media: "+ev.obtenerNotaMedia());
		
		System.out.println("Número aprobados: "+ev.obtenerCantidadAprobados());
		
		System.out.println("Lista de suspensos: "+ev.obtenerSuspensos());
		System.out.println();
		
		
		System.out.println(ev);
		
		
		
	}

}
