package PMSPackage;

public class staticModifier {
	public static void main(String[] args) {
		Loan l1=new Loan();
        Loan l2=new Loan();
        Loan l3=new Loan(123,101,1000f,10,5.5f);
        System.out.println("Total objects:"+Loan.getLoancounter());
	}
}
class Loan{
	private int loanNo;
	private int accountNo;
	private int customerNo;
	private float loanAmount;
	private int loanDuration;
	private float interest;
	private static int loancounter;
	static {
   	 loancounter=100;
    }
	Loan(){
		loancounter++;
	}
	Loan(int accountNo,int customerNo,float loanAmount,int loanDuration,float interest){
		this.accountNo=accountNo;
		this.customerNo=customerNo;
		this.loanAmount=loanAmount;
		this.loanDuration=loanDuration;
		this.interest=interest;
		loancounter++;
	}
	public int getLoanNo() {
		return loanNo;
	}
	public void setLoanNo(int loanNo) {
		this.loanNo = loanNo;
	}
	public static int getLoancounter() {
		return loancounter;
	}
	public static void setLoancounter(int loancounter) {
		Loan.loancounter = loancounter;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public int getCustomerNo() {
		return customerNo;
	}
	public void setCustomerNo(int customerNo) {
		this.customerNo = customerNo;
	}
	public float getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(float loanAmount) {
		this.loanAmount = loanAmount;
	}
	public int getLoanDuration() {
		return loanDuration;
	}
	public void setLoanDuration(int loanDuration) {
		this.loanDuration = loanDuration;
	}
	public float getInterest() {
		return interest;
	}
	public void setInterest(float interest) {
		this.interest = interest;
	}
}