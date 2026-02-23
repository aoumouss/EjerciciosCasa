package ejercicios.ejercicios02;

import java.util.Scanner;

public class ConsoleInOut {
	
	private Scanner sc;
	
	public ConsoleInOut(){
		 sc=new Scanner(System.in);
	}
	
	
	
	
	public void close() {
		sc.close();
		
	}
	
	public void write(String cadena) {
		System.out.println(cadena);
	}
	

	
	public Integer readInteger(String palabra) {
		System.out.println(palabra);
		Integer numero=sc.nextInt();
		return numero;
		
	}
	
	public Integer readInteger(String cadena,Integer min,Integer max) {
		Integer numero;
		do {
			numero=sc.nextInt();
			if(numero<max && numero>min) {
				break;
			}
		} while (numero>max || numero<min);
		System.out.println("Numero correcto!!!");
		return numero;
	}
	
	
	
	public Double readDouble(String palabra) {
		System.out.println(palabra);
		Double numero=sc.nextDouble();
		return numero;
		
	}
	

	public Double readDouble(String cadena,Double max,Double min) {
		Double numero=sc.nextDouble();
		do {
		if(numero<max && numero>min) {
			}
		} while (numero>max || numero<min);
		return numero;
	}


	public String readString(String msg) {
		write(msg);
		String texto;
		do {
			texto=sc.nextLine();
			
		} while (!texto.isEmpty());
			return texto;
	}
	

	
	
	
	public void waitEnter() {
		System.out.println("Pulse ENTER para continuar");
		sc.nextLine();
	}
	
	
	
	public Boolean isContinue(Boolean decision) {
		decision=false;
		System.out.println("¿Desea continuar (S/N)?");
		String entrada=sc.nextLine();
		if(entrada=="S") {
			decision=true;
		}
		if(entrada=="N") {
			decision = false;
			
		}
		return decision;
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	

}
