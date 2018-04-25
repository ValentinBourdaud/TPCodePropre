package ex3;

import java.util.List;

public class Aquarium {

	private List<String> animaux;
	private final double KILOSNOURRITURE =0.2;
	
	public void addAnimal(String typeAnimal, String nomAnimal, String comportement) {
		animaux.add(typeAnimal);
		animaux.add(nomAnimal);
		animaux.add(comportement);
	}
	
	public void afficherListeAnimaux(){
		for (String nom: animaux){
			System.out.println(nom);
		}
	}
	
	public double calculerKgsNourritureParJour(){
		return animaux.size() * KILOSNOURRITURE;
	}
}
