package ejercicios.ejercicios45;

public class AppGeografia {

	public static void main(String[] args) {
		
		
		Geografia g= new Geografia();
		
		g.agregarPais("españa", "madrid");
		
		g.agregarPais("italia", "roma");
		g.agregarPais("austria", "viena");
		
		
		
		
		

		

		System.out.println(g.imprimirPaises());
		System.out.println(g.obtenerCapital("españa"));
		g.eliminarPais("italia");
		
		System.out.println(g.imprimirPaises());
		System.out.println(g.calcularLongitudPaises());

		
		
		
	}

}
