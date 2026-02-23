package ejercicios.ejercicios38;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import ejercicios.ejercicios38.Articulos2;

public class ListaArticulos2 {
	
private Set<Articulos2> set;
	

	public ListaArticulos2() {
//		lista=new ArrayList<>();
		set= new HashSet<>();
	}
	

	
	
	
	
	public void addArticulo(Articulos2 articulo) {
//		lista.add(articulo);
		set.add(articulo);
	}
	
	public Integer getCantidad() {
		return set.size();
	}
	
	public BigDecimal getTotal() {
		BigDecimal total = null;
		for (Articulos2 articulo : set) {
			total=total.add(articulo.getPrecio());
			
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
	
	
	
	public void borrarArticulo(Articulos2 articulo) {
			set.remove(articulo);
			
		}
	
	
	public void vaciarCesta() {
		set.clear();
		
	}

}
