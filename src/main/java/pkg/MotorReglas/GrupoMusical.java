package pkg.MotorReglas;

import java.util.List;

public class GrupoMusical {
	private List<Miembro> miembros;
	private String nombre;
	private String genero;
	private int conciertosRealizados;
	private int calificacionMedia;
	
	public GrupoMusical(List<Miembro> miembros, String nombre, String genero, int conciertosRealizados, int calificacionMedia) {
		super();
		this.miembros = miembros;
		this.nombre = nombre;
		this.genero = genero;
		this.conciertosRealizados = conciertosRealizados;
		this.calificacionMedia = calificacionMedia;
	}

	public List<Miembro> getMiembros() {
		return miembros;
	}
	
	public void setMiembros(List<Miembro> miembros) {
		this.miembros = miembros;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public int getConciertosRealizados() {
		return conciertosRealizados;
	}
	
	public void setConciertosRealizados(int conciertosRealizados) {
		this.conciertosRealizados = conciertosRealizados;
	}
	
	public int getCalificacionMedia() {
		return calificacionMedia;
	}
	
	public void setCalificacionMedia(int calificacionMedia) {
		this.calificacionMedia = calificacionMedia;
	}
	
	public void addMiembro(Miembro miembro) {
		this.miembros.add(miembro);
	}
	
	public int getCantidadMiembros() {
		return this.miembros.size();
	}
}
