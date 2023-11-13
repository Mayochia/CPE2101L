package ochiaMa_LE_6_1;


public class Cake {

	protected String name;
	protected double rate;
	
	Cake(String n, double r) {
		name = n;
		rate = r;
	}
	
	public double calcPrice() {
		return 0;
	}
	
	public String toString() {
		return String.format("%-20s %.2f", name, rate);
	}

}
