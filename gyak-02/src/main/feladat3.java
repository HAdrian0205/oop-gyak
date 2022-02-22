package main;

public class feladat3 {

	public static void main(String[] args) {
		int[] tomb = {15, 13, 2, 28, 31, 32, 41, 23, 9, 12};
		double avg;
		int min;
		boolean result;
		//1. feladat
		writeOut(tomb);
		System.out.println("");
		//2. feladat
		writeOutBackwards(tomb);
		//3. feladat
		avg = average(tomb);
		System.out.println("");
		System.out.println("A páros elemek átlaga: " + avg);
		//4. feladat
		min = minimum(tomb);
		System.out.println("");
		System.out.println("A tömb legkisebb eleme (minimuma): " + min);
		//5. feladat
		System.out.println("");
		result = monCres(tomb);
		if (result) {
			System.out.println("A tömb monoton növekvõ.");
		} else {
			System.out.println("A tömb nem monoton növekvõ.");
		}
		//6. feladat
		System.out.println("");
		System.out.println("Növekvõ sorrendre rendezve:");
		sort(tomb);
		for (int i = 0; i < tomb.length; i++) {
			System.out.println("A tömb " + (i+1) + ". eleme: " + tomb[i]);
		}
		
	}
	
	static void writeOut(int[] tomb) {
		for (int i = 0; i < tomb.length; i++) {
			System.out.println("A tömb " + (i+1) + ". eleme: " + tomb[i]);
		}
	}
	
	static void writeOutBackwards(int[] tomb) {
		for (int i = tomb.length-1; i >= 0; i--) {
			System.out.println("A tömb " + (i+1) + ". eleme: " + tomb[i]);
		}
	}
	
	static double average(int[] tomb) {
		double avg;
		int sum = 0;
		int div = 0;
		for (int i = 0; i < tomb.length; i++) {
			if (tomb[i] % 2 == 0) {
				sum += tomb[i];
				div++;
			}
		}
		avg = (double)(sum/div);
		return avg;
	}
	
	static int minimum(int[] tomb) {
		int min = 50;
		for (int i = 0; i < tomb.length; i++) {
			if (min > tomb[i]) {
				min = tomb[i];
			}
		}
		return min;
	}
	
	static boolean monCres(int[] tomb) {
		boolean cres = true;
		for (int i = 1; i < tomb.length; i++) {
			if (tomb[i] < tomb[i-1]) {
				cres = false;
			}
		}
		return cres;
	}
	
	static void sort(int[] tomb) {
		int replace;
		
		for (int i = 0; i < tomb.length; i++) {
			for (int j = i+1; j < tomb.length; j++) {
				if (tomb[j] < tomb[i]) {
					replace = tomb[i];
					tomb[i] = tomb[j];
					tomb[j] = replace;
				}
			}
		}
	}
}
