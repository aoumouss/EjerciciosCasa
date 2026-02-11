package ejercicios.ejercicios38;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import ejercicios.ejercicios33.Articulo;
import ejercicios.ejercicios33.Cliente;
import ejercicios.ejercicios33.ListaArticulos;

public class Carrito2 {
	
	private LocalDate fechaCreacion;
	private LocalDate fechaActualizacion;
	private Cliente cliente;
	private ListaArticulos listaArticulos;

	
	
	public Carrito2(Cliente cliente) {
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
	
	public Integer getPrecioMedio() {
		 if(listaArticulos.checkLista()) {
			 return 0;
		 }
					
		return getTotal()/getCantidad();
	
	}

	
	public void addArticulo(Articulo articulo) {
		listaArticulos.addArticulo(articulo);
		fechaActualizacion=LocalDate.now();

	}
	
	
	public void borrarArticulo(Articulo articulo) {
		listaArticulos.borrarArticulo(articulo);
		fechaActualizacion=LocalDate.now();

	}
	
	public void vaciarCesta() {
		listaArticulos.vaciarCesta();
		fechaActualizacion=LocalDate.now();
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
			DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			return "Cliente: " + cliente.getNombre() +", DNI: "+cliente.getDni()+
					"\nArtículos: " + getCantidad() + " Suma: " + getTotal() +
					"€\nFecha act. " + fechaActualizacion.format(format);
		}

}
