package ar.edu.unlam;


public class Empleado {
	protected String nombre;
	protected Double salario;
	protected String cumpleaño;
	
	public Empleado(String nombre, Double salario, String cumpleaño) {
		super();
		this.nombre = nombre;
		this.salario = salario;
		this.cumpleaño = cumpleaño;
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
	public String getCumpleaño() {
		return cumpleaño;
	}
	public void setCumpleaño(String cumpleaño) {
		this.cumpleaño = cumpleaño;
	}
	public String brindarDetalles(){
		String detallesDelEmpleado = "Detalles...";
		return detallesDelEmpleado;
	}
	@Override
	public String toString() {
		return "\nNombre del Empleado: "+this.nombre+"\nSalario del mismo: "+this.salario+
		"\nNacio en: "+this.cumpleaño;
	}

}
