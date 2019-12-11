package ex3;

/**Represente un aquarium */

public class Aquarium extends Zone{

	

	/**Retourne le poids consommé par un animal */

	@Override
	public double getPoids() {
		// TODO Auto-generated method stub
		return 0.2;
	}
	/** Regarde si un animal est ajoutable dans la zone selon des criteres */

	@Override
	public boolean ajoutable(Animal unAnimal) {
		
		if(unAnimal.getType().equals(Type.POISSON)){
			return true;
		}
		return false;
	}
	
	
}
