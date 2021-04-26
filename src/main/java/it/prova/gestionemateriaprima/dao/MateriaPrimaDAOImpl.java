package it.prova.gestionemateriaprima.dao;

import org.springframework.stereotype.Component;

import it.prova.gestionemateriaprima.model.MateriaPrima;

@Component
public class MateriaPrimaDAOImpl implements MateriaPrimaDAO{
	
	@Override
	public MateriaPrima get(Long id) {
		
		for(MateriaPrima materiaItem: Db_Mock.materiePrime)
			if(materiaItem.getId() == id)
				return materiaItem;
		
	 return null;	
	}
	
	@Override
	public void updateStato(MateriaPrima materiaInput) {
		
		for(MateriaPrima materiaItem: Db_Mock.materiePrime) {
			if(materiaItem.getId() == materiaInput.getId()) {
				materiaItem.setDescrizione(materiaInput.getDescrizione());
				materiaItem.setStatoMateriaPrima(materiaInput.getStatoMateriaPrima());
			}
		}
		
	}

}
