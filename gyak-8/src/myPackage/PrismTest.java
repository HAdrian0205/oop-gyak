package myPackage;

import managers.PrismManager;

public class PrismTest {

	public static void main(String[] args) {
		PrismManager pm = new PrismManager(5);
		pm.setPrism(0, new Cylinder(4,4));
		pm.setPrism(2, new Cylinder(3,6));
		pm.setPrism(4, new Rectangle(4, 4, 4));
		System.out.println("Instances in manager: " + pm.getPrismInstanceCount());
		System.out.println("Average volume: " + pm.getAverageVolume());
		System.out.println("Cylinders in manager: " + pm.countCylinders());
		System.out.println(pm);
	}
}
