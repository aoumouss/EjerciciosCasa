package repaso.ejercicio01_03;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

public abstract class  Smartphone {
	
	private String marca;
	private String modelo;
	private String imei;
	private BigDecimal precio;
	private LocalDate fechaFabricacion;
	private Boolean activo;
	
	protected Integer numero;
	private Boolean enLlamada;
	
	
	
	
	public Smartphone(Integer numero) {
		this.numero=numero;
		enLlamada=false;
	}

	public Smartphone() {
		initialized();
	}
	
	public Smartphone(String imei) {
		initialized();
		this.imei=imei;
	}
	
	public Smartphone(String imei, String marca,String modelo) {
		initialized();
		this.imei=imei;
		this.marca=marca;
		this.modelo=modelo;
	}
	
	private void initialized() {
		activo=true;
		precio=BigDecimal.ZERO;
	}
	


	public void setPrecio(BigDecimal precio) {
		this.precio=precio;
	}
	
	public void activar() {
		activo=true;
	}
	
	public void desactivar() {
		activo=false;
	}
	
	public Integer getEdad() {
		LocalDate f= LocalDate.of(2000, 04, 01);
		Period periodo = f.until(fechaFabricacion);
		return periodo.getYears();
	}
	
	public void cambiarMarcaModelo(String marca,String modelo) {
		this.marca=marca;
		this.modelo=modelo;
		
	}
	
	public void establecerFabricacion(LocalDate fechaFabricacion) {
		this.fechaFabricacion=fechaFabricacion;
	}
	
	public BigDecimal getPrecioMasIva() {
		return precio.multiply(BigDecimal.valueOf(1.21));
	}
	 
	public Boolean isAltaGama(BigDecimal precioBase) {
		return(precio.compareTo(precioBase)>0);
	}
	
	
	public Boolean isDatosCompletos() {
		return (imei!= null && !imei.isBlank() && precio!=null);
	}
	
	
	
	public Boolean isGratis() {
		return (precio.equals(BigDecimal.ZERO));
	}
	
	public void rebajar() {
		precio=precio.subtract(BigDecimal.valueOf(10));
	}
	
	public String toString() {
		return "Datos:"+marca+"("+modelo+")"+(activo ? "":"- INACTIVO" );
	}

	
	
	public  Integer consultarNumero() {
		return numero;
	}
	
	
	
	public void marcar(Integer destino) {
		System.out.println("LLAMANDO A..."+destino);
		
		if(!destino.equals(numero)) {
			System.out.println( "COMUNICANDO");
		}
		else {
			System.out.println("EN COMUNICACIÓN");
			enLlamada=true;
		}
		
	}
	
	public void colgar() {
		if(enLlamada) {
			System.out.println("COMUNICACÓN TERMINADA");
			enLlamada=false;
		}
	}
	
	
	

}
