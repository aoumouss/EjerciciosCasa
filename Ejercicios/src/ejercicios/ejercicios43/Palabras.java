package ejercicios.ejercicios43;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Palabras {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String palabra="";
		Map<String,List<String>> mapa = new HashMap<>();
		
		while (!palabra.equalsIgnoreCase("fin")) {
			System.out.println("Dime una palabra: ");
			palabra=sc.nextLine();
			if(!palabra.equalsIgnoreCase("fin")) {
			String inicial=palabra.toUpperCase().substring(0, 1);
			if(mapa.containsKey(inicial) ) {
				List<String> listaExistente=mapa.get(inicial);
					listaExistente.add(palabra);
					
				
			}
			else {
				List<String>listaNueva=new ArrayList<>();
				listaNueva.add(palabra);
				mapa.put(inicial, listaNueva);
			}
			}	
		}
		
		System.out.println(mapa);
		
		String letra="";
		do {
			
		System.out.println("Ahora dime una letra: ");
		letra= sc.nextLine().toUpperCase();
		String p=" palabra ";
			if(mapa.containsKey(letra)) {
				System.out.println(">"+mapa.get(letra));				
				if(mapa.get(letra).size()>1) {
					p=" palabras ";
				}
				System.out.println("Hay "+mapa.get(letra).size()+p+" que empiezan por "+letra.toUpperCase());
				
			}
			else{
				System.out.println("No hay palabras que empiecen por "+letra);
			}
			
				
		} while (!letra.equalsIgnoreCase("fin"));
		System.out.println("Gracis por jugar con nosotros! Bye");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
