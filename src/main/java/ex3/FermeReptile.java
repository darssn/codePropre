package ex3;

/** Représente une ferme de reptile
 * @author DIGINAMIC
 */

public class FermeReptile extends Zone {

	
	/**Retourne le poids consommé par un animal*/
	@Override
	public double getPoids() {
		return 0.1;
	}

	/** Regarde si un animal est ajoutable dans la zone selon des criteres */
	@Override
	public boolean ajoutable(Animal unAnimal) {
		
		if(unAnimal.getType().equals(Type.REPTILE)){
			return true;
		}
		return false;
	}
	
	

}
