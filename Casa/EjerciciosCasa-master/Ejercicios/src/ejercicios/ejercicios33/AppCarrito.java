package ejercicios.ejercicios33;

public class AppCarrito {

	public static void main(String[] args) {

		
		Cliente cliente = new Cliente("12345678X","Blas de los Montes");
		Carrito carro = new Carrito(cliente);
		System.out.println(carro);
		System.out.println("");
		Ropa ropa = new Ropa();
		ropa.setPrecio(20);
		ropa.setDescripcion("Poncho");
		ropa.setTalla("XL");
		ropa.setColor("Azul");
		
		carro.addArticulo(ropa);
		carro.addArticulo(ropa);
		System.out.println(carro);
		System.out.println("");
		
		Libro libro = new Libro();
		libro.setPrecio(15);
		libro.setDescripcion("Así habló Zaratustra");
		libro.setAutor("Nietzsche");
		
		carro.addArticulo(libro);
		
		System.out.println(carro);
		System.out.println("");
		carro.borrarArticulo(ropa);
		System.out.println(carro);
		System.out.println("");
		
		System.out.println("Precio medio: "+ carro.getPrecioMedio()+"€");
		carro.vaciarCesta();
		System.out.println("Precio medio: "+ carro.getPrecioMedio()+"€");
		
		
	}

}
