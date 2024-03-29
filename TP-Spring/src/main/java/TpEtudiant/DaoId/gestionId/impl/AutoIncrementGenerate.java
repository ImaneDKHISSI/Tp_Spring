package TpEtudiant.DaoId.gestionId.impl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import TpEtudiant.DaoId.gestionId.IdGenerate;

@Component
public class AutoIncrementGenerate implements IdGenerate{
	
	private int id;
	public  AutoIncrementGenerate(int id)
	{
		this.id=id;
	}
	public int getId(int id) 
	{
		return this.id;
	}
	public void setId(int id)
	{
		this.id=0;
	}
	@Override
	public String genId() {
		id=id+1;
		return String.valueOf(id);

	}

}
