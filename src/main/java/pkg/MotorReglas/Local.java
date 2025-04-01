package pkg.MotorReglas;

public class Local {
	private String nombre;
	private boolean licencia;
	private int eventosRealizados;
	
	public Local(String nombre, boolean licencia, int eventosRealizados) {
		this.nombre = nombre;
		this.licencia = licencia;
		this.eventosRealizados = eventosRealizados;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public boolean isLicencia() {
		return licencia;
	}
	
	public void setLicencia(boolean licencia) {
		this.licencia = licencia;
	}
	
	public int getEventosRealizados() {
		return eventosRealizados;
	}
	
	public void setEventosRealizados(int eventosRealizados) {
		this.eventosRealizados = eventosRealizados;
	}
	
}
