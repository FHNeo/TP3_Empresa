package ar.edu.unlam;

public class Gerente extends Empleado {

	protected Integer cochera;
	protected String departamento;

	public Gerente(String nombre, Double salario, String cumpleaño, Integer cochera, String departamento) {
		super(nombre, salario, cumpleaño);
		this.cochera = cochera;
		this.departamento = departamento;
	}

	@Override
	public String brindarDetalles() {

		String detallesDelEmpleado = "Detalles del Gerente...";
		return detallesDelEmpleado;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nSu cochera es la numero: "+this.cochera+"\nTrabaja en el departamento de:"+this.departamento;
	}
	
	
}
