package ejercicios.ejercicios19;

public class Semaforo {
	
	public static final String ROJO="ROJO";
	public static final String AMBAR="AMBAR";
	public static final String VERDE="VERDE";
	
	
	private String color;
	private Boolean parpadeando;
	
	public Semaforo() {
		color=ROJO;
		parpadeando=false;
	}

	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if(color.equals(ROJO) || color.equals(AMBAR) || color.equals(VERDE)) {
			this.color = color;
			
		}

	}

	public Boolean getParpadeando() {
		return parpadeando;
	}

	public void setParpadeando(Boolean parpadeando) {
		if((parpadeando && color.equals(AMBAR)) || !parpadeando) {
			this.parpadeando=parpadeando;
		}
	}
	
	
	
	public String toString() {
		if(parpadeando) {
			return "Semáforo en "+color+" parpadeando";
			
		}
		return "Semáforo en "+color; 
		
	}
	
	
	public void cambiarEstado() {
		
		if(color.equals(VERDE)) {
			color=AMBAR;
			parpadeando=true;
		}
		else if(color.equals(AMBAR) && parpadeando) {
			parpadeando=false;
		}
		else if(color.equals(AMBAR)) {
			color=ROJO;
		}
		else{
			color=VERDE;
			
		}
		
		
	}
	
		
	
	
	
	
	
	
	
	
	
	
	
	

}
