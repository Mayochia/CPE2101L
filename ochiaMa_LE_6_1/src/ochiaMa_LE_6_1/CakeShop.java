package ochiaMa_LE_6_1;

import java.util.Scanner;

public class CakeShop {
	static final int SIZE = 20;
	
	public static void displayCake(Cake[] cakes) {
		System.out.println("---------------------------Cake-------------------------");
		System.out.println(String.format("%-20s %-10s ", "Name", "Rate"));
        for (Cake cake : cakes) {
            if (cake instanceof Cake && !(cake instanceof OrderCake) && !(cake instanceof ReadymadeCake)) {
                System.out.println(cake.toString());
            }
        }

        
    }
	public static void displayOC(Cake[] cakes) {
		System.out.println("---------------------------OrderCakes-------------------------");
		System.out.println(String.format("%-20s %-10s \t\t%-10s \t%-10s", "Name", "Rate", "Weight", "Price"));
	    for (Cake cake : cakes) {
	        if (cake instanceof OrderCake) {
	            System.out.println(cake.toString());
	        }
	    }
	}
	
	public static void displayRMC(Cake[] cakes) {		
		System.out.println("---------------------------ReadyMadeCakes-------------------------");
		System.out.println(String.format("%-20s %-10s \t%-10s \t%-10s", "Name", "Rate", "Quantity", "Price"));
	    for (Cake cake : cakes) {
	        if (cake instanceof ReadymadeCake) {
	            System.out.println(cake.toString());
	        }
	    }
	}
	
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
		
		int choice;
		char type;
		String s;
		String name_cake;
		double rate_cake, weight_cake;
		int quantity_cake;
		
		System.out.println("Do you want user input or automated?");
		System.out.println("[1] User Input");
		System.out.println("[2] Automated\n");
		System.out.print("Choice: ");
		choice = input.nextInt();
		
		switch(choice) {
			case 1:
				for(int i = 0; i < SIZE; i++) {
					System.out.println("==================================");
					System.out.println("Cake #" + (i+1));
					System.out.print("Enter NAME of the cake: ");
					input.nextLine();
					name_cake = input.next();
					System.out.print("Enter RATE of the cake: ");
					input.nextLine();
					rate_cake = input.nextDouble();
					System.out.print("[O] Order cake or [R] Ready-made Cake : ");
					input.nextLine();
					type = input.next().charAt(0);
					
					s = "" + type;
					s = s.toLowerCase();
					
					switch (s) {
						case "o":
							System.out.print("Enter cake weight (kg): ");
							input.nextLine();
							weight_cake = input.nextDouble();
							cakes[i] = new OrderCake(name_cake,rate_cake,weight_cake);
							System.out.println("==================================");
							break;
						case "r":
							System.out.print("Enter quantity: ");
							input.nextLine();
							quantity_cake = input.nextInt();
							cakes[i] = new ReadymadeCake(name_cake,rate_cake,quantity_cake);
							System.out.println("==================================");
							break;
						default:
							System.out.println("Invalid input");
					}
				}
				break;
			case 2:
				System.out.println("---------------------------All Cakes------------------------------");
				cakes[0] = new Cake("Peanut Butter", 141);
		        cakes[1] = new Cake("Caramel", 562);
		        cakes[2] = new Cake("Apple", 198);
		        cakes[3] = new Cake("Pumpkin", 624);
		        cakes[4] = new Cake("Almond", 619);
		        cakes[5] = new OrderCake("Chocolate", 584, 5);
		        cakes[6] = new OrderCake("Vanilla", 453, 4);
		        cakes[7] = new OrderCake("Red Velvet", 342, 2);
		        cakes[8] = new OrderCake("Carrot", 352, 5);
		        cakes[9] = new OrderCake("Lemon", 262, 4);
		        cakes[10] = new OrderCake("Strawberry", 666, 1);
		        cakes[11] = new OrderCake("Coconut", 310, 7);
		        cakes[12] = new OrderCake("Marble", 329, 4);
		        cakes[13] = new ReadymadeCake("Black Forest", 222, 9);
		        cakes[14] = new ReadymadeCake("Angel Food", 221, 8);
		        cakes[15] = new ReadymadeCake("German Chocolate", 362, 4);
		        cakes[16] = new ReadymadeCake("Pound", 676, 3);
		        cakes[17] = new ReadymadeCake("Funfetti", 122, 1);
		        cakes[18] = new ReadymadeCake("Tiramisu", 415, 2);
		        cakes[19] = new ReadymadeCake("Pineapple", 257, 7);
		        break;
			default:
				System.out.println("Invalid Input. Try again");
				break;
		}
		
		displayCake(cakes);
		displayOC(cakes);
		displayRMC(cakes);
		displayTotal(cakes);
		displayTotalRMC(cakes);
		displayExpensive(cakes);
		
		input.close();
	}

}
