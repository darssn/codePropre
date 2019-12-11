package ex3;

public enum Regime {
	
	HERBIVORE("HERBIVORE"),
	CARNIVORE("CARNIVORE");
	
	
	private String nomRegime;
	
	
	private Regime(String a){
		this.setNomRegime(a);
	}


	public String getNomRegime() {
		return nomRegime;
	}


	public void setNomRegime(String nomRegime) {
		this.nomRegime = nomRegime;
	}
	
	

}
