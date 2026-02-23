package ejercicios.ejercicios45;

import java.util.HashMap;
import java.util.Map;

public class Geografia {
	
	private Map<String, String> mapa;
	
	
	public Geografia() {
		mapa=new HashMap<>();
	}
	
	
	


	
	public Boolean agregarPais(String pais, String capital) {
		Boolean modificado=false;
		String capi= capital.split("")[0].toUpperCase();
		capital=capi+capital.replace(capital.substring(0, 1), "");
		
		if(!mapa.containsKey(pais)) {
			mapa.put(pais.toUpperCase(), capital);	
		}
		else {
			mapa.replace(pais, capital);
			modificado=true;
		}
		return modificado;
	}
	
	
	
	
	
	public String obtenerCapital(String pais) {
		pais=pais.toUpperCase();
		if(mapa.containsKey(pais.toUpperCase())) {
			return mapa.get(pais);
		}
		return "";
		
	}
	
	
	public String imprimirPaises() {
		String cadena="";
		for (String i : mapa.keySet()) {
			cadena+= i+" --> "+mapa.get(i)+"\n";
			
		}
		return cadena;
	}
	
	public void eliminarPais(String pais) {
		pais=pais.toUpperCase();
		if(mapa.containsKey(pais)) {
			mapa.remove(pais, mapa.get(pais));
		}
	}
	
	
	public Double calcularLongitudPaises() {
		Double total=0.0;
		if(mapa.isEmpty()) {
			return 0.0;
		}
		else {
			for (String pais : mapa.keySet()) {
				total+= pais.length();
			}
			total=total/mapa.keySet().size();
		}
		return total;
	}
	
	
	public void eliminarPaisConCapitalLetra(String letra) {
		for(String pais: mapa.values()) {
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	

}
