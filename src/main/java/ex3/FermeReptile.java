package ex3;

import java.util.List;

public class FermeReptile {

	private List<String> reptiles;
	private final double KILOSNOURRITURE= 0.1;
	
	public void addAnimal(String typeAnimal, String nomAnimal, String comportement) {
		reptiles.add(typeAnimal);
		reptiles.add(nomAnimal);
		reptiles.add(comportement);
	}
	
	public void afficherListeAnimaux(){
		for (String nom: reptiles){
			System.out.println(nom);
		}
	}
	
	public int compterAnimaux(){
		return reptiles.size();
	}
	
	public double calculerKgsNourritureParJour(){
		return reptiles.size() * KILOSNOURRITURE;
	}
}
