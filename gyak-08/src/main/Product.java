package main;

public abstract class Product {
	
	private String name;
	private int netPrice;
	private int aKey;
	
	public Product() {
		
	}
	
	public Product(String name, int netPrice, int aKey) {
		super();
		this.name = name;
		this.netPrice = netPrice;
		this.aKey = aKey;
	}
	
	public abstract double calcUnitPrice();
	
	public int grossPrice() {
		double multiplier = ((double)aKey/100)+1;
		return (int)(netPrice * multiplier);
	}
	
	public void raisePrice(int raisePercent) {
		double multiplier = ((double)raisePercent/100) + 1;
		netPrice *= multiplier;
	}
	
	public int cmpGrossPrices(Product prod) {
		if (grossPrice() > prod.grossPrice()) {
			return 1;
		} else if (grossPrice() < prod.grossPrice()) {
			return -1;
		} else {
			return 0;
		}
	}
	
	@Override
	public String toString() {
		return "name" + name + "grossPrice" + grossPrice();
	}
}
