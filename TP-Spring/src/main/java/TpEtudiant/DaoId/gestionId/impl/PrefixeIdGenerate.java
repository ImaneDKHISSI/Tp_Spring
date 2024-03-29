package TpEtudiant.DaoId.gestionId.impl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import TpEtudiant.Etudiant;
import TpEtudiant.DaoId.gestionId.IdGenerate;

@Component
public class PrefixeIdGenerate implements IdGenerate {
	private Etudiant etudiant;
	private String prefixe;
	private String id;
	//public String result;
	 public PrefixeIdGenerate(Etudiant etudiant) {
	        this.etudiant = etudiant;
	    }
	public String genId() {
		id=String.valueOf(etudiant.getId());
		prefixe=etudiant.getNom();
		return prefixe+id;
		
	}

}
