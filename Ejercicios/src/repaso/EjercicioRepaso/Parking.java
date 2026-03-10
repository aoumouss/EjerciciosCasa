package repaso.EjercicioRepaso;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Parking {
	
	
	private Map<LocalDate, Automovil> mapa;
	private LocalDate fechaEntrada;
	

	
	public Parking() {
		mapa=new HashMap<>();
	}



	public Map<LocalDate, Automovil> getMapa() {
		return mapa;
	}




	
	
	
	
	
	
	public LocalDate getFechaEntrada() {
		return fechaEntrada;
	}



	public void setFechaEntrada(LocalDate fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}


	public Boolean entrar(Automovil a) {
		Boolean p=false;
		if(a.getTonelaje().compareTo(BigDecimal.valueOf(1000))<0) {
			mapa.put(fechaEntrada, a);
			p=true;
		}
		return p;
	}
	
	

	public  BigDecimal getCosteParking(String matricula) {
		LocalDate hoy = LocalDate.now();
		
		for (LocalDate coche : mapa.keySet()) {
			Automovil vehiculo = mapa.get(coche);
			if(vehiculo.getMatricula().equals(matricula)) {
				Period periodo = coche.until(hoy);
				Integer dias= periodo.getDays()+1;
				
				if(vehiculo.getTonelaje().compareTo(BigDecimal.valueOf(500))>0) {
				return BigDecimal.valueOf(dias*30);
				}
	
				else {
				
					return BigDecimal.valueOf(dias*20);
				}
			}
		}
		return null;
	}
	
	
	public Boolean salir(String matricula) {
		for (Iterator<LocalDate> iterator = mapa.keySet().iterator(); iterator.hasNext();) {
			LocalDate  fecha =  iterator.next();
			Automovil vehiculo = mapa.get(fecha);
			if(vehiculo.getMatricula().equals(matricula)) {
				iterator.remove();
				return true;
			}
		}
		return false;
	}
	
	
	
	public BigDecimal getTotalPendienteCobro() {
		BigDecimal total= BigDecimal.ZERO;
		for (LocalDate fecha : mapa.keySet()) {
			Automovil vehiculo= mapa.get(fecha);
			total=total.add(getCosteParking(vehiculo.getMatricula()));
		}
		return total;
	}
	
	
	
	
	
	
	
	
	
	
	
}
