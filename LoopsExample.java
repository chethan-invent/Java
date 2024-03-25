import java.util.Scanner;

public class LoopsExample {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the statment:");
		String value1=scanner.next();
		System.out.println("Enter number of times to print");
		int value2=scanner.nextInt();
		for(int i=1;i<=value2;i++)
		{
		    System.out.println(value1);
		}
		
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the statement to be printed");
		String line = scanner.nextLine();
		System.out.println("Enter the number of times to be printed");
		int times = scanner.nextInt();
		System.out.println("times:"+times);
		for (int x = 1; x <= times; x++) {
			System.out.println(x+":"+line);
		}*/
    }
}