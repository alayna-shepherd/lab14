package lab14;

public abstract class Player {

	private String name;

	public String getName() {
		return name;
	}
	
	public abstract void getRoshambo();

	public void setName(String name) {
		this.name = name;
	}
	
}
