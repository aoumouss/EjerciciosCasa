package ejercicios.ejercicios30;

import java.util.Iterator;

public class AppJuego {

	public static void main(String[] args) {

		
		
		Jugador j1=new Jugador();
		EquipoCombate e1=new EquipoCombate();
		Parasito parasito1=new Parasito();
		parasito1.setCodigo("111");
		parasito1.setNombre("P1");
		parasito1.getPeriodoAtaque();
		parasito1.getPuntosDano();
		parasito1.getPuntosVida();
		e1.setListaPersonajes(parasito1);
		System.out.println(e1);
		
		
		
		
		Parasito parasito2=new Parasito();
		parasito2.setNombre("Blas");
		parasito2.setCodigo("B69");
		System.out.println(parasito2.getPeriodoAtaque());
		System.out.println(parasito2.getPuntosDano());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
