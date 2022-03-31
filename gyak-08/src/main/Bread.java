package main;

public class Bread extends Product {
	
	private double amount;
	
	public Bread(String name, int netPrice, int aKey, double amount) {
		super(name, netPrice, aKey);
		this.amount = amount;
	}
	
	@Override
	public double calcUnitPrice() {
		return (grossPrice() / amount);
	}
	
	@Override
	
	public String toString() {
		return super.toString() + " GrossPrice: " + grossPrice() + " Unit Price: " + calcUnitPrice();
	}
	
	public double getAmount() {
		return amount;
	}
	
	public static boolean cmpUnitPrice(Bread bread1, Bread bread2) {
		return bread1.calcUnitPrice() > bread2.calcUnitPrice();
	}
}
