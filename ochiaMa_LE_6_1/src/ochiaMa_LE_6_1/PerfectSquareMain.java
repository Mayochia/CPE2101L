package ochiaMa_LE_6_1;

import java.util.Scanner;


public class PerfectSquareMain {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer m: ");
        int num = scanner.nextInt();

        PerfectSquare factorization = new PerfectSquare(num);
        int n = factorization.findProdN();

        System.out.println("The smallest number n for m * n to be a perfect square is " + n);
        System.out.println("m * n is " + (num * n));
	}

}
