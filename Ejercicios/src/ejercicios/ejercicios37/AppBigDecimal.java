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
		for (int i = 1; i < 6; i++) {
			System.out.println(i+": ");
			BigDecimal num=sc.nextBigDecimal();
			if(i==1) {
				lista.add(num);
			}
			if(lista.get(i+1).compareTo(lista.get(i))<0 ) {
				lista.add(num);
				System.out.println("Cada número tiene que ser mayor que el anterior");
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
