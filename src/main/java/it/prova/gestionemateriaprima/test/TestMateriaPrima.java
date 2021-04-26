package it.prova.gestionemateriaprima.test;

import it.prova.gestionemateriaprima.model.MateriaPrima;
import it.prova.gestionemateriaprima.service.ILavorazioneService;
import it.prova.gestionemateriaprima.service.IMateriaPrimaService;
import it.prova.gestionemateriaprima.spring.MyServiceFactory;

public class TestMateriaPrima {

	public static void main(String[] args) {
		IMateriaPrimaService materiaPrimaService = MyServiceFactory.getMateriaPrimaService();
		ILavorazioneService lavorazioneService = MyServiceFactory.getLavorazioneService();
		
		MateriaPrima materiaItem = materiaPrimaService.caricaElemento(1L);
		lavorazioneService.inviaInLavorazione(materiaItem);
	}

}
