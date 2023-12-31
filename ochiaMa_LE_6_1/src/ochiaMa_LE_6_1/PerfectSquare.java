package ochiaMa_LE_6_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class PerfectSquare extends Factor {
	
	PerfectSquare() {
		super();
	}
	
	PerfectSquare(int number) {
		super(number);
	}

	@Override
	protected void primeFactorize(int number) {
		for (int i = 2; i <= number; i++) {
			while (number % i == 0) {
				factors.add(i);
				number /= i;
            }
        }
    }

    public int findProdN() {
        Set<Integer> uniqueFactors = new HashSet<>(factors);

        int n = 1;
        for (int factor : uniqueFactors) {
            int occurrences = numOccur(factors, factor);
            if (occurrences % 2 != 0) {
                n *= factor;
            }
        }
        return n;
    }

    private int numOccur(ArrayList<Integer> factor_list, int key) {
        int count = 0;
        for (int num : factor_list) {
            if (num == key) {
                count++;
            }
        }
        return count;
    }
}
