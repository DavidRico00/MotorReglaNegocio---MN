package pkg.MotorReglas;

public class Evento {
	private GrupoMusical grupoMusical;
	private Local local;
	private boolean terminado, modificacion, notificado, incumplimientoContrato, acuerdoConfirmado;
	private int califLocaltoGroup , califGroupToLocal;
	private float precioNegociado;
	
	public Evento() {
		this.grupoMusical = null;
		this.local = null;
		this.terminado = false;
		this.califLocaltoGroup = -1;
		this.califGroupToLocal = -1;
		this.incumplimientoContrato = false;
		this.modificacion = false;
		this.notificado = false;
		this.precioNegociado = 0.0f;
		this.acuerdoConfirmado = false;
	}
		
	public Evento(GrupoMusical grupoMusical, Local local) {
		this.grupoMusical = grupoMusical;
		this.local = local;
		this.terminado = false;
		this.califLocaltoGroup = -1;
		this.califGroupToLocal = -1;
		this.incumplimientoContrato = false;
		this.modificacion = false;
		this.notificado = false;
		this.precioNegociado = 0.0f;
		this.acuerdoConfirmado = false;
	}
	
	public Evento(GrupoMusical grupoMusical, Local local, boolean terminado, int califLocaltoGroup,
			int califGroupToLocal, boolean incumplimientoContrato, boolean modificacion, boolean notificado,
			float tarifa, boolean acuerdoConfirmado) {
		this.grupoMusical = grupoMusical;
		this.local = local;
		this.terminado = terminado;
		this.califLocaltoGroup = califLocaltoGroup;
		this.califGroupToLocal = califGroupToLocal;
		this.incumplimientoContrato = incumplimientoContrato;
		this.modificacion = modificacion;
		this.notificado = notificado;
		this.precioNegociado = tarifa;
		this.acuerdoConfirmado = acuerdoConfirmado;
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
	
	public boolean isModificacion() {
		return modificacion;
	}
	
	public void setModificacion(boolean modificacion) {
		this.modificacion = modificacion;
	}
	
	public boolean isNotificado() {
		return notificado;
	}
	
	public void setNotificado(boolean notificado) {
		this.notificado = notificado;
	}
	
	public float getPrecioNegociado() {
		return precioNegociado;
	}
	
	public void setPrecioNegociado(float tarifa) {
		this.precioNegociado = tarifa;
	}
	
	public boolean isAcuerdoConfirmado() {
		return acuerdoConfirmado;
	}
	
	public void setAcuerdoConfirmado(boolean acuerdoConfirmado) {
		this.acuerdoConfirmado = acuerdoConfirmado;
	}
}
