package com.benionpackage;

/*
package com.benionpackage;

public class Main {

    public static void main(String[] args) {
	// write your code here
        TaxCalculator calculator = getCalculator();
        calculator.calculateTax();
    }

    public  static TaxCalculator getCalculator() {
        return new TaxCalculator2019();
    }
}

*/

public interface TaxCalculator {
    float calculateTax();
}
