package it.prova.gestionemateriaprima.dao;

import it.prova.gestionemateriaprima.model.MateriaPrima;

public interface MateriaPrimaDAO {
	
	public MateriaPrima get(Long id);
	
	public void updateStato(MateriaPrima materiaInput);

}
