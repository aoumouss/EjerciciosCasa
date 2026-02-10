package ejercicios.ejercicios35;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ListasSet {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Set<String> set=new HashSet<>();
		
		System.out.println("Introduce 5 cadenas: ");
		for (int i = 1; i < 6; i++) {
			System.out.println("Introduce la cadena "+i+" : ");
			String cadena= sc.nextLine();
			set.add(cadena.toUpperCase());
		}
		
		System.out.println(set);
		
		
		if(set.contains("")) {
			System.out.println("Hay una cadena vacía");
		}
		
		
		Iterator<String> it=set.iterator();
		while(it.hasNext()) {
			String palabra = it.next();
			if(palabra.length()<6) {
				it.remove();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
