
public class Polymorphism1 {

	public static void main(String[] args) {
		long [] telephoneNumbers1= {9452425421l,7676765252l};
		Registration r=new Registration("kevin","MN9891N",telephoneNumbers1);
		long [] telephoneNumbers2= {2345615451l,6763562562l};
		Registration r1=new Registration("Julias",123,"PN7878",telephoneNumbers2);
		long [] telephoneNumbers3= {9634524353l,9887373737l};
		Registration r2=new Registration("Jammy",45453,765,telephoneNumbers3);
		long [] telephoneNumbers4= {9867456367l,7645367356l};
		Registration r3=new Registration("Rose","PN8934",34356,telephoneNumbers4);
		System.out.println("Congratulations Kevin!!! you have been successfully registered for our services with the following details:");
        System.out.println("Customer Name   :" +r.getCustomerName());
        System.out.println("passport Number :" +r.getPassportNo());
        System.out.println("Telephone Number:" +telephoneNumbers1[0]+","+telephoneNumbers1[1]+"\n");
        
        System.out.println("Congratulations Julias!!! you have been successfully registered for our services with the following details:");
        System.out.println("Customer Name   :" +r1.getCustomerName());
        System.out.println("License Number  :" +r1.getLicenseNo());
        System.out.println("Pan Card Number :" +r1.getPanCardNo());
        System.out.println("Telephone Number:" +telephoneNumbers2[0]+","+telephoneNumbers2[1]+"\n");
        System.out.println("Congratulations Jammy!!! you have been successfully registered for our services with the following details:");
        System.out.println("Customer Name   :" +r2.getCustomerName());
        System.out.println("Voter Id        :" +r2.getVoterId());
        System.out.println("License Number  :" +r2.getLicenseNo());
        System.out.println("Telephone Number:" +telephoneNumbers3[0]+","+telephoneNumbers3[1]+"\n");
        System.out.println("Congratulations Rose!!! you have been successfully registered for our services with the following details:");
        System.out.println("Customer Name   :" +r3.getCustomerName());
        System.out.println("Pan Card Number :" +r3.getPanCardNo());
        System.out.println("Voter Id        :" +r3.getVoterId());
        System.out.println("Telephone Number:" +telephoneNumbers3[0]+","+telephoneNumbers3[1]);
	}
}
class Registration{
	private String customerName;
	private String panCardNo;
	private int voterId;
	private String passportNo;
	private int licenseNo;
	private long[] telephoneNo;
	Registration(String customerName,String passportNo,long[] telephoneNo){
		this.customerName=customerName;
		this.passportNo=passportNo;
		this.telephoneNo=telephoneNo;
	}
	Registration(String customerName,int licenseNo,String panCardNo,long[] telephoneNo){
		this.customerName=customerName;
		this.licenseNo=licenseNo;
		this.panCardNo=panCardNo;
		this.telephoneNo=telephoneNo;
	}
	Registration(String customerName,int voterId,int licenseNo,long[] telephoneNo){
		this.customerName=customerName;
		this.voterId=voterId;
		this.licenseNo=licenseNo;
		this.telephoneNo=telephoneNo;
	}
	Registration(String customerName,String panCardNo,int voterId,long[] telephoneNo){
		this.customerName=customerName;
		this.panCardNo=panCardNo;
		this.voterId=voterId;
		this.telephoneNo=telephoneNo;
	}
	public String getCustomerName() {
		return customerName;
	}
	public String getPanCardNo() {
		return panCardNo;
	}
	public int getVoterId() {
		return voterId;
	}
	public String getPassportNo() {
		return passportNo;
	}
	public int getLicenseNo() {
		return licenseNo;
	}
	public long[] getTelephoneNo() {
		return telephoneNo;
	}
}