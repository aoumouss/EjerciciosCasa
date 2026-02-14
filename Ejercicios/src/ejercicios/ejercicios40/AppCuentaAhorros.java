package ejercicios.ejercicios40;

import java.math.BigDecimal;
import java.time.LocalDate;

public class AppCuentaAhorros {

	public static void main(String[] args) {
		
		
		BigDecimal num= new BigDecimal("10");
		System.out.println("Cuenta corriente:");
		CuentaAhorros c1 = new CuentaAhorros("111");
		System.out.println(c1.getDinero());
		
		
		Cargo cargo1= new Cargo("12345678A");
		cargo1.setImporte(num);
		cargo1.setFechaRegistro(LocalDate.now());
	
		Cargo cargo2= new Cargo("12345678B");
		cargo2.setImporte(num);
		cargo2.setFechaRegistro(LocalDate.of(2000, 04, 12));
		
		
		Ingreso ingreso1 = new Ingreso();
		ingreso1.setFechaRegistro(LocalDate.of(2000, 04, 12));
		ingreso1.setImporte(num);
		ingreso1.setDescripcion("blas");
		
		Ingreso ingreso2 = new Ingreso();
		ingreso2.setFechaRegistro(LocalDate.of(2000, 04, 12));
		ingreso2.setImporte(num);
		ingreso2.setDescripcion("blas");
		
		
		Retirada retiro1 = new Retirada();
		retiro1.setFechaRegistro(LocalDate.of(2100, 10, 10));
		retiro1.setImporte(num);
		
		c1.anadirMovimiento(cargo1);
		c1.anadirMovimiento(cargo2);
		c1.anadirMovimiento(ingreso1);
		c1.anadirMovimiento(ingreso2);
		c1.anadirMovimiento(retiro1);
		
		
	
		System.out.println("Cantidad de dinero que tenemos:");
		System.out.println(c1.getDinero());
		System.out.println();
		
		System.out.println("Todos los movimientos: ");
		System.out.println(c1);
		System.out.println();
		
		System.out.println("Todos los cargos: ");
		System.out.println(c1.listaCargos());
		System.out.println();
		
		System.out.println("Todos los ingresos:");
		System.out.println(c1.listaIngresos());
		System.out.println();
		
		System.out.println("Todas las retiradas: ");
		System.out.println(c1.listaRetiradas());
		
	}
	

}
