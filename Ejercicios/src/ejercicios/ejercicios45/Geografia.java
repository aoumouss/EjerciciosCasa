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
			mapa.put(pais, capital);
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
		mapa.remove(pais);
		return;
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
			
		for(String pais: mapa.keySet()) {
			if(mapa.get(pais).startsWith(letra.toUpperCase())) {
				mapa.remove(pais);
				break;
			}
		}
	}
	
	
	public Integer numeroPaisesConCapitalLetra(String letra) {
		Integer contador=0;
		for(String pais: mapa.keySet()) {
			if(pais.startsWith(letra.toUpperCase())) {
				contador++;
			}
		}
			return contador;
	}
	
	
	public void imprimirNumeroPaisesLetra(String letra) {
		for (String pais : mapa.keySet()) {
			if(mapa.get(pais).startsWith(letra.toUpperCase())){
				System.out.println(pais+" -->"+mapa.get(pais));
				 
			}
			else if(!mapa.get(pais).startsWith(letra.toUpperCase())){
				
			}
			else {
				System.out.println("Ninguna capital del mapa comienza por "+letra);
			}
		}
	}
	
	
	
	public void mismaLetra() {
		for (String pais  : mapa.keySet()) {
			if(mapa.get(pais).substring(0, 1).equalsIgnoreCase(pais.substring(0, 1))) {
				System.out.println(pais+" --> "+mapa.get(pais));
			}
		}
	}
	
	
	
	
	
	
	
	

}
