package ex3;

/** represente une zone carnivore*/

public class ZoneCarnivore extends Zone {

	/**Retourne le poids consommé par un animal */

	@Override
	public double getPoids() {
		// TODO Auto-generated method stub
		return 10;
	}
	/** Regarde si un animal est ajoutable dans la zone selon des criteres */

	@Override
	public boolean ajoutable(Animal unAnimal) {

		if(unAnimal.getType().equals(Type.MAMMIFERE) && unAnimal.getComportement().equals(Regime.CARNIVORE)){
			return true;
		}
		return false;
	}
}
