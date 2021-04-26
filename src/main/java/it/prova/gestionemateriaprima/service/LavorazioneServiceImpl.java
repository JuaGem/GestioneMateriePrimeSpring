package it.prova.gestionemateriaprima.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.prova.gestionemateriaprima.dao.MateriaPrimaDAO;
import it.prova.gestionemateriaprima.model.MateriaPrima;
import it.prova.gestionemateriaprima.model.Stato;

@Service
public class LavorazioneServiceImpl implements ILavorazioneService {
	
	@Autowired
	private IAssemblaggioService assemblaggioService;
	
	@Autowired
	private IMessaInOperaService messaInOperaService;
	
	@Autowired
	private IVerniciaturaService verniciaturaService;
	
	@Autowired
	private MateriaPrimaDAO materiaDAO;
	
	@Override
	public void inviaInLavorazione(MateriaPrima materiaInput) {
		
		
			System.out.println("Inizio lavorazione materia prima........................");
			System.out.println("************************************");
			materiaInput.setStatoMateriaPrima(Stato.IN_LAVORAZIONE);
				System.out.println("Inizio esame del candidato: "+materiaInput);
				assemblaggioService.assemblaggio(materiaInput);
				verniciaturaService.verniciatura(materiaInput);
				messaInOperaService.messaInOpera(materiaInput);
				materiaInput.setStatoMateriaPrima(Stato.PRONTO);
				System.out.println("Termine esame del candidato: "+materiaInput);
				System.out.println("************************************");
			
			System.out.println("************************************");
			System.out.println("Termine lavorazione materia prima........................");
			
		
	}

	public IAssemblaggioService getAssemblaggioService() {
		return assemblaggioService;
	}

	public void setAssemblaggioService(IAssemblaggioService assemblaggioService) {
		this.assemblaggioService = assemblaggioService;
	}

	public IMessaInOperaService getMessaInOperaService() {
		return messaInOperaService;
	}

	public void setMessaInOperaService(IMessaInOperaService messaInOperaService) {
		this.messaInOperaService = messaInOperaService;
	}

	public IVerniciaturaService getVerniciaturaService() {
		return verniciaturaService;
	}

	public void setVerniciaturaService(IVerniciaturaService verniciaturaService) {
		this.verniciaturaService = verniciaturaService;
	}

	public MateriaPrimaDAO getMateriaDAO() {
		return materiaDAO;
	}

	public void setMateriaDAO(MateriaPrimaDAO materiaDAO) {
		this.materiaDAO = materiaDAO;
	}

}
