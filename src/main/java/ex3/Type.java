package ex3;

public enum Type {
	
	MAMMIFERE("MAMMIFERE"),
	POISSON("POISSON"),
	REPTILE("REPTILE");
	
	private String type;

	
	private Type(String type) {
	
		this.setType(type);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	

}
