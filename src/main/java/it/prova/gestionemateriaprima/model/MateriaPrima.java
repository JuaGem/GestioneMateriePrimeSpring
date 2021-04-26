package it.prova.gestionemateriaprima.model;

public class MateriaPrima {

	private Long id;
	private String descrizione;
	private Stato statoMateriaPrima;

	public MateriaPrima() {
	}

	public MateriaPrima(Long id,String descrizione, Stato statoMateriaPrima) {
		this.id = id;
		this.descrizione = descrizione;
		this.statoMateriaPrima = statoMateriaPrima;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Stato getStatoMateriaPrima() {
		return statoMateriaPrima;
	}

	public void setStatoMateriaPrima(Stato statoMateriaPrima) {
		this.statoMateriaPrima = statoMateriaPrima;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
