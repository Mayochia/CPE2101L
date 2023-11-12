package ochiaMa_LE_6_1;

import java.util.ArrayList;

public class Factor {
	protected ArrayList<Integer> factors;
	
	Factor(){

	}

    Factor(int number) {
        factors = new ArrayList<>();
        primeFactorize(number);
    }

    protected void primeFactorize(int number) {
    }

    public ArrayList<Integer> getFactors() {
        return factors;
    }
	
}
