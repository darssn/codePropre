package ex3;

public class ZooApplication {

	public static void main(String[] args) {
		
		Zoo zoo = new Zoo("Thoiry");
		
		zoo.addAnimal(new Animal("Gazelle", Type.MAMMIFERE, Regime.HERBIVORE));
		zoo.addAnimal(new Animal("Zèbre", Type.MAMMIFERE,  Regime.HERBIVORE));
		zoo.addAnimal(new Animal("Lion", Type.MAMMIFERE,  Regime.HERBIVORE));
		zoo.addAnimal(new Animal("Panthère", Type.MAMMIFERE, Regime.CARNIVORE));
		zoo.addAnimal(new Animal("Requin blanc",Type.POISSON, Regime.HERBIVORE));
		zoo.addAnimal(new Animal("Truite dorée",Type.POISSON, Regime.HERBIVORE));
		zoo.addAnimal(new Animal("Boa constrictor",Type.REPTILE,Regime.CARNIVORE));
		zoo.addAnimal(new Animal("Python",Type.REPTILE,Regime.CARNIVORE));
		
		
		zoo.afficherListeAnimaux();
		
		
		
		
	}
	
	

}
