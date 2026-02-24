package ejercicios.ejercicios45;

public class AppGeografia {

	public static void main(String[] args) {
		
		
		Geografia g= new Geografia();
		
		g.agregarPais("egipto", "el cairo");
		g.agregarPais("suiza", "berna");
		g.agregarPais("austria", "praga");
		g.agregarPais("hungría", "budapest");
		g.agregarPais("austria", "viena");
		g.agregarPais("Brasil", "brasilia");
		
		
		
		
		
		
		

		

		System.out.println(g.imprimirPaises());
		System.out.println(g.obtenerCapital("españa"));
		g.eliminarPais("italia");
		
		System.out.println(g.imprimirPaises());
		System.out.println(g.calcularLongitudPaises());
		g.eliminarPaisConCapitalLetra("r");
		System.out.println(g.imprimirPaises());
		
		System.out.println(g.numeroPaisesConCapitalLetra("b"));
		
//		g.imprimirNumeroPaisesLetra("b");
		
		System.out.println("Entradas cuyo nombre y capital comienzan por la misma letra: ");
		g.mismaLetra();
	}

}
