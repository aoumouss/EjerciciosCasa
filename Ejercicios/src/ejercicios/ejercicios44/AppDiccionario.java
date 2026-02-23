package ejercicios.ejercicios44;

import java.util.ArrayList;
import java.util.List;

public class AppDiccionario {

	public static void main(String[] args) {
		
		List<String> lista= new ArrayList<>();
		Diccionario dic= new Diccionario();
		lista.add("Blas");
		lista.add("Sol");
		lista.add("regadera");
		lista.add("bola");
		lista.add("sevilla");
		
		dic.cargarDiccionario(lista);
		System.out.println(dic);
	}

}
