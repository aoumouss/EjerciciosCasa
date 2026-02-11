package ejercicios.ejercicios38;

import java.math.BigDecimal;

public abstract class Articulos2 {
	
		
		private String descripcion;
		protected BigDecimal precio;
		
		
		public String getDescripcion() {
			return descripcion;
		}
		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
		public BigDecimal getPrecio() {
			return precio;
		}
		public  void setPrecio(BigDecimal precio) {
			this.precio=precio;
		};
		
		
		public String toString() {
		
			return "Descripción: "+getDescripcion()+ "Precio: "+ getPrecio();
		}
		
		
		
		

	}
	
	
	
	
