
public class classandobjects1 {

	public static void main(String[] args) {
		BankAccount b1=new BankAccount();
		b1.Accountholdername="Chethan";
		b1.Accountnumber=56479;
		b1.Accounttype="Savings account";
        b1.AccountInfo();
        b1.Transactions();
        
        BankAccount b2=new BankAccount();
		b2.Accountholdername="Chandru";
		b2.Accountnumber=78659;
		b2.Accounttype="current account";
        b2.AccountInfo();
        b2.Transactions();
	}
}
class BankAccount{
	String Accountholdername;
	int Accountnumber;
	String Accounttype;
public void AccountInfo()
{
	System.out.println("Account details: "+Accountholdername+","+Accountnumber+","+Accounttype);
}
public void Transactions() {
	System.out.println("1 transaction found on account with account number:"+Accountnumber);
}
}