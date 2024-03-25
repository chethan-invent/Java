
public class Typecasting {

	public static void main(String[] args) {
	    int billid=1002;
	    int customerid=102;
	    int discount=4;
	    double billamount=210.5;
	    System.out.println((float)discount/100);
	    double discountedbillamount=billamount - billamount * ((float)discount/100);
	    System.out.println("bill Id:"+billid);
	    System.out.println("customer Id:"+customerid);
	    System.out.println("DiscountedBillAmount:"+discountedbillamount);
	}
}