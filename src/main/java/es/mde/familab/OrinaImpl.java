package es.mde.familab;

import java.time.LocalDate;

public class OrinaImpl extends Analitica {

	private float densidad;
	private float ph;

	public float getDensidad() {
		return densidad;
	}

	public float getPh() {
		return ph;
	}

	public void setDensidad(float densidad) {
		this.densidad = densidad;
	}

	public void setPh(float ph) {
		this.ph = ph;
	}

	public OrinaImpl() {};

	public OrinaImpl(LocalDate fechaMuestra, float densidad, float ph) {
		super(fechaMuestra);
		this.densidad = densidad;
		this.ph = ph;
	}
	@Override
	public String toString() {
		return "Analítica de Sangre: FECHA MUESTRA: " + getFechaMuestra()+ " DENSIDAD = " + getDensidad() + " PH = "+ getPh();
	}

}
