package ejercicios.ejercicios20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EjercicioListas {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		List<String> lista= new ArrayList<>();
		
		for (int i = 0; i <5; i++) {
			System.out.println("Introduce una cadena: ");
			String cadena=sc.nextLine();
			lista.add(cadena);
		}
		
			
		for (int i = 0; i < lista.size(); i++) {
			lista.set(i, lista.get(i).toUpperCase());
		}
		
		if(lista.contains("")) {
			System.out.println("La lista tiene una cadena vacía");
		}
		
//		for (int i = 0; i <lista.size(); i++) {
//			if(lista.get(i).length()<6) {
//				lista.remove(i);
//				i--;
//			}
//			
//		}
		
		
		//CON ITERADOR
		Iterator<String> it=lista.iterator();
		while(it.hasNext()) {
			String palabra = it.next();
			if(palabra.length()<6) {
				it.remove();
			}
		}
		
		//CON FOR
		for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
			String palabra = (String) iterator.next();
			if(palabra.length()<6) {
				iterator.remove();
			}
			
			
		}
		
		
		
		System.out.println(lista);
		

		
		
		
	}
	
	
	

}
