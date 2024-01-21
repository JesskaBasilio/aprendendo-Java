package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public int addProducts(int quantity) {
		return this.quantity += quantity;
	}
	
	public int removeProduts(int quantity) {
		return this.quantity -= quantity;
	}
	
	public String toString() {
		return  name 
			+ ", $" +
			String.format("%.2f", price) +
			", " + quantity +
			" units, Total: " +String.format("%.2f", totalValueInStock());
	}
}
