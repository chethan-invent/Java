package practice;

import java.util.Scanner;

public class EvenandOdd {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=scanner.nextInt();
		if(num%2==0) {
			System.out.println(+num+" is Even number");
		}else {
			System.out.println(+num+" is Odd number");
		}
	}

}
