package pkg.MotorReglas;

public class Local {
	private String nombre;
	private boolean licencia;
	private int eventosRealizados;
	private float presupuesto;
	
	public Local(String nombre, boolean licencia, int eventosRealizados, float presupuesto) {
		this.nombre = nombre;
		this.licencia = licencia;
		this.eventosRealizados = eventosRealizados;
		this.presupuesto = presupuesto;
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
	
	public float getPresupuesto() {
		return presupuesto;
	}
	
	public void setPresupuesto(float presupuesto) {
		this.presupuesto = presupuesto;
	}
	
}
