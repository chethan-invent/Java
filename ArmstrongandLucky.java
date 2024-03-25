import java.util.Scanner;

public class ArmstrongandLucky {

	public static void main(String[] args) {
		int choice=1;
		   int number=153;
			switch (choice) {
			case 1: 
				System.out.println("1.Calculate Armstrong");
				checkArmstrong(number);
				break;
			case 2: 
				checkLucky(number);
				break;
			default:
				System.out.println("Invalid choice");
			}
		}
		
		static void checkArmstrong(int number) {
			int num=153; 
			int temp=num;
			int sum=0;
			while(num!=0) {
				int digit = num%10;
				sum=sum + (int)Math.pow(digit,3);
				num=num/10;
			}
			System.out.println("Sum= "+sum);
			System.out.println("Num= "+temp);
			if(sum==temp) {
				System.out.println("The number is Armstrong Number");
			} else {
				System.out.println("The number is Not Armstrong Number");
			}
		}

		static void checkLucky(int number) {
			String numStr = String.valueOf(number);
	        int sumOfSquares = 0;
	        for (int i = 1; i < numStr.length(); i += 2) {
	            int digit = Character.getNumericValue(numStr.charAt(i));
	            sumOfSquares += digit * digit;
	        }
	        boolean result=sumOfSquares % 9 == 0;
	        if(result) {
	        	System.out.println("the number is Lucky number");
	        }
	        else {
	        	System.out.println("the number is not lucky number");
	        }
		}
	}

