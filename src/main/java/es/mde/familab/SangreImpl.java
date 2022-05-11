package es.mde.familab;

import java.time.LocalDate;

public class SangreImpl extends Analitica {

	private float colesterol;
	private float urea;

	public float getUrea() {
		return this.urea;
	}

	public float getColesterol() {
		return this.colesterol;
	}

	public void setColesterol(float colesterol) {

	}

	public void setUrea(float urea) {

	}

	public SangreImpl() {
	};

	public SangreImpl(LocalDate fechaMuestra, float colesterol, float urea) {
		super(fechaMuestra);
		this.colesterol = colesterol;
		this.urea = urea;

	}

	@Override
	public String toString() {
		return "Analítica de Sangre: FECHA MUESTRA: " + getFechaMuestra()+ " COLESTEROL = " + getColesterol() + " UREA = "+ getUrea();
	}
	

}