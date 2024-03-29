package TpEtudiant.DaoId.Dao.impl;


import org.springframework.stereotype.Service;

import TpEtudiant.Etudiant;
import TpEtudiant.DaoId.Dao.EDao;
@Service
public class MemoireEdao implements EDao {
	public void persister(Etudiant e) {
		System.out.println("ajout d'etudiant avec Memoire");
	}

}
