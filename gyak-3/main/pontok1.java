package main;

import java.util.Scanner;

public class pontok1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[][] namesAndEmails = new String[5][];
		int[] number = new int[5];
		int n;

		for (int i = 0; i < 5; i++) {
			System.out.println("Adja meg a(z) " + (i+1) + ". ember nevét: ");
			String nev = input.nextLine();
			n = emailSize();
			number[i] = n;
			namesAndEmails[i] = new String[n+1];
			namesAndEmails[i][0] = nev;
			for (int j = 1; j <= n; j++) {
				System.out.println("Adja meg a(z) " + (i+1) + ". ember " + j + ". email címét: ");
				namesAndEmails[i][j] = input.nextLine();
			}
		}
		
		System.out.println();
		for(int i = 0; i < 5; i++) {
			if (number[i] != 0) {
				System.out.println("Név: " + namesAndEmails[i][0]);
				for (int j = 1; j <= number[i]; j++) {
					System.out.println("	"+ j + ". email cím: " + namesAndEmails[i][j]);
				}
			}
		}
		System.out.println();
		System.out.println("Kinek van több email címe?");
		
		boolean noone = true;
		for (int i = 0; i < 5; i++) {
			if (number[i] == 0) {
				continue;
			} else if (number[i] > 1) {
				System.out.println(namesAndEmails[i][0] + "-nak/nek: " + number[i] + "db");
				noone = false;
			}
		}
		if (noone == true) {
			System.out.println("Senkinek nincs 1-nél több email címe.");
		}
	}
	
	static int emailSize() {
		Scanner input = new Scanner(System.in);
		int n = 0;
		
		do {
			System.out.println("Hány email címet szeretne megadni a következő embernek? (0-3)");
			while (!input.hasNextInt()) {
				System.out.println("Ez nem egy szám! Adja meg újra!");
			input.next();
			}
			n = input.nextInt();
		} while (n<0 || n>3);
		
		return n;
	}
}
