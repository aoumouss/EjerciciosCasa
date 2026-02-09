package ejercicios.ejercicios33;

import java.util.ArrayList;
import java.util.List;

public class ListaArticulos {
	
	
	ArrayList<Articulo> lista=new ArrayList<>();


	public ListaArticulos() {
		lista=new ArrayList<>();
	}
	

	public void addArticulo(Articulo articulo) {
		lista.add(articulo);
	}
	
	
	public Integer getCantidad() {
		return lista.size();
	}
	
	public Integer getTotal() {
		Integer total=0;
		for (int i = 0; i < lista.size(); i++) {
			total+=lista.get(i).getPrecio();
		
		}
		return total;
		
	}
	
	public void borrarArticulo(Integer posicion) {
		lista.remove(posicion);
	}
	
	public void vaciarCesta() {
		lista.clear();
	}
	
	
}
