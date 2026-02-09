package ejercicios.ejercicios33;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListaArticulos {
	
//	private List<Articulo> lista;
	private Set<Articulo> set;
	

	public ListaArticulos() {
//		lista=new ArrayList<>();
		set= new HashSet<>();
	}
	

	
	
	
	
	public void addArticulo(Articulo articulo) {
//		lista.add(articulo);
		set.add(articulo);
	}
	
	public Integer getCantidad() {
		return set.size();
	}
	
	public Integer getTotal() {
		Integer total=0;
		for (Articulo articulo : set) {
			total+=articulo.getPrecio();
			
		} {
		
		}
		return total;
		
	}
	
	
	public Boolean checkLista() {
		Boolean vacio=false;
		if(set.isEmpty()) {
			vacio=true;
		}
		return vacio;
	}
	
	
	
	public void borrarArticulo(Articulo articulo) {
			set.remove(articulo);
			
		}
	
	
	public void vaciarCesta() {
		set.clear();
		
	}
	
	
}
