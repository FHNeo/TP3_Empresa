package ar.edu.unlam;

public class Ingeniero extends Empleado {

	public Ingeniero(String nombre, Double salario, String cumpleaño) {
		super(nombre, salario, cumpleaño);
	}

	@Override
	public String brindarDetalles() {
		String detallesDelEmpleado = "Detalles del ingeniero...";
		return detallesDelEmpleado;
	}
	
}
