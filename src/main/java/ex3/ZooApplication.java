package ex3;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");
		
		zoo.addAnimal("Gazelle", "MAMMIFERE", "HERBIVORE");
		zoo.addAnimal("Zebre", "MAMIFERE", "HERBIVORE");
		zoo.addAnimal("Lion", "MAMMIFERE", "HERBIVORE");
		zoo.addAnimal("Panthere", "MAMMIFERE", "CARNIVORE");
		zoo.addAnimal("Requin blanc", "POISSON", "HERBIVORE");
		zoo.addAnimal("Truite doree", "POISSON", "HERBIVORE");
		zoo.addAnimal("Boa constrictor", "SERPENT", "CARNIVORE");
		zoo.addAnimal("Python", "SERPENT", "CARNIVORE");
	}

}
