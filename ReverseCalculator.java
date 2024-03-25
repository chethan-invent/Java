import java.util.Scanner;

public class ReverseCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		int reverse=0;
		while(num!=0) {
			reverse=reverse*10+num%10;
			num=num/10;
		}
        System.out.println("The reverse of the number using while is:"+reverse);
        
      //Do while
      		num=1234;
      		reverse=0;
      		do {
      			reverse=reverse*10+num%10;
      			num=num/10;
      		} while(num!=0);
      		System.out.println("Reverse of the number using Do-While: "+reverse);
      		
      	//For
    		num=1234;
    		for(reverse=0;num>0;num/=10) {
    			reverse=reverse*10+num%10;
    		}
    		System.out.println("Reverse of the number using for: "+reverse);
    	
    	}

	}
