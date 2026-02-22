package ejercicios.ejercicios45;

public class AppGeografia {

	public static void main(String[] args) {
		
		
		Geografia g= new Geografia();
		
		g.agregarPais("españa", "madrid");
		g.agregarPais("s", "madrid");
		g.agregarPais("sa", "madrid");
		

		System.out.println(g.imprimirPaises());
	}

}
