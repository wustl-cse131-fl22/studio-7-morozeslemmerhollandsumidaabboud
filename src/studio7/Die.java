package studio7;

public class Die {

	private int sides = 0;
	
	public Die(int sides) {
		this.sides = sides;
	}
	
	public void setSides(int sides) {
		this.sides = sides;
	}
	
	public int getSides() {
		int side = (int)(Math.random()* sides + 1); 
		return side;
	}
	
	public static void main (String[] args) {
		Die example = new Die (6);
		System.out.println(example.getSides());
	}
	
}
