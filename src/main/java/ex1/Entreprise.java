package ex1;

import java.util.Date;

/**
 * Classe d'une entreprise
 * 
 */

public class Entreprise {

	/** siret : le numero siret de l'entreprise*/
	private int siret;
	/** nom : le nom l'entreprise*/
	private String nom;
	/** adresse : l'adresse de l'entreprise*/
	private String adresse;
	/**dateCreation :  la date de creation de l'entreprise*/
	private Date dateCreation;
	
	/** capitalMax : le capital max de l'entreprise */
	public static final int capitalMax = 3000000;
	
	
	/**
	 * Affiche le statut
	 * 
	 */
	
	public void afficherStatut(){
		
		
	}


	/**Getter
	 * @return the siret
	 */
	public int getSiret() {
		return siret;
	}


	/**Setter
	 * @param siret the siret to set
	 */
	public void setSiret(int siret) {
		this.siret = siret;
	}


	/**Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}


	/**Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}


	/**Getter
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}


	/**Setter
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	/**Getter
	 * @return the dateCreation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}


	/**Setter
	 * @param dateCreation the dateCreation to set
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}


	
	
}
