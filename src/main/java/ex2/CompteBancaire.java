package ex2;

/** Représente un compte bancaire 
 * @author DIGINAMIC
 */
public abstract class CompteBancaire {

	/** solde : solde du compte */
	private double solde;

	/**
	 * @param solde
	 */
	public CompteBancaire(double solde) {
	
		this.solde = solde;
	
	}
	
	/** Ajoute un montant au solde
	 * @param montant
	 */
	
	public void ajouterMontant(double montant){
		this.solde += montant;
	}
	
	/** Soustrait un montant au solde
	 * @param montant
	 */
	public abstract void debiterMontant(double montant);
	
	
	/**Getter
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}

	/**Setter
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	

	
	
	
}
