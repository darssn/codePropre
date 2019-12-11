package ex3;

import java.util.ArrayList;
import java.util.List;

/**Represente une zone*/
public abstract class Zone {

	/**Liste des animaux present dans la zone*/
	
	private List<Animal> listeAnimal = new ArrayList<Animal>();
	
	/**Ajout d'un animal dans la zone*/
	
	public void addAnimal(Animal unAnimal) {
		this.listeAnimal.add(unAnimal);
		}
	/**Affiche la liste des animaux present dans la zone*/
	
	public void afficherListeAnimaux(){
		for (Animal unAnimal: this.listeAnimal){
			System.out.println(unAnimal.getNom());
		}
	}
	
	/**Compte le nombre d'animal dans une zone */
	
	public int compterAnimaux(){
		return this.listeAnimal.size();
	}
	/**Retourne le poids consommé par un animal*/
	
	public abstract double getPoids();
	
	/**Retourne le poids de nourriture consommé dans la zone par les animaux*/
	
	public double calculerKgsNourritureParJour(){
		return this.compterAnimaux()* getPoids();
	}
	/**Getter
	 * @return the listeAnimal
	 */
	public List<Animal> getListeAnimal() {
		return listeAnimal;
	}
	/**Setter
	 * @param listeAnimal the listeAnimal to set
	 */
	public void setListeAnimal(List<Animal> listeAnimal) {
		this.listeAnimal = listeAnimal;
	}
	
	/** Regarde si un animal est ajoutable dans la zone selon des criteres */
	public abstract boolean ajoutable(Animal unAnimal);
	
	
}
