package practice;

import java.util.Scanner;

public class Sumofdigits {

	public static void main(String[] args) {
		int digit, sum = 0;
	    int number=1278;

	    // Iterate until the number becomes 0
	    while (number > 0) {
	      // Extract the last digit
	      digit = number % 10;

	      // Add the last digit to the sum
	      sum += digit;

	      // Remove the last digit from the number
	      number /= 10;
	    }

	    System.out.println("Sum of digits: " + sum);
	}

}
