package ejercicios.ejercicios18;

import java.util.Objects;

public class Reloj {
	
	private Integer horas;
	private Integer minutos;
	private Integer segundos;
	Boolean formato24Horas;
	
	public Reloj() {
		horas=00;
		minutos=00;
		segundos=00;
		formato24Horas=true;
	}
	
	public Reloj(Integer horas,Integer minutos,Integer segundos) {
		this.horas=horas;
		this.minutos=minutos;
		this.segundos=segundos;
		formato24Horas=true;
	}

	public Integer getHoras() {
		return horas;
	}

	public Integer getMinutos() {
		return minutos;
	}

	public Integer getSegundos() {
		return segundos;
	}

	public Boolean getFormato24Horas() {
		return formato24Horas;
	}
	
	
	public void ponerEnHora(Integer horas,Integer minutos) {
		this.horas=horas;
		this.minutos=minutos;
	}
	public void ponerEnHora(Integer horas,Integer minutos, Integer segundos) {
		this.horas=horas;
		this.minutos=minutos;
		this.segundos=segundos;
	}
	
	public void setformato24Horas(Boolean formato24Horas) {
		this.formato24Horas= formato24Horas;
	}
	
	public Boolean check() {
		return(horas >=0 && horas <=23 
			   && minutos >=0 && minutos<= 59 
			   && segundos>=0 && segundos <=59);
	}
	
	
	
	public String toString() {
		if(!check()) {
			return "Hora incorrecta";
		}
		
		Integer horasToString = horas;
		String terminacion="";
		if(!formato24Horas && horas>12) {
			horasToString=horas-12;
			terminacion=" pm";
		}
		if(!formato24Horas) {
			terminacion=" am";
		}
		
//		return horasToString< 10 ? "0"+horasToString : horasToString + ":"+ minutos+":"+segundos+terminacion;
		return formatea(horasToString)+ ":" + formatea(minutos) +":"+formatea(segundos)+terminacion;
		
		
	}
	
	private String formatea(Integer numero) {
		if(numero<10) {
			return "0"+numero;
		}
		return numero.toString();
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reloj other = (Reloj) obj;
		return Objects.equals(horas, other.horas) && Objects.equals(minutos, other.minutos)
				&& Objects.equals(segundos, other.segundos);
	}
	
	
	
	
	
	

}
