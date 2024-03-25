package PMSPackage;

public class AbstractClassesAndMethods {

	public static void main(String[] args) {
		ShoppingPayment s1=new ShoppingPayment(5000, 561328);
		CreditCardPayment c1=new CreditCardPayment(10000.23, 5001);
//		s1.payBill(6000);
		c1.payBill(0);	
	}
}
abstract class RRPaymentServices{
	private double balance;
	private int customerId;
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	RRPaymentServices(double balance,int customerId){
		this.balance=balance;
		this.customerId=customerId;
	}
	abstract void payBill(double amount);
}
class ShoppingPayment extends RRPaymentServices{
	static int counter;
	private String PaymentID;
	public String getPaymentID() {
		return PaymentID;
	}
	public void setPaymentID(String paymentID) {
		PaymentID = paymentID;
	}
	ShoppingPayment(double balance,int customerId){
		super(balance, customerId);
	}
	void payBill(double amount) {
		if (amount != this.getBalance()) {
            System.out.println("Excess amount entered!!Please try again");
            return;
        }

        // Generate payment ID
        this.PaymentID = generatePaymentId("S");
        System.out.println("Payment successful");
        System.out.println("Congratulations!!your payment of Rs."+amount+" is Successful with Payment Id "+PaymentID);
	}
	public static String generatePaymentId(String prefix) {
        // Assuming the payment ID is 'S' followed by a four-digit integer
        // Generate a random four-digit number
        int randomNumber = (int) (Math.random() * 9000) + 1000;
        return prefix + randomNumber;
    }
}
class CreditCardPayment extends RRPaymentServices{
	static int counter;
	private String paymentId;
	private double cashback;
	private double balanceDue;
	public void setBalanceDue(double balanceDue) {
		this.balanceDue = balanceDue;
	}
	CreditCardPayment(double balance, int customerId) {
		super(balance, customerId);
	}
	public String getPaymentId() {
		return paymentId;
	}
	public double getCashback() {
		return cashback;
	}
	public double getBalanceDue() {
		return balanceDue;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	public void setCashback(double cashback) {
		this.cashback = cashback;
	}
    void payBill(double amount) {
    	double amountToBePaid = 0;
    	double cashback;
		if (amount > amountToBePaid) {
           cashback = amount - amountToBePaid;
        } else if (amount < amountToBePaid) {
            this.setBalance(this.getBalance()-amount);
        }
       
        // Generate transaction ID
        this.paymentId = generateTransactionId("C");
        System.out.println("Payment successful.");
        System.out.println("CustomerId:"+this.getCustomerId());
		System.out.println("paymentId :"+this.paymentId);
		System.out.println("Previous Due:"+this.getBalance());
		
		if(amount<this.getBalance()) {
			this.balanceDue=this.getBalance()-amount;
		}else {
			this.cashback=amount-this.getBalance();
		}
		System.out.println("Remaining Due:"+(this.balanceDue));
		System.out.println("Cashback Wallet balance:"+this.cashback);
    }
    public static String generateTransactionId(String prefix) {
        // Assuming the transaction ID is 'C' followed by a four-digit integer
        // Generate a random four-digit number
        int randomNumber = (int) (Math.random() * 9000) + 1000;
        return prefix + randomNumber;
    }
}