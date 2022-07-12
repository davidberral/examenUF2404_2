package ppal;

import modelo.CuentaJoven;
import modelo.Persona;

public class Ppal {

	public static void main(String[] args) {
		
		Persona p = new Persona("ana", 25, "434343443");
		
		CuentaJoven c1 = new CuentaJoven(p, 800, 0.05, true);

		CuentaJoven c2 = new CuentaJoven(
				new Persona("luis", 33, "3333333"), 1000, 0.08, false);
		
		System.out.println("La cuenta es "+c1);
		System.out.println("La cuenta es "+c2);
		
		System.out.println("Los intereses de c1 es "+ c1.calculaIntereses());
	
	
		System.out.println("tansfieriendo 300 euros a c2...");
		c1.transferir(c2, 300);
		
		System.out.println("La cuenta es "+c1);
		System.out.println("La cuenta es "+c2);
		
		
		
		
	}

}
