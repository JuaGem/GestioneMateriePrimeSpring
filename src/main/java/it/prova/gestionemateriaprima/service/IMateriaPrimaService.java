package it.prova.gestionemateriaprima.service;

import it.prova.gestionemateriaprima.model.MateriaPrima;

public interface IMateriaPrimaService {
	
	public void materiaPrima(MateriaPrima materiaInput);
	
	public void aggiorna(MateriaPrima materiaInput);
	
	public MateriaPrima caricaElemento(Long id);
	
}
