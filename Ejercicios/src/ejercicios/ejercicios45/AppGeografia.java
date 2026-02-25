package ejercicios.ejercicios45;

import java.util.Scanner;

public class AppGeografia {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Geografia g= new Geografia();
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Dame país");
			String pais= sc.nextLine();
			System.out.println("Dame capital");
			String capital= sc.nextLine();
			Boolean yaEstaba = g.agregarPais(pais, capital);
			if(yaEstaba) {
				System.out.println("Este pais ya me lo has dicho. Lo he actualizado");
				i--;
			}
		}
		
		
		System.out.println("\n Mapa completo:");
		System.out.println(g.imprimirPaises());
		System.out.println("\nPromedio longitud "+g.calcularLongitudPaises());
		System.out.println("\n Dame una letra:");
		String letra=sc.nextLine();
		g.imprimirNumeroPaisesLetra(letra);
		System.out.println("\nPaíses y capital con misma letra:");
		g.mismaLetra();
		System.out.println("\n Borramos países con misma letra que capital:");
		g.eliminarPaisConCapitalLetra(letra);
		g.imprimirNumeroPaisesLetra(letra);
	}

}
