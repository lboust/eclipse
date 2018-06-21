package jsf;

public class Tile {

	private int value = 0;
	private String color = "cyan";
	
	//constructor
	public Tile(int value) {
		this.value = value;
	}
	
	//accessors
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getValue() {
		return value;
	}
}
