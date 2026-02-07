package ejercicios.ejercicios33;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Carrito {
	
	private LocalDate fechaCreacion;
	private LocalDate fechaActualizacion;
	private Cliente cliente;
	private ListaArticulos listaArticulos;

	
	
	public Carrito(Cliente cliente) {
		this.fechaCreacion=LocalDate.now();
		this.fechaActualizacion=LocalDate.now();
		this.cliente=cliente;
		listaArticulos= new ListaArticulos();
	}
	
	
	public Integer getCantidad() {
		return listaArticulos.getCantidad();
	}
	
	
	public Integer getTotal() {
		return listaArticulos.getTotal();
	}
	

	
	public void addArticulo(Articulo articulo) {
		listaArticulos.addArticulo(articulo);
	}
	
	
	public void borrarArticulo(Integer posicion) {
		listaArticulos.borrarArticulo(posicion);
	}
	
	public void vaciarCesta() {
		listaArticulos.vaciarCesta();
	}
	
	
	
	
	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}
	
	public LocalDate getFechaActualizacion() {
		return fechaActualizacion;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public ListaArticulos getListaArticulos() {
		return listaArticulos;
	}



	public String toString() {
		
		return " Nombre y dni del cliente: "+cliente.getNombre()+", "+cliente.getDni()+ 
				"\n Cantidad de articulos: "+getCantidad()+
				"\n Total a pagar: "+ getTotal()+
				"\n Fecha ultima actualizacion: "+fechaActualizacion;
				
	}

	
	
	
	
	
	
	


}