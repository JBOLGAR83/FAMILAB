package es.mde.Familab;

import java.time.LocalDate;

public abstract class Analitica {
	
	private Long id;
	private LocalDate fechaMuestra;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDate getFechaMuestra() {
		return fechaMuestra;
	}
	public void setFechaMuestra(LocalDate fechaMuestra) {
		this.fechaMuestra = fechaMuestra;
	}
	
	

}
