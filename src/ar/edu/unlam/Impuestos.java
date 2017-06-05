package ar.edu.unlam;

public class Impuestos {
	public Double obtenerImpuesto(Empleado a){
		Double impuesto =0.0;
		Double salario = a.getSalario();
		if(salario>9000.00 && salario<12000){
			impuesto = salario*0.10;
			return impuesto;
		}
		if(salario>=12000.0 && salario<20000.0){
			impuesto = salario*0.15;
			return impuesto;
		}
		if(salario>=20000.00){
			impuesto = salario*0.20;
			return impuesto;
		}
		return impuesto;
	}
}
