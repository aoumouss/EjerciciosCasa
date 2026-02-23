package ejercicios.ejercicios24;

import java.util.ArrayList;
import java.util.List;

public class PilaCadenas {

	
private List<String> lista;
	
	public PilaCadenas() {
		lista=new ArrayList<>();
	}
	
	
	
	public void anadirCadena(String cadena) {
		lista.add(0,cadena);
	}
	//igual que : lista.addFirst(cadena);
	
	
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
