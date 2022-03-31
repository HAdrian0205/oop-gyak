package myPackage;

public abstract class Prism {
	private int height;
	
	public abstract double getBase();
	
	public double getVolume() {
		return this.getBase() * height;
	}
	
	public Prism(int height) {
		super();
		this.height = height;
	}
	
	public boolean isLarger(Prism other) {
		return this.getVolume() > other.getVolume();
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
}
