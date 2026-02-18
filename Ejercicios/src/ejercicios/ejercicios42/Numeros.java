package ejercicios.ejercicios42;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Numeros {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Integer> mapa = new HashMap<>();
		
		Integer contador=0;
		System.out.println("Introduce números, el último será el cero: ");
		Integer num;
			do {	
			num = sc.nextInt();
			contador++;
			
			
			if(!mapa.containsKey(num)) {
				mapa.put(num, 1);
			}
			
			
			else if(mapa.containsKey(num)) {
				Integer cantidad= mapa.get(num)+1;
				mapa.put(num, cantidad);
			}
			
			
			
			Iterator<Integer> iterator = mapa.keySet().iterator();
			while(iterator.hasNext()) {
				Integer numero= iterator.next();
				if(mapa.containsKey(0)) {
					iterator.remove();
				}
			}

			
			
			} while (num!=0);
			contador=contador-1;
			System.out.println("Total números indicados: "+contador);
			System.out.println("Distribución: ");
			String veces="veces";
			for (Integer numero : mapa.keySet()) {
				System.out.println("\t> Numero: "+numero+" "+mapa.get(numero)+" "+ veces);
				if(mapa.get(numero)>1) {
					veces=("vez");
				}
			}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
