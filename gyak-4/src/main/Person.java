package main;

public class Person {
	
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWheight() {
		return wheight;
	}

	public void setWheight(int wheight) {
		this.wheight = wheight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	private int wheight;
	private double height;
	
	double index() {
		double ret = wheight/(height*height);
		return ret;
	}
	
	String shape() {
		String alkat;
		if (index() < 18.5) {
			alkat = "Sov�ny";
		} else if(index() > 25) {
			alkat = "K�v�r";
		} else {
			alkat = "Norm�l";
		}
		return alkat;
	}
	
	@Override
	public String toString() {
		return "N�v: " + name + " S�ly: " + wheight + "kg" + " Magass�g: " + height + "m" + " TTI: " + shape();
	}
	
}
