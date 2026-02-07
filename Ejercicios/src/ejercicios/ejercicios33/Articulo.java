package ejercicios.ejercicios33;

public  abstract class Articulo {
	
	private String descripcion;
	protected Integer precio;
	
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Integer getPrecio() {
		return precio;
	}
	public abstract void setPrecio(Integer precio);
	
	
	public String toString() {
	
		return "Descripción: "+getDescripcion()+ "Precio: "+ getPrecio();
	}
	
	
	
	

}