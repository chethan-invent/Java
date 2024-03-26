package PMSPackage;

import java.util.Iterator;

public class javalibraries2 {

	public static void main(String[] args) {
		LocationChanger l1=new LocationChanger();
		LocationChanger l2=new LocationChanger();
		l1.setName("Annabelle Michael");
		l1.setLocation("BL003,Delhi,STP");
		l2.setName("Jissele James");
		l2.setLocation("FL091,Pune,SEZ");
		l1.welcomeEmployee();
		l1.checkCity();
		l1.editAddress();
		System.out.println("\n");
		l2.welcomeEmployee();
		l2.checkCity();
		l2.editAddress();
	}
}
class LocationChanger{
	private String location;
	private String name;
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void checkCity() {
        String[] str1= getLocation().split(",");
        if (str1[1].equals("Delhi")) {
            System.out.println("Welcome to Infy Mysore Delhites");
        } else if(str1[1]=="Trivandrum") {
            System.out.println("Welcome to MyDC people of Trinify");
        } else if(str1[1]=="Bhubaneshwar") {
        	System.out.println("You came a long way down south!We welcome you!");
        } else {
        	System.out.println("Oops your city name is not listed");
        }
	}
	public void editAddress() {
		String[] str2=getLocation().split(",");
		if (str2[2].equals("STP")) {
            System.out.println("Your location has been changed from STP to SEZ");
        } else if(str2[2].equals("SEZ")) {
            System.out.println("Your location remains the same");
        } 
	}
	public void welcomeEmployee() {
		String str=name;
		String[] nameParts=str.split(" ");
		String firstname = nameParts[0];
		System.out.println("Hello "+firstname);
	}
}