package main;

import java.util.Scanner;

class ret {
	public int x;
	public int y;
	public char z;
}

public class pontok2 {
	
	public static void main(String[] args) {
		program();
	}
	
	static void program() {
		int a, b, n = 0;
		char op;
		String question;
		ret vissza = new ret();
		
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Az els� vagy a m�sodik input m�d? (1-2)");
			while (!input.hasNextInt()) {
				System.out.println("Hib�s bevitel!");
			input.next();
			}
			n = input.nextInt();
		} while (n > 2 || n < 1);
		
		if (n == 1) {
			vissza = operandsFirstType();
		} else {
			vissza = operandsSecondType();
		}
		
		a = vissza.x;
		b = vissza.y;
		op = vissza.z;
		calculate(a,b,op);
		
		System.out.println();
		System.out.println("Szeretne �j m�veletet megadni?");
		input.nextLine();
		while(true) {
			question = input.nextLine();
			if (question.equals("igen") || question.equals("Igen") || question.equals("nem") || question.equals("Nem")) {
				break;
			} else {
				System.out.println("Hib�s bevitel! Adja meg �jra!");
				System.out.println();
				continue;
			}
		}
		
		if (question.equals("igen") || question.equals("Igen")) {
		} else {
			System.exit(0);
		}
		program();
	}
	
	static void calculate(int a, int b, char op) {
		switch (op) {
		
		case '+':
			System.out.println("A k�t sz�m �sszege: " + (a+b));
			break;
		case '-':
			System.out.println("A k�t sz�m k�l�nbs�ge: " + (a-b));
			break;
		case '*':
			System.out.println("A k�t sz�m szorzata: " + (a*b));
			break;
		case '/':
			double div = (double)a/b;
			System.out.println("A k�t sz�m h�nyadosa: " + div);
			break;
		default:
			break;
		}
	}
	
	static ret operandsFirstType() {
		Scanner input = new Scanner(System.in);
		int n = 0;
		int m = 0;
		char op;
		ret vissza = new ret();
		
		while (true) {
			System.out.println("Adja meg az els� sz�mot (eg�sz)");
			while (!input.hasNextInt()) {
				System.out.println("Ez nem egy szam! Adja meg ujra!");
			input.next();
			}
			n = input.nextInt();
			break;
		}
		
		while (true) {
			System.out.println("Adja meg a masodik sz�mot (eg�sz)");
			while (!input.hasNextInt()) {
				System.out.println("Ez nem egy szam! Adja meg ujra!");
			input.next();
			}
			m = input.nextInt();
			break;
		} 
		
		while (true) {
			System.out.println("Milyen m�veletet szeretne v�grehajtani? (+, -, *, /)");
			op = (char)input.next().charAt(0);
			if ((op != '+') && (op != '-') && (op != '*') && (op != '/')) {
				System.out.println("Hib�s bevitel! Adja meg �jra!");
				System.out.println();
				input.nextLine();
				continue;
			}
			break;
		}
		
		//
			vissza.x = n;
			vissza.y = m;
			vissza.z = op;
		//
		return vissza;
	}
	
	static ret operandsSecondType() {
		ret vissza = new ret();
		
		System.out.println("Adj meg egy m�veletet (pl. 1 + 2)");
		Scanner input = new Scanner(System.in);
		String inString = input.nextLine(); 
		String[] strArray = inString.split(" ");
		
		int a = Integer.parseInt(strArray[0]);
		char op = strArray[1].charAt(0);
		int b = Integer.parseInt(strArray[2]);
		//
			vissza.x = a;
			vissza.y = b;
			vissza.z = op;
		//
		return vissza;
	}
}
