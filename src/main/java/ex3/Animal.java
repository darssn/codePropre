package ex3;



public class Animal {
	
	/** type : type de l'animal */
	private Type type;
	/** nom : nom de l'animal */
	private String nom;
	/** comportement : comportement de l'animal */
	private Regime comportement;
	
	
	/** Constructeur d'un animal
	 * @param type
	 * @param nom
	 * @param comportement
	 */
	public Animal(String nom,Type type,Regime comportement) {
		this.type = type;
		this.nom = nom;
		this.comportement = comportement;
	}


	/**Getter
	 * @return the type
	 */
	public Type getType() {
		return this.type;
	}


	/**Setter
	 * @param type the type to set
	 */
	public void setType(Type type) {
		this.type = type;
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
	 * @return the comportement
	 */
	public Regime getComportement() {
		return comportement;
	}


	/**Setter
	 * @param comportement the comportement to set
	 */
	public void setComportement(Regime comportement) {
		this.comportement = comportement;
	}
	

}
