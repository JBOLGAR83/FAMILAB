package es.mde.familab;

import java.time.LocalDate;

public abstract class Analitica {

	private Long id;
	private LocalDate fechaMuestra;

	public Long getId() {
		return id;
	}

	public LocalDate getFechaMuestra() {
		return fechaMuestra;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setFechaMuestra(LocalDate fechaMuestra) {
		this.fechaMuestra = fechaMuestra;
	}

	public Analitica() {
	}

	public Analitica(Long id, LocalDate fechaMuestra) {
		super();
		this.id = id;
		this.fechaMuestra = fechaMuestra;
	}

}
