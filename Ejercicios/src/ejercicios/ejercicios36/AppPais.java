package ejercicios.ejercicios36;

import java.util.HashSet;
import java.util.Set;

public class AppPais {

	public static void main(String[] args) {

		
		
		Set<Pais> paises= new HashSet<>();
		
		System.out.println(paises);
		
		Pais p1 = new Pais("ES","España");
		Pais p2 = new Pais("CK","Islas Cook");
		Pais p3 = new Pais("CK","Islas Caimán");
		
		
		paises.add(p1);
		paises.add(p2);
		paises.add(p3);
		System.out.println(paises);
	
		Pais p4= new Pais("es","España");
		paises.add(p4);
		System.out.println(paises);
	
		
		
		for (Pais pais : paises) {
			if(!pais.equals("ES")) {
				paises.remove(pais);
			}
		}
		System.out.println(paises);
		
		paises.clear();
		System.out.println(paises);
		
	
	}

}
