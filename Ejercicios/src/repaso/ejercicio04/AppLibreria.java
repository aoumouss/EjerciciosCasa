package repaso.ejercicio04;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AppLibreria {

	public static void main(String[] args) {
		
		
		Libreria libreria= new Libreria("Avda. de los sueños perdidos, 89",954696954);
		
		LibroFisico libFisico= new LibroFisico();
		libFisico.setTitulo("Libro1");
		libFisico.setPeso(BigDecimal.valueOf(15));
		libFisico.setAutor("Autor1");
		libFisico.setNumPaginas(150);
		libFisico.setFechaEdicion(LocalDate.of(1000, 03, 10));
		
		LibroFisico libFisico2= new LibroFisico();
		libFisico2.setTitulo("Libro2");
		libFisico2.setPeso(BigDecimal.valueOf(800));
		libFisico2.setAutor("Autor2");
		libFisico2.setNumPaginas(6500);
		libFisico2.setFechaEdicion(LocalDate.of(2220, 01, 02));
		
		
		LibroDigital libDigital = new LibroDigital();
		libDigital.setTitulo("LiDig1");
		libDigital.setPeso(BigDecimal.valueOf(900));
		libDigital.setAutor("AutorDig1");
		libDigital.setNumPaginas(6);
		libDigital.setFechaEdicion(LocalDate.of(5000, 10, 20));
		
		LibroDigital libDigital2 = new LibroDigital();
		libDigital2.setTitulo("LiDig2");
		libDigital2.setPeso(BigDecimal.valueOf(10));
		libDigital2.setAutor("AutorDig2");
		libDigital2.setNumPaginas(80);
		libDigital2.setFechaEdicion(LocalDate.of(2000, 10, 20));
		
		
		List<Libro> lista= new ArrayList<>();
		lista.add(libFisico);
		lista.add(libFisico2);
		lista.add(libDigital);
		lista.add(libDigital2);
		libreria.setListaLibros(lista);
		
	

		
		System.out.println(libreria);
		System.out.println(libreria.obtenerLibroMasAntiguo());
		System.out.println(libreria.obtenerNumPaginasMedio());
		System.out.println(libreria.obtenerPesoTotalDeLibros());
		
		
	}

}
