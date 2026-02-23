package ejercicios.ejercicios30;

import java.util.ArrayList;
import java.util.List;

public  class EquipoCombate {
	
	private Integer puntosVida;
	private List<Personaje> listaPersonajes;
	
	
	public EquipoCombate() {
		listaPersonajes=new ArrayList<>();
	}


	public Integer getPuntosVida() {
		return puntosVida;
	}


	public void setPuntosVida(Integer puntosVida) {
		puntosVida+= puntosVida;
	}


	public List<Personaje> getListaPersonajes() {
		return listaPersonajes;
	}


	public void setListaPersonajes(Personaje listaPersonajes) {
		
		
		
	}
	
	
	public String toString() {
		return "Lisa de Personajes: "+listaPersonajes+ ", puntos de vida: "+puntosVida;
	}
	
	
	
	

}
