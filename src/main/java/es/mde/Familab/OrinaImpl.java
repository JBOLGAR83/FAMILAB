package es.mde.Familab;

public class OrinaImpl extends Analitica implements Orina {

	private PuntoEntrega puntoDeEntrega;
	private Float densidad;
	private Float ph;

	public PuntoEntrega getPuntoDeEntrega() {
		return puntoDeEntrega;
	}

	public void setPuntoDeEntrega(PuntoEntrega puntoDeEntrega) {
		this.puntoDeEntrega = puntoDeEntrega;
	}

	public Float getDensidad() {
		return densidad;
	}

	public void setDensidad(Float densidad) {
		this.densidad = densidad;
	}

	public Float getPh() {
		return ph;
	}

	public void setPh(Float ph) {
		this.ph = ph;
	}

	@Override
	public String addPuntoEntregaMuestra(PuntoEntrega puntoEntrega) {
		setPuntoDeEntrega(puntoEntrega);
		return "Entregado en: " + getPuntoDeEntrega();
	}
	
	

}
