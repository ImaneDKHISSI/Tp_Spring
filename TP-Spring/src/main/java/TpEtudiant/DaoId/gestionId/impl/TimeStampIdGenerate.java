package TpEtudiant.DaoId.gestionId.impl;

import java.security.Timestamp;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import TpEtudiant.Etudiant;
import TpEtudiant.DaoId.gestionId.IdGenerate;

@Component
public class TimeStampIdGenerate implements IdGenerate {
	
	 private static List<Etudiant> etudiants = new ArrayList<>();
	 	@Override
		public String genId() {
	 		return  String.valueOf(System.currentTimeMillis() % Integer.MAX_VALUE);
    }
	 	 public static void enregistrerEtudiant(String nom, String prenom) {
	       
	 		LocalDate date = LocalDate.now();    
	         Etudiant etudiant = new Etudiant(nom, prenom, date);
	         etudiants.add(etudiant);

	         System.out.println("Étudiant est enregistré !");
	     }
	
}
