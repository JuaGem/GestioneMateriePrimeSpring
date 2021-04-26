package it.prova.gestionemateriaprima.dao;

import java.util.ArrayList;
import java.util.List;

import it.prova.gestionemateriaprima.model.MateriaPrima;
import it.prova.gestionemateriaprima.model.Stato;

public class Db_Mock {
	
	public static List<MateriaPrima> materiePrime =  new ArrayList<>();
	
	static {
		MateriaPrima materia1 = new MateriaPrima(1L,"Sabbia",Stato.IN_INSERIMENTO);
		MateriaPrima materia2 = new MateriaPrima(2L,"Oro",Stato.IN_INSERIMENTO);
		MateriaPrima materia3 = new MateriaPrima(3L,"Rame",Stato.IN_INSERIMENTO);
		MateriaPrima materia4 = new MateriaPrima(4L,"Legno",Stato.IN_INSERIMENTO);
		MateriaPrima materia5 = new MateriaPrima(5L,"Accaio",Stato.IN_INSERIMENTO);
		materiePrime.add(materia5);
		materiePrime.add(materia4);
		materiePrime.add(materia3);
		materiePrime.add(materia2);
		materiePrime.add(materia1);
	}

}
