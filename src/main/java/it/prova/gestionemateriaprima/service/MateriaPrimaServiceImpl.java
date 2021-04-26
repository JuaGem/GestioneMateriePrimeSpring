package it.prova.gestionemateriaprima.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.prova.gestionemateriaprima.dao.MateriaPrimaDAO;
import it.prova.gestionemateriaprima.model.MateriaPrima;

@Service
public class MateriaPrimaServiceImpl implements IMateriaPrimaService {
	
	@Autowired
	private MateriaPrimaDAO materiaDAO;
	
	@Override
	public void materiaPrima(MateriaPrima materiaInput) {
		System.out.println("La materia prima è: "+materiaInput);
	}
	
	@Override
	public void aggiorna(MateriaPrima materiaInput) {
		 materiaDAO.updateStato(materiaInput);
	}
	
	@Override
	public MateriaPrima caricaElemento(Long id) {
		return materiaDAO.get(id);
	}

}
