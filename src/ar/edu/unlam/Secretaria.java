package ar.edu.unlam;

public class Secretaria extends Empleado {

	
	public Secretaria(String nombre, Double salario, String cumplea�o) {
		super(nombre, salario, cumplea�o);
	}

	@Override
	public String brindarDetalles() {
		String detallesDelEmpleado = "Detalles de la secretaria...";
		return detallesDelEmpleado;
		}
	
}
