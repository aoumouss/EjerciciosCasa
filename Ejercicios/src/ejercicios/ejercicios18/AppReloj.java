package ejercicios.ejercicios18;

import java.util.Scanner;

public class AppReloj {

	public static void main(String[] args) {
		Reloj reloj=new Reloj();
		System.out.println(reloj);
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Dime una hora");
			Integer hora=sc.nextInt();
			System.out.println("Dime un minuto");
			Integer minutos= sc.nextInt();
			System.out.println("Dime un segundo");
			Integer segundos=sc.nextInt();
			reloj.ponerEnHora(hora, minutos,segundos);
			
			
			
			
		} while (!reloj.check());
		System.out.println(reloj);
		
		
		
		reloj.setformato24Horas(false);
		System.out.println(reloj);
		
		reloj.ponerEnHora(24, 17);
		System.out.println(reloj);
		reloj.ponerEnHora(21, 82);
		System.out.println(reloj);
		reloj.ponerEnHora(17, 16,15);
		System.out.println(reloj);
		Reloj copia=new Reloj(17,16,15);
		System.out.println("Copia: "+copia);
		
		System.out.println("Iguales?? --> "+copia.equals(reloj) );
		
		
		
		
		
		
		
		
	}

}
