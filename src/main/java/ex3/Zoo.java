package ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author DIGINAMIC
 */
public class Zoo {

	/** nom : Nom du zoo */

	private String nom;

	/** Liste des zones du zoo */

	private List<Zone> listeZone = new ArrayList<Zone>();

	/**
	 * Constructeur du zoo
	 * 
	 * @param nom
	 */
	public Zoo(String nom) {

		this.nom = nom;

		this.listeZone.add(new SavaneAfricaine());
		this.listeZone.add(new ZoneCarnivore());
		this.listeZone.add(new FermeReptile());
		this.listeZone.add(new Aquarium());

	}

	/**
	 * Ajoute un animal dans une zone du zoo en fonction de parametre de
	 * l'animal
	 * 
	 */

	public void addAnimal(Animal unAnimal) {

		for (Zone zone : this.listeZone) {

			if (zone.ajoutable(unAnimal)) {

				zone.addAnimal(unAnimal);

			}

		}

	}

	/**
	 * Affiche la liste de tout les animaux dans le zoo
	 * 
	 */

	public void afficherListeAnimaux() {

		for (Zone zone : this.listeZone) {
			zone.afficherListeAnimaux();

		}
	}

	/**
	 * Getter for nom
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

}
