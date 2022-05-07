package es.mde.familab;

public class OrinaImpl extends Analitica implements Orina {

	private float densidad;
	private float ph;

	@Override
	public float getDensidad() {
		return densidad;
	}

	@Override
	public float getPh() {
		return ph;
	}

	@Override
	public void setDensidad(float densidad) {
		this.densidad = densidad;
	}

	@Override
	public void setPh(float ph) {
		this.ph = ph;
	}

	public OrinaImpl() {
	}

	public OrinaImpl(float densidad, float ph) {
		super();
		this.densidad = densidad;
		this.ph = ph;
	}

}

