package myPackage;

public class Cylinder extends Prism {
	double radius;
	
	public Cylinder(double radius, int height) {
		super(height);
		this.radius = radius;
	}
	
	@Override
	public double getBase() {
		return radius *radius * Math.PI;
	}

	@Override
	public String toString() {
		return "Cylinder [radius=" + radius + ", getBase()=" + getBase() + ", getVolume()=" + getVolume()
				+ ", getHeight()=" + getHeight() + "]";
	}
	
	
	
}
