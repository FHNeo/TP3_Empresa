package ar.edu.unlam;

public class Director extends Empleado {
	public Integer cochera;
	public Double extra;
	public Director(String nombre, Double salario, String cumplea�o, Integer cochera, Double extra) {
		super(nombre, salario, cumplea�o);
		this.cochera = cochera;
		this.extra = extra;
		super.salario =salario+extra;
	}
	@Override
	public String brindarDetalles() {
		String detallesDelEmpleado = "Detalles del Director...";
		return detallesDelEmpleado;
		}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nSu cochera es la numero: "+this.cochera;
	}
	
}
