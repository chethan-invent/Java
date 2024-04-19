package practice;

public class Arraylargest {

	public static void main(String[] args) {
		int[] num= {10,20,35,48,50,69};
		int largest=num[0];
		for (int i = 0; i < num.length; i++) {
			if(num[i]>largest) {
				largest=num[i];
			}
		}
		System.out.println("The largest element in the array is:"+largest);
	}
}
