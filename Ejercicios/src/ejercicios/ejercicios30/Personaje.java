package ejercicios.ejercicios30;

import java.util.Objects;

public abstract class Personaje {
	
	private String nombre;
	private String codigo;
	protected Integer vida;
	

	
	public Personaje() {
		// TODO Auto-generated constructor stub
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public abstract Integer getPuntosVida();
	
	public abstract Integer getPuntosDano();
	
	public abstract Integer getPeriodoAtaque();
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personaje other = (Personaje) obj;
		return Objects.equals(codigo, other.codigo);
	}
	
	
	
	public String toString() {
		return "Nombre: "+nombre+" Código: "+codigo+" Puntos de vida: "+ getPuntosVida()  +" Puntos de daño: "+getPuntosDano()
				+" Periodo de ataque: "+getPeriodoAtaque();
	}
	
	
	

}
