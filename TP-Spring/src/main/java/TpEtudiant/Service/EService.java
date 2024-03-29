package TpEtudiant.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import TpEtudiant.Etudiant;
@Service
public class EService {
	private List<Etudiant> listeEtds;

    public EService() {
        this.listeEtds = new ArrayList<>();
    }

    public void ajouter(Etudiant etd) {
        listeEtds.add(etd);
    }

    public List<Etudiant> getListeEtds() {
        return listeEtds;
    }

    public void setListeEtds(List<Etudiant> listeEtds) {
        this.listeEtds = listeEtds;
    }

}
