package ejercicios.ejercicios44;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Diccionario {
	private Map<String,List<String>> mapa;
	
	public Diccionario(){
		mapa=new HashMap<>();
		
	}
	

	
	
	public void cargarDiccionario(List<String> lista) {
		for (String palabra : lista) {
			
			String inicial=palabra.substring(0,1).toUpperCase();
			
			
			if(!mapa.containsKey(inicial)) {
				List<String> listaNueva= new ArrayList<>();
				listaNueva.add(palabra.toUpperCase());
				mapa.put(inicial, listaNueva);	
			}
			else {
				List<String> listaExistente=mapa.get(inicial);
				listaExistente.add(palabra);
			}	
		}	
	}
	
	
	public void borrarDiccionario() {
		mapa.clear();
	}
	
	public String imprimirPalabras(String letra) {
		letra.toUpperCase();
		if(!mapa.containsKey(letra)) {
			return "No hay palabras con la letras: "+letra;	
			}
		
		
		
		return mapa.get(letra).toString();
	}
	
	String cadena="";
	public String toString() {
		for (String i : mapa.keySet()) {
			cadena+= i+" > "+mapa.get(i)+"\n";
		}
		return cadena;
	}
	
	
	
	
	
	
	
	
}
