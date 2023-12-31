package ochiaMa_LE_6_1;

public class OrderCake extends Cake{
	
	private double weight;
	
	OrderCake(String name, double rate, double weight){
		super(name,rate);
		this.weight = weight;
	}
	
	@Override
	public double calcPrice() {
		return rate * weight;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	@Override
	public String toString() {
		return String.format("%-20s/kg\t\t%.2f kg\t\t%.2f", super.toString(), weight, calcPrice());
    }

}
