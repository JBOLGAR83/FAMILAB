package es.mde.Familab;

public class SangreImpl extends Analitica implements Sangre {

	private Sala_Extraccion sala_Extraccion;
	private Float colesterol;
	private Float urea;

	public Sala_Extraccion getSala_Extraccion() {
		return sala_Extraccion;
	}

	public void setSala_Extraccion(Sala_Extraccion sala_Extraccion) {
		this.sala_Extraccion = sala_Extraccion;
	}

	public Float getColesterol() {
		return colesterol;
	}

	public void setColesterol(Float colesterol) {
		this.colesterol = colesterol;
	}

	public Float getUrea() {
		return urea;
	}

	public void setUrea(Float urea) {
		this.urea = urea;
	}

	@Override
	public String addSalaExtraccionSangre(Sala_Extraccion sala_Extraccion) {
		setSala_Extraccion(sala_Extraccion);
		return "Lugar de la extraccion: " + sala_Extraccion;
	}

}
