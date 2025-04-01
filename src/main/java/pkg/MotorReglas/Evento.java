package pkg.MotorReglas;

public class Evento {
	private GrupoMusical grupoMusical;
	private Local local;
	private boolean terminado;
	private int califLocaltoGroup;
	private int califGroupToLocal;
	private boolean incumplimientoContrato;
	
	public Evento(GrupoMusical grupoMusical, Local local, boolean terminado, int califLocaltoGroup,
			int califGroupToLocal, boolean incumplimientoContrato) {
		this.grupoMusical = grupoMusical;
		this.local = local;
		this.terminado = terminado;
		this.califLocaltoGroup = califLocaltoGroup;
		this.califGroupToLocal = califGroupToLocal;
		this.incumplimientoContrato = incumplimientoContrato;
	}

	public boolean isTerminado() {
		return terminado;
	}
	
	public void setTerminado(boolean terminado) {
		this.terminado = terminado;
	}
	
	public int getCalifLocaltoGroup() {
		return califLocaltoGroup;
	}
	
	public void setCalifLocaltoGroup(int califLocaltoGroup) {
		this.califLocaltoGroup = califLocaltoGroup;
	}
	
	public int getCalifGroupToLocal() {
		return califGroupToLocal;
	}
	
	public void setCalifGroupToLocal(int califGroupToLocal) {
		this.califGroupToLocal = califGroupToLocal;
	}
	
	public GrupoMusical getGrupoMusical() {
		return grupoMusical;
	}
	
	public void setGrupoMusical(GrupoMusical grupoMusical) {
		this.grupoMusical = grupoMusical;
	}
	
	public Local getLocal() {
		return local;
	}
	
	public void setLocal(Local local) {
		this.local = local;
	}
	
	public boolean isIncumplimientoContrato() {
		return incumplimientoContrato;
	}
	
	public void setIncumplimientoContrato(boolean incumplimientoContrato) {
		this.incumplimientoContrato = incumplimientoContrato;
	}
	
}
