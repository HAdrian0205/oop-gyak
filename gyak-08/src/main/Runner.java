package main;

import java.util.Scanner;

public class Runner {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("How many products?: ");
		int n = sc.nextInt();
		sc.nextLine();
		Product[] prod = new Product[n];
		
		for (int i = 0; i < prod.length; i++) {
			System.out.println("Which type of product do you want?");
			String which = sc.nextLine();
			if(which.equals("Book")) {
				System.out.println("Author: ");
				String name = sc.nextLine();
				
				System.out.println("Title: ");
				String title = sc.nextLine();
				
				System.out.println("Style: ");
				String style = sc.nextLine();
				
				System.out.println("Price: ");
				int price = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Pages: ");
				int pages = sc.nextInt();
				sc.nextLine();
				
				prod[i] = new Book(name, title, price, pages, style);
			}
			if(which.equals("Bread")) {
				System.out.println("Name: ");
				String name = sc.nextLine();
				System.out.println("Price: ");
				int price = sc.nextInt();
				sc.nextLine();
				System.out.println("Key: ");
				int key = sc.nextInt();
				sc.nextLine();
				System.out.println("Amount: ");
				int amount = sc.nextInt();
				sc.nextLine();
				
				prod[i] = new Bread(name, price, key, amount);
			}
				
		}
		
		Product temp;
		
		for(int i = 0; i < prod.length; i++) {
			for (int j = i+1; j < prod.length; j++) {
				if (prod[i].calcUnitPrice() > prod[j].calcUnitPrice()) {
					temp = prod[j];
					prod[j] = prod[i];
					prod[i] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("The products in ascending order: ");
		for(int i = 0; i < prod.length; i++) {
			System.out.println(prod[i].toString());
		} 
		
		System.out.println();
		System.out.println("The authors: ");
		String[] authors = new String[n];
		int count = 0;
		Kulso:
		for(int i = 0; i < prod.length; i++) {
			if (prod[i] instanceof Book) {
				Book tempBook = (Book)prod[i];
				for (int j = 0; j < count; j++) {
					if (tempBook.getAuthor().equals(authors[j])) {
						continue Kulso;
					}
				}
				if (prod[i].calcUnitPrice() > 20) {
					System.out.println(tempBook.getAuthor());
					authors[i] = tempBook.getAuthor();
					count++;
				}
			}
		}
	}

}
