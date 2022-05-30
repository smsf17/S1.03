package N1exercici1SamayoaconArray;

public class Month {
	
	private String name;

	public Month(String name) {
		
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return " - " + name;
	}

}
