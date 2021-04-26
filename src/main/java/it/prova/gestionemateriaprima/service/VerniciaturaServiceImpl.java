package it.prova.gestionemateriaprima.service;

import org.springframework.stereotype.Service;

import it.prova.gestionemateriaprima.model.MateriaPrima;
import it.prova.gestionemateriaprima.model.Stato;

@Service
public class VerniciaturaServiceImpl implements IVerniciaturaService{
	
	public void verniciatura(MateriaPrima materiaInput) {
		aggiornaVerniciatura(materiaInput);
		System.out.println("Verniciatura della materia prima:"+materiaInput);
	}
	
	public void aggiornaVerniciatura(MateriaPrima materiaInput) {
		materiaInput.setStatoMateriaPrima(Stato.IN_VERNICIATURA);
	}

}
