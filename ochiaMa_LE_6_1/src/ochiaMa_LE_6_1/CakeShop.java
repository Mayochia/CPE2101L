package ochiaMa_LE_6_1;

import java.util.Scanner;

public class CakeShop {
	static final int SIZE = 2;
	
	
	public static void displayTotal(Cake[] cakes) {
		double totalPrice_RMC = 0;
        double totalPrice_OC = 0;
		
		for (Cake cake : cakes) {
            if (cake instanceof ReadymadeCake) {
                ReadymadeCake readymadeCake = (ReadymadeCake) cake;
                totalPrice_RMC += readymadeCake.calcPrice();
       
            }else if (cake instanceof OrderCake) {
                OrderCake ordercake = (OrderCake) cake;
                totalPrice_OC += ordercake.calcPrice();
            }	
        }
		
		System.out.println("=================================================");
		System.out.println("The total price of all types of cake : " + (totalPrice_RMC+totalPrice_OC));
	}
	
	 public static void displayTotalRMC(Cake[] cakes) {
	        double totalQuantity = 0;
	        double totalPrice_RMC = 0;
	        for (Cake cake : cakes) {
	            if (cake instanceof ReadymadeCake) {
	                ReadymadeCake readymadeCake = (ReadymadeCake) cake;
	                totalPrice_RMC += readymadeCake.calcPrice();
	                totalQuantity += readymadeCake.getQuantity();
	            }	
	        }
	        
	        System.out.println("=================================================");
	        System.out.println("Total price for Readymade cakes: " + totalPrice_RMC);
	        System.out.println("Total quantity sold for Readymade cakes: " + totalQuantity);
	        System.out.println("=================================================");
	   }
	 
	 public static void displayExpensive(Cake[] cakes) {
		 Cake highestPriceCAake = null;
		 double maxPrice = 0;
		
		 for (Cake cake : cakes) {
			 if (cake != null && cake.calcPrice() > maxPrice) {
				 maxPrice = cake.calcPrice();
				 highestPriceCAake = cake;
			 }
		 }
		
		 if (highestPriceCAake != null) {
			 System.out.println("Most Expensive Cake Sold: \n" + highestPriceCAake);
		 } else {
			 System.out.println("No cakes were sold.");
		 }
	 }

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Cake[] cakes = new Cake[SIZE];
		char choice;
		String s;
		String name_cake;
		double rate_cake, weight_cake;
		int quantity_cake;
				
		for(int i = 0; i < SIZE; i++) {
			System.out.println("==================================");
			System.out.println("Cake #" + (i+1));
			System.out.print("Enter NAME of the cake: ");
			name_cake = input.next();
			System.out.print("Enter RATE of the cake: ");
			rate_cake = input.nextDouble();
			System.out.print("[O] Order cake or [R] Ready-made Cake : ");
			choice = input.next().charAt(0);
			s = "" + choice;
			s = s.toLowerCase();
			
			switch (s) {
				case "o":
					System.out.print("Enter cake weight: ");
					weight_cake = input.nextDouble();
					cakes[i] = new OrderCake(name_cake,rate_cake,weight_cake);
					System.out.println("==================================");
					break;
				case "r":
					System.out.print("Enter quantity: ");
					quantity_cake = input.nextInt();
					cakes[i] = new ReadymadeCake(name_cake,rate_cake,quantity_cake);
					System.out.println("==================================");
					break;
				default:
					System.out.println("Invalid input");
			}
		}
		
		displayTotal(cakes);
		displayTotalRMC(cakes);
		displayExpensive(cakes);
		
		input.close();
	}

}
