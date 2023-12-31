package ochiaMa_LE_6_1;


public class ReadymadeCake extends Cake{
	
	private int quantity;
	
	ReadymadeCake(String name, double rate, int quantity){
		super(name,rate);
		this.quantity = quantity;
	}
	
	@Override
	public double calcPrice() {
		return rate * quantity;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return String.format("%-20s/quantity\t%d\t\t%.2f", super.toString(), quantity, calcPrice());
	}
}
