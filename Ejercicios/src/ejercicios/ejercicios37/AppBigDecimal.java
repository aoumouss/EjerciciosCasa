package ejercicios.ejercicios37;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class AppBigDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		
//		BigDecimal numero1 = new BigDecimal(12.12);
//		BigDecimal numero2 = new BigDecimal(12.11);
//		
//		
//		numero1=numero1.setScale(3, RoundingMode.HALF_EVEN);
//		
//		
//		System.out.println(numero1.divide(numero2,2,RoundingMode.HALF_DOWN));
//		System.out.println(numero1.add(numero2));
//		
//		
//		
//		
		List<BigDecimal> lista=new ArrayList<>();
		System.out.println("Introduce 5 BigDecimal: ");
		while(lista.size()<5) {
			System.out.println("Dame un numero" );
			BigDecimal num=sc.nextBigDecimal();
			if(lista.isEmpty() || num.compareTo(lista.getLast())>0 ) {
				lista.add(num);
				}
			else {
				
				System.out.println("Cada número tiene que ser mayor que el anterior");
			}
				
			}
		
		System.out.println(lista);
		
		BigDecimal suma= BigDecimal.ZERO;
		for (BigDecimal num : lista) {
			suma=suma.add(num);
		}
		suma= suma.setScale(1,RoundingMode.HALF_DOWN);
		System.out.println("Suma :"+suma);
		
		BigDecimal division = lista.get(0).divide(lista.get(1),3, RoundingMode.HALF_UP);
		System.out.println(division);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
