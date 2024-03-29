package TpEtudiant;

import java.sql.Date;
import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class Etudiant {
	
	private int id;
	private String nom;
	private String prenom;
	private LocalDate DateCreation;
	
	public int getId() 
	{
		return this.id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public String getNom() 
	{
		return this.nom;
	}
	public void setNom(String prenom)
	{
		this.prenom=prenom;
	}
	public String getPrenom()
	{
		return this.prenom;
	}
	public void setPrenom(String prenom) {
		this.id=id;
	}
	public LocalDate getDateCreation()
	{
		return this.DateCreation;
	}
	public void setDateCreation(LocalDate DateCreation)
	{
		this.DateCreation=DateCreation;
	}
	
	 public Etudiant(String nom, String prenom, LocalDate DateCreation) {
         this.nom = nom;
         this.prenom = prenom;
         this.DateCreation = DateCreation;
     }

}
