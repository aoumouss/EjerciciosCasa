package ejercicios.ejercicios29;

public class AppPelicula {

	public static void main(String[] args) {

		
		Actor actor1 = new Actor();
		actor1.setAnoNacimiento(1983);
		actor1.setNacionalidad("España");
		actor1.setNombre("Blau Blau");

		
		
		Actor actor2 = new Actor();
		actor2.setAnoNacimiento(1981);
		actor2.setNacionalidad("Italia");
		actor2.setNombre("Laura Pozo");

		Actor actor3 = new Actor();
		actor3.setAnoNacimiento(2001);
		actor3.setNacionalidad("Suiza");
		actor3.setNombre("Marcel Cade");

		Actor actor4 = new Actor();
		actor4.setAnoNacimiento(1999);
		actor4.setNacionalidad("Rusia");
		actor4.setNombre("Violeta Volo");

		
		
		Director director1=new Director();
		director1.setAnoNacimiento(1994);
		director1.setNacionalidad("Portugal");
		director1.setNombre("Sara Marea");
		
		
		Guionista guionista1=new Guionista();
		guionista1.setNombre("Marc Smith");
		guionista1.setNacionalidad("Reino Unido");
		guionista1.setAnoNacimiento(1998);
		
		Guionista guionista2=new Guionista();
		guionista2.setNombre("Cheng Shu");
		guionista2.setNacionalidad("China");
		guionista2.setAnoNacimiento(1977);
		
		
		Pelicula pelicula1=new Pelicula();
		pelicula1.setAnoEstreno(2027);
		pelicula1.setDirector(director1);
		pelicula1.setGuionista(guionista1);
		pelicula1.setListaActores(actor1);
		pelicula1.setListaActores(actor2);
		pelicula1.setTitulo("Do you know Joe Blas");
	
		System.out.println(pelicula1.getListaActores());
		System.out.println(pelicula1.getGuionista().getNacionalidad());
	
	
	
	
	}

}
