package ar.edu.unlam;

public class Secretaria extends Empleado {

	
	public Secretaria(String nombre, Double salario, String cumpleaño) {
		super(nombre, salario, cumpleaño);
	}

	@Override
	public String brindarDetalles() {
		String detallesDelEmpleado = "Detalles de la secretaria...";
		return detallesDelEmpleado;
		}
	
}
