package ex3;

import java.util.List;

public class SavaneAfricaine {

	private List<String> savaneAfricaine;
	private final int KILOSNOURRITURE = 10;
	
	public void addAnimal(String typeAnimal, String nomAnimal, String comportement) {
		savaneAfricaine.add(typeAnimal);
		savaneAfricaine.add(nomAnimal);
		savaneAfricaine.add(comportement);
	}
	
	public void afficherListeAnimaux(){
		for (String nom: savaneAfricaine){
			System.out.println(nom);
		}
	}
	
	public int compterAnimaux(){
		return savaneAfricaine.size();
	}
	
	public int calculerKgsNourritureParJour(){
		return savaneAfricaine.size() * KILOSNOURRITURE;
	}
}
