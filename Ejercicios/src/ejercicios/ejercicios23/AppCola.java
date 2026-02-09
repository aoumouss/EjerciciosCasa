package ejercicios.ejercicios23;

public class AppCola {

	public static void main(String[] args) {
		
		
		ColaCadenas cola= new ColaCadenas();
		System.out.println(cola);
		cola.anadirCadena("primero");
		cola.anadirCadena("segundo");
		System.out.println(cola);
		
		System.out.println("Sacando: "+cola.sacarCadena());
		System.out.println(cola);
		
		System.out.println("Añado tercero: ");
		cola.anadirCadena("tercero");
		System.out.println(cola);
		

		System.out.println("Saco todo");
		while(cola.getTamaño()>0) {
			cola.sacarCadena();
		}
		
		System.out.println(cola);
		
		System.out.println("Añado el cuarto");
		cola.anadirCadena("cuarto");
		System.out.println(cola);
		
	}

}
