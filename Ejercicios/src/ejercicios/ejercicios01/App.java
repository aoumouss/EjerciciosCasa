package ejercicios.ejercicios01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ejercicios.ejercicios02.ConsoleInOut;
import ejercicios.ejercicios03.Libro;
import ejercicios.ejercicios04.Alumno;
import ejercicios.ejercicios07.Persona;
import ejercicios.ejercicios08.Curso;
import ejercicios.ejercicios09.Profesor;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		
//		Scanner sc=new Scanner(System.in);
//		Calculadora calculadora=new Calculadora();
//		Integer operacion;
//		do {
//			
//		System.out.println("Indica un número: ");
//		Double numero= sc.nextDouble();
//		System.out.println("Correspondencia de operaciones: \n 1-Sumar \n 2-Restar \n 3-Multiplicar \n 4-Dividir \n 5-Salir");
//		System.out.println("¿Qué operación quieres hacer?");
//		operacion=sc.nextInt();
//		if(operacion ==1) {
//			System.out.println("Suma = " +calculadora.sumar(numero));
//		}
//		else if(operacion ==2){
//			System.out.println("Resta = "+calculadora.restar(numero));
//		}
//		else if(operacion==3) {
//			System.out.println("Multiplicacion = "+calculadora.multiplicar(numero));
//		}
//		else if(operacion==4 && numero>0) {
//			if(calculadora.getValor()==0) {
//				System.out.println("No se puede hacer una división entre 0, haz otra operación antes");
//			}
//			System.out.println("Division = "+calculadora.dividir(numero));
//		}
//		
//		} while (operacion !=5);
//		System.out.println("El valor final es: "+calculadora.getValor() );
//		sc.close();
//		

//		ConsoleInOut consola =new ConsoleInOut();
//		System.out.println("Indica que operacion quieres hacer: ");
//		String palabra="coche";
//		consola.write(palabra);
//		
//		System.out.println("Probemos que el numero esta entre 1 y 5");
//		consola.readInteger(palabra, 1, 5);
//		
//		

//		Scanner sc=new Scanner(System.in);
//		
//
//		
//		System.out.println("Indica el titulo del libro:");
//		String titulo = sc.nextLine();
//		
//		System.out.println("Indica el autor del libro:");
//		String autor= sc.nextLine();
//		
//		System.out.println("Indica el numero de paginas");
//		Integer totalPaginas=450;
//		
//		
//		Libro libro=new Libro(titulo,autor,totalPaginas);
//		
//		Integer opcion=sc.nextInt();
//		
//		do {
//			
//		System.out.println("¿Cómo vas con el libro? \n 1-He avanzado \n 2-He retrocedido \n 3-He abandonado");
//		
//		if(opcion==1 || opcion == 2) {
//			System.out.println("¿Cuantas paginas?");
//			Integer cantPaginas=sc.nextInt();
//			if(opcion==1) {
//				libro.leer(cantPaginas);
//			}
//			else if(opcion==2) {
//				libro.retroceder(cantPaginas);
//			}
//			System.out.println("LLevas un "+libro.progreso() + " % del libro");		
//		}
//		
//	
//		} while (opcion!=3 && libro.progreso()!=100);
//			System.out.println("Bye...");
//			System.out.println("Progreso: "+libro.progreso());

//		Alumno alumno=new Alumno("12345678A");
//		
//		System.out.println("Nombre del alumno: ");
//		String nombre=sc.nextLine();
//		System.out.println("Dni del alumno: ");
//		String dni=sc.nextLine();
//		System.out.println("Edad del alumno: ");
//		Integer edad=sc.nextInt();
//		System.out.println("Nota del alumno: ");
//		Integer nota=sc.nextInt();
//		
//		
//		alumno.setNombre(nombre);
//		alumno.setDni(dni);
//		alumno.setEdad(edad);
//		alumno.setNota(nota);
//		alumno.aprobar();
//		
//		
//	
//		System.out.println(alumno.getNombre());
//		System.out.println(alumno.getDni());
//		System.out.println(alumno.getEdad());
//		System.out.println(alumno.getNota());
//		
//		
//		Profesor profesor = new Profesor();
//		System.out.println("Añade los datos del profesor:");
//		System.out.println("Nombre:");
//		String nombre=sc.nextLine();
//		profesor.setNombre(nombre);
//		System.out.println("Edad:");
//		Integer edad=sc.nextInt();
//		profesor.setEdad(edad);
//		
//		System.out.println("Este es tu profesor: "+profesor.getNombre()+" "+profesor.getEdad() );
//		

//		Alumno alumno=new Alumno("12345678A");
//		Curso curso=new Curso();
//		Integer identificador= (1);
//		String nombreCurso= ("DAM");
//		curso.setIdentificador(identificador);
//		curso.setDescripcion(nombreCurso);
//		alumno.setCurso(curso);
//		Integer nota=10;
//		alumno.setNota(nota);
//		System.out.println(alumno.toString());
//		
//		
//		Profesor profesor =new Profesor();
//		String nombre="Pepe";
//		Integer edad= 20;
//		profesor.setEdad(edad);
//		profesor.setNombre(nombre);
//		System.out.println( profesor.toString());
//		
//		

		Alumno[] alumnos = new Alumno[3];
		List<Alumno> alumnos2=new ArrayList<>(); 
		

		System.out.println("Cuantas alumnos hay en el curso?");
		Integer cantAlumnos=sc.nextInt();
		sc.nextLine();
		Curso curso = new Curso(cantAlumnos);
		
		curso.setIdentificador(1);
		curso.setDescripcion("DAM-DAW");

		for (int i = 0; i < cantAlumnos; i++) {
			System.out.println("Datos del alumno " + (i + 1));

			do {
				System.out.println(">> Dime el DNI");
				String dni = sc.nextLine();
				alumnos[i] = new Alumno(dni);
			} while (!alumnos[i].validarDNI());
		
			
			
			
			//INICIALIZACIÓN DEL ALUMNOS CON LIST
			for (int j = 0; j < alumnos.length; j++) { 
			do {
				System.out.println("Dime el dni:");
				String dni=sc.nextLine();
				Alumno listAlumnos= new Alumno(dni);
				alumnos2.set(j, listAlumnos);
				
			} while (!alumnos2.get(j).validarDNI());
			
			}
			

			System.out.println(">> Dime el nombre");
			String nombre = sc.nextLine();
			alumnos[i].setNombre(nombre);
			System.out.println(">> Dime la nota");
			Double nota = sc.nextDouble();
			alumnos[i].setNota(nota);
			System.out.println(">> Dime la edad");
			Integer edad = sc.nextInt();
			alumnos[i].setEdad(edad);
			alumnos[i].setCurso(curso);
		
		}
		if (alumnos[0].equals(alumnos[1]) || alumnos[0].equals(alumnos[2]) || alumnos[1].equals(alumnos[2])) {
			System.out.println("Hay alumnos repetidos");
		} else {
			System.out.println("Todos los alumnos son distintos");
		}

		for (int i = 0; i < alumnos.length; i++) {
			if (!alumnos[i].validar()) {
				System.out.println("Alumno " + (i + 1) + " no válido");
			}
		}

	}

}
