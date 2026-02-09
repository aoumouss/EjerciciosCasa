package ejercicios.ejercicios24;

import ejercicios.ejercicios24.PilaCadenas;

public class AppPila {

	public static void main(String[] args) {
		// TODO Auto-generated method 

		PilaCadenas pila= new PilaCadenas();
		System.out.println(pila);
		pila.anadirCadena("primero");
		pila.anadirCadena("segundo");
		System.out.println(pila);
		
		System.out.println("Sacando: "+pila.sacarCadena());
		System.out.println(pila);
		
		System.out.println("Añado tercero: ");
		pila.anadirCadena("tercero");
		System.out.println(pila);
		

		System.out.println("Saco todo");
		while(pila.getTamaño()>0) {
			pila.sacarCadena();
		}
		
		System.out.println(pila);
		
		System.out.println("Añado el cuarto");
		pila.anadirCadena("cuarto");
		System.out.println(pila);
		
		
		
	}

}
