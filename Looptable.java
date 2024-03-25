import java.util.Scanner;

public class Looptable {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number:");
		int value1=scanner.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(value1+"*"+i+"="+(value1*i));				
		}
	}
}
