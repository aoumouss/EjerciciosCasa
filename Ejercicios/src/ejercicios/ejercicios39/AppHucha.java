package ejercicios.ejercicios39;

import java.math.BigDecimal;

public class AppHucha {
	public static void main(String[] args) {
		
		
		Hucha hucha = new Hucha();
		
		BigDecimal valor2=  new BigDecimal(100);
		hucha.meterDinero(valor2);
		System.out.println(hucha);
		
		BigDecimal valor3=  new BigDecimal(50.501);
		hucha.meterDinero(valor3);
		System.out.println(hucha);
		
		
		BigDecimal valor4=  new BigDecimal(20.5);
		hucha.sacarDinero(valor4);
		System.out.println(hucha);
		
		
		BigDecimal valor5=  new BigDecimal(200);
		BigDecimal dineroSacado=hucha.sacarDinero(valor5);
		System.out.println(hucha);
		
		
		hucha.meterDinero(dineroSacado);
		System.out.println(hucha);
		
		hucha.contarDinero();
		hucha.meterDinero(hucha.contarDinero());
		System.out.println(hucha);
		
		hucha.romperHucha();
		hucha.meterDinero(hucha.romperHucha());
		System.out.println(hucha);
		
		
	}

}
