package es.mde.familab;

public class SangreImpl extends Analitica implements Sangre {

	private float colesterol;
	private float urea;

	@Override
	public float getUrea() {
		return this.urea;
	}

	@Override
	public float getColesterol() {
		return this.colesterol;
	}

	@Override
	public void setColesterol(float colesterol) {

	}

	@Override
	public void setUrea(float urea) {

	}

	public SangreImpl() {
	}

	public SangreImpl(float colesterol, float urea) {
		super();
		this.colesterol = colesterol;
		this.urea = urea;

	}

}