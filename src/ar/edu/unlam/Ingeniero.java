package ar.edu.unlam;

public class Ingeniero extends Empleado {

	public Ingeniero(String nombre, Double salario, String cumplea�o) {
		super(nombre, salario, cumplea�o);
	}

	@Override
	public String brindarDetalles() {
		String detallesDelEmpleado = "Detalles del ingeniero...";
		return detallesDelEmpleado;
	}
	
}
