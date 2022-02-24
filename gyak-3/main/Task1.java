package main;

import java.util.Scanner;

class Ertek {
	public int x;
	public int y;
}

public class Task1 {

	
	public static void main(String[] args) {
		int[][] tomb = {{1,22,33},{44,45,62},{14,23,43}};
		Ertek a;
		writeOut(tomb);
		System.out.println();
		a = type();
		search(tomb, a);
		
	}
	
	static void writeOut(int[][] tomb) {
		for (int i = 0; i < tomb.length; i++) {
			for (int j = 0; j < tomb[i].length; j++) {
				
				System.out.println("A tomb " + (i+1) + ". sorának " + (j+1) + ". eleme: " + tomb[i][j]);
			}
			System.out.println();
		}
	
	}
	
	static void search(int[][] tomb, Ertek a) {
		for (int i = 0; i < tomb.length; i++) {
			for (int j = 0; j < tomb[i].length; j++) {
				if ((i == a.x) && (j == a.y)) {
					System.out.println("A tomb keresett " + (i+1) + ". sorának " + (j+1) + ". eleme: " + tomb[i][j]);					
				}

			}
		}
	}
	
	static Ertek type() {
		Scanner input = new Scanner(System.in);
		int n = 0;
		int m = 0;
		do {
			System.out.println("Adja meg a sorszámot (1-3)");
			while (!input.hasNextInt()) {
				System.out.println("Ez nem egy szám.");
				input.next();
			}
			n = input.nextInt();
		} while (n<1 || n>3);
		
		do {
			System.out.println("Adja meg az oszlop számot (1-3)");
			while (!input.hasNextInt()) {
				System.out.println("Ez nem egy szám.");
				input.next();
			}
			m = input.nextInt();
		} while (m<1 || m>3);
		
		Ertek x = new Ertek();
		x.x = (n-1);
		x.y = (m-1);
		return x;
	}
}
