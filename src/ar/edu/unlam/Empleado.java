package ar.edu.unlam;


public class Empleado {
	protected String nombre;
	protected Double salario;
	protected String cumplea�o;
	
	public Empleado(String nombre, Double salario, String cumplea�o) {
		super();
		this.nombre = nombre;
		this.salario = salario;
		this.cumplea�o = cumplea�o;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public String getCumplea�o() {
		return cumplea�o;
	}
	public void setCumplea�o(String cumplea�o) {
		this.cumplea�o = cumplea�o;
	}
	public String brindarDetalles(){
		String detallesDelEmpleado = "Detalles...";
		return detallesDelEmpleado;
	}
	@Override
	public String toString() {
		return "\nNombre del Empleado: "+this.nombre+"\nSalario del mismo: "+this.salario+
		"\nNacio en: "+this.cumplea�o;
	}

}
