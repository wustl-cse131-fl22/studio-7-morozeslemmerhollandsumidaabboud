package studio7;

import edu.princeton.cs.introcs.StdDraw;


public class Rectangle {

	//instance variables
	
	private double length = 0;
	private double height = 0;

	// constructor
	
	public Rectangle(double a, double b) {
		this.length = a;
		this.height = b;
	}
	
	// mutators
	
	public void setLength (double a) {
		this.length = a;
	}
	
	public void setHeight(double b) {
		this.height = b;
	}
	
	public double area () {
	return this.length*this.height;
	}
	
	public double getLength () {
		return this.length;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		

		Rectangle example = new Rectangle (0.4,0.7);
		StdDraw.filledRectangle(.5, .5, example.getLength()/2, example.getHeight()/2);
		
	}

}
