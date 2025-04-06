package pkg.MotorReglas;

public class Miembro {
	private String nombre;
	private String apellido;
	private int edad;
	private boolean aprobacion;

	public Miembro(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		if (edad >= 18)
			this.aprobacion = true;
		else
			this.aprobacion = false;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isAprobacion() {
		return aprobacion;
	}

	public void setAprobacion(boolean aprobacion) {
		this.aprobacion = aprobacion;
	}
		
}
