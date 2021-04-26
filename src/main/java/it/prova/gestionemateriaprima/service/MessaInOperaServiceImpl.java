package it.prova.gestionemateriaprima.service;

import org.springframework.stereotype.Service;

import it.prova.gestionemateriaprima.model.MateriaPrima;
import it.prova.gestionemateriaprima.model.Stato;

@Service
public class MessaInOperaServiceImpl implements IMessaInOperaService {
	
	public void messaInOpera(MateriaPrima materiaInput) {
		System.out.println("Messa in opera della materia prima:"+materiaInput);
	}
	
	public void aggiornaMessaInOpera(MateriaPrima materiaInput) {
		materiaInput.setStatoMateriaPrima(Stato.IN_MESSAINPROVA);
	}

}
