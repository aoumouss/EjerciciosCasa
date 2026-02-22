package ejercicios.ejercicios45;

import java.util.HashMap;
import java.util.Map;

public class Geografia {
	
	private Map<String, String> mapa;
	
	
	public Geografia() {
		mapa=new HashMap<>();
	}
	
	
	

	
	
	
	public Boolean agregarPais(String pais, String capital) {
	
		
		
		
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	public String imprimirPaises() {
		String cadena="";
		for (String i : mapa.keySet()) {
			cadena+= i+" --> "+mapa.values()+"\n";
			
		}
		return cadena;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
