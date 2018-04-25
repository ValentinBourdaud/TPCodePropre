package ex3;

import java.util.List;

public class ZoneCarnivore {

	private List<String> carnivores;
	public final int KILOSNOURRITURE=10;
	
	public void addAnimal(String typeAnimal, String nomAnimal, String comportement) {
		carnivores.add(typeAnimal);
		carnivores.add(nomAnimal);
		carnivores.add(comportement);
	}
	
	public void afficherListeAnimaux(){
		for (String nom: carnivores){
			System.out.println(nom);
		}
	}
	
	public double calculerKgsNourritureParJour(){
		return carnivores.size() * KILOSNOURRITURE;
	}
}
