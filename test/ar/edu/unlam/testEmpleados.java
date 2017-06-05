package ar.edu.unlam;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class testEmpleados {

	@Test
	public void testEmpleado() {
		Empleado Armando = new Empleado("Armando", 9200.0 ,"1994/11/17");
		Impuestos impSvc = new Impuestos();
		Double impuesto = impSvc.obtenerImpuesto(Armando);
		Double impuestoEsperado = 920.0;
		Assert.assertEquals(impuestoEsperado, impuesto);
		System.out.println(Armando);
		System.out.println("Sus impuesto es de: "+impuesto);
	}

	@Test
	public void testGerente(){
		Gerente Bartolomeo = new Gerente("Bartolomeo", 14000.0, "1987/05/14", 6, "RR.HH");
		Impuestos impSvc = new Impuestos();
		Double impuesto = impSvc.obtenerImpuesto(Bartolomeo);
		Double impuestoEsperado = 2100.0;
		Assert.assertEquals(impuestoEsperado, impuesto, 0.01);
		System.out.println(Bartolomeo);
		System.out.println("Sus impuesto es de: "+impuesto);
	}
	@Test
	public void testDirector(){
		Director Carlos = new Director("Carlos", 31000.0, "1968/02/4", 4,950.0);
		Impuestos impSvc = new Impuestos();
		Double impuesto = impSvc.obtenerImpuesto(Carlos);
		Double impuestoEsperado =6390.0;
		Assert.assertEquals(impuestoEsperado, impuesto, 0.01);
		System.out.println(Carlos);
		System.out.println("Sus impuesto es de: "+impuesto);
	}
	@Test
	public void testIngeniero() {
		Empleado ArmandoElIngeniero = new Empleado("ArmandoElIngeniero", 22000.0,"1994/11/17");
		Impuestos impSvc = new Impuestos();
		Double impuesto = impSvc.obtenerImpuesto(ArmandoElIngeniero);
		Double impuestoEsperado = 4400.0;
		Assert.assertEquals(impuestoEsperado, impuesto);
		System.out.println(ArmandoElIngeniero);
		System.out.println("Sus impuesto es de: "+impuesto);
	}
}
