public class Whileloop {

	private static int i;

	public static void main(String[] args) {
	    /*int count=1;
	    while(count<=10){
	    	 System.out.println(count);
	    	 count++;
	    }*/
		
	    /*int count=10;
	    while(count>=1) {
	    	System.out.println(count);
	    	count--;
	    }*/
	    
		int sum=0;
		while(i<=10)
		{
			sum+=i;
//			sum=sum+i;
			i++;
			
		}
		System.out.println("the sum of numbers 1 to 10 is:"+sum);
	}
}
