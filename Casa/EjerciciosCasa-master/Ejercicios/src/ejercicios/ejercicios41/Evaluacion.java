package ejercicios.ejercicios41;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Evaluacion {
	
	Map<String,BigDecimal> notas = new HashMap<>();
	
	
	
	public Boolean addNota(String dni, BigDecimal nota) {
		Boolean check=false;
		if(!notas.containsKey(dni) || notas.get(dni) == null) {
			notas.put(dni, nota);
			check=true;
		}
		return check;
	}

	
	
	public Boolean corregirNota(String dni, BigDecimal notaNueva) {
		Boolean cambio=false;
		if(notas.get(dni)!=null) {
			notas.put(dni, notaNueva);
			cambio=true;
		}
		
		return cambio;
	}
	
	
	
	public BigDecimal obetenerNotaAlumno(String dni) {
		if(notas.containsKey(dni)) {
			 return notas.get(dni);
		}
		return BigDecimal.ZERO;
	}
	
	
	public BigDecimal obtenerNotaMedia() {
		BigDecimal total=BigDecimal.valueOf(notas.size());
		BigDecimal suma= BigDecimal.valueOf(0);
		if(notas.isEmpty()) {
			suma=BigDecimal.valueOf(0);
		}
		for (BigDecimal nota : notas.values()) {
			suma=suma.add(nota);
			}
		suma=suma.divide(total, 2, RoundingMode.HALF_EVEN);
		return suma;
	}
	
	
	public Integer obtenerCantidadAprobados() {
		BigDecimal cinco=BigDecimal.valueOf(5);
		Integer contador=0;
		for (BigDecimal aprobados : notas.values()) {
			if(aprobados.compareTo(cinco)>=0) {
				contador++;
			}
		}
		return contador;
	}
	
	
	
	public List<String> obtenerSuspensos(){
		BigDecimal cinco=BigDecimal.valueOf(5);
		ArrayList<String> suspensos=new ArrayList<>();
		
		
		Set<Entry<String,BigDecimal>> pares = notas.entrySet();
		for (Entry<String,BigDecimal> par : pares) {
		
			
			if(par.getValue().compareTo(cinco)<0) {
				suspensos.add(par.getKey());
				
			}
		}
		
		return suspensos;
		}
		
		
		
	
	
//	public void borrarAprobados() {
//		BigDecimal cinco=BigDecimal.valueOf(5);
//		for (Iterator<String> iterator = notas.keySet().iterator(); iterator.hasNext();) {
//			String dni = iterator.next();
//			if(notas.get(dni).compareTo(cinco)>=0) {
//				iterator.remove();
//			}
//		}
//	}
		

	
	public void borrarAprobados() {
		Iterator<String> iterator = notas.keySet().iterator();
		BigDecimal cinco=BigDecimal.valueOf(5);
		while(iterator.hasNext()) {
			String dni = iterator.next();
			if(notas.get(dni).compareTo(cinco)>=0) {
				iterator.remove();
			}
		}
	}
	
	
	
	
	public String toString() {
		DecimalFormat format= new DecimalFormat("#,###.0");
		BigDecimal cinco=BigDecimal.valueOf(5);
		String aprobados="";
		String suspensos="";
		for (String dni : notas.keySet()) {
			BigDecimal nota= notas.get(dni);
			String alumno = "\t"+dni+" ("+format.format(nota)+")\n";
			if(notas.get(dni).compareTo(cinco)>=0) {
				aprobados+=alumno; 
			}
			else {
				suspensos+=alumno;
			}
		}
		if(aprobados.isEmpty()) {
			aprobados="Ninguno";
		}
		if(suspensos.isEmpty()){
			suspensos="Ninguno";
		}
		return "Aprobados:\n"+aprobados+"\nSuspensos\n"+suspensos;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
