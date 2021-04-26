package it.prova.gestionemateriaprima.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.prova.gestionemateriaprima.model.MateriaPrima;
import it.prova.gestionemateriaprima.model.Stato;

@Service
public class AssemblaggioServiceImpl implements IAssemblaggioService {
	
	@Autowired
	public IMateriaPrimaService materiaService;
	
	public void assemblaggio(MateriaPrima materiaInput) {
	  aggiornaAssemblaggio(materiaInput);
	  System.out.println("Assemblaggio della materia prima:"+materiaInput);
	}
	
	public void aggiornaAssemblaggio(MateriaPrima materiaInput) {
		materiaInput.setStatoMateriaPrima(Stato.IN_ASSEMBLAGGIO);
	}


}
