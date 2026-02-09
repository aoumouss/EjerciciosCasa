package ejercicios.ejercicios19;


public class AppSemaforo {

	public static void main(String[] args) {

		Semaforo semaforo= new Semaforo();
		System.out.println(semaforo);
		
		semaforo.setColor("MORADO");
		System.out.println(semaforo);
		
		semaforo.setColor(Semaforo.VERDE);
		System.out.println(semaforo);
		
		semaforo.setParpadeando(true);
		System.out.println(semaforo);
		
		semaforo.setColor(Semaforo.AMBAR);
		System.out.println(semaforo);

		semaforo.setParpadeando(true);
		System.out.println(semaforo);
		
		for (int i = 1; i <= 5; i++) {
			semaforo.cambiarEstado();
		}
		System.out.println(semaforo);

		System.out.println("COPIA:     ");
		Semaforo copia=new Semaforo();
		copia.setColor(semaforo.getColor());
		copia.setParpadeando(semaforo.getParpadeando());
		System.out.println(copia);
		
		
		
		
	}

}
