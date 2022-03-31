package myPackage;

public class Rectangle extends Prism {
	private double a;
	private double b;
	
	public Rectangle(double a, double b, int height) {
		super(height);
		this.a = a;
		this.b = b;
	}
	
	@Override
	public double getBase() {
		return a * b;
	}

	@Override
	public String toString() {
		return "Rectangle [a=" + a + ", b=" + b + ", getBase()=" + getBase() + ", getVolume()=" + getVolume()
				+ ", getHeight()=" + getHeight() + "]";
	}
	
	
}
