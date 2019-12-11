package ex2;
/** Représente un compte bancaire de type compte courante 
 * @author DIGINAMIC
 */
public class CompteCourant extends CompteBancaire {
	
	/** decouvert : un découvert est autorisé seulement pour les comptes courants */
	private double decouvert;
	

	public CompteCourant(double solde, double decouvert) {
		super(solde);
		this.decouvert = decouvert;
		// TODO Auto-generated constructor stub
	}
	
	
	/** Soustrait un montant au solde si le resultat est superieur a la variable decouvert
	 * @param montant
	 */

	@Override
	public void debiterMontant(double montant) {
		
		if (this.getSolde() - montant > this.decouvert){
			
			this.setSolde(this.getSolde() - montant);
		}	
		
	}
	/**Getter
	 * @return the decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}
	/**Setter
	 * @param decouvert the decouvert to set
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

}
