package managers;

import myPackage.Prism;

import java.util.Arrays;

import myPackage.Cylinder;

public class PrismManager {
	Prism[] prisms;
	
	public PrismManager(int prismCount) {
		prisms = new Prism[prismCount];
	}
	
	public void setPrism(int index, Prism prism) {
		prisms[index] = prism;
	}
	
	public int getSize() {
		return prisms.length;
	}
	
	public Prism getPrism(int index) {
		return prisms[index];
	}
	
	public int countCylinders() {
		int cnt = 0;
		for(int i = 0; i < prisms.length; i++) {
			if(prisms[i] instanceof Cylinder) {
				cnt++;
			}
		} 
		return cnt;
	}
	
	public int getPrismInstanceCount() {
		int cnt = 0;
		for(int i = 0; i < prisms.length; i++) {
			if(prisms[i] != null) {
				cnt++;
			}
		} 
		return cnt;
	}
	
	public double getAverageVolume() {
		int cnt = 0;
		double volume = 0;
		for(int i = 0; i < prisms.length; i++) {
			if(prisms[i] != null) {
				cnt++;
				volume += prisms[i].getVolume();
			}
		}
		return volume/(double)cnt;
	}

	@Override
	public String toString() {
		return "PrismManager [prisms=" + Arrays.toString(prisms) + "]";
	}
	
	
}
