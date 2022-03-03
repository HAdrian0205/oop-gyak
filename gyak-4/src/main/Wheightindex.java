package main;

import java.util.Scanner;

class Scan {
	String nev;
	int suly;
	double magassag;
}

public class Wheightindex {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Person per = new Person();
		Scan be = new Scan();
		
		be = scanIn();
		
		per.setName(be.nev);
		per.setHeight(be.magassag);
		per.setWheight((int)be.suly);
		System.out.println(per.toString());

	}
	
	static Scan scanIn() {
		Scan be = new Scan();
		System.out.println("Adjon meg egy nevet: ");
		be.nev = sc.nextLine();
		System.out.println("Adjon meg egy testsúlyt: ");
		be.suly = sc.nextInt();
		System.out.println("Adjon meg egy magasságot (méterben): ");
		be.magassag = sc.nextDouble();
		
		return be;
	}
	
}
