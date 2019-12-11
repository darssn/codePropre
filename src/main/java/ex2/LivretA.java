package ex2;
/** Représente un compte bancaire de type livret A
 * @author DIGINAMIC
 */
public class LivretA extends CompteBancaire {

	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;

	public LivretA(double solde, double tauxRemuneration) {
		super(solde);
		this.tauxRemuneration = tauxRemuneration;
	}

	/**
	 * Soustrait un montant au solde si le resultat est superieur a 0
	 * 
	 * @param montant
	 */
	@Override
	public void debiterMontant(double montant) {
		if (this.getSolde() - montant > 0) {
			this.setSolde(this.getSolde() - montant);
		}

	}
	
	/** Applique le taux de remuneration au solde annuellement*/

	public void appliquerRemuAnnuelle() {

		double solde = this.getSolde();

		solde = solde + solde * this.tauxRemuneration / 100;

		this.setSolde(solde);

	}

	/**
	 * Getter
	 * 
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * Setter
	 * 
	 * @param tauxRemuneration
	 *            the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

}
