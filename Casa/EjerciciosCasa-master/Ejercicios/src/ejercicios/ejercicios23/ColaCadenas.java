package ejercicios.ejercicios23;

import java.util.ArrayList;
import java.util.List;

public class ColaCadenas {
	
	
	
	private List<String> lista;
	
	public ColaCadenas() {
		lista=new ArrayList<>();
	}
	
	
	
	
	public void anadirCadena(String cadena) {
		lista.add(cadena);		
	}
	
	public String sacarCadena() {
		if(lista.isEmpty()) {
			return null;
		}
		return lista.remove(0);
	}
	
	
	public Integer getTamaño() {
		return lista.size();
	}
	
	
	public String toString() {
		
		return lista.toString();
	}
	
	
	
	
	
	

}
