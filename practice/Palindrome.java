package practice;

public class Palindrome {
	
	  public static void main(String[] args) {
	    String str = "madam";
	    String reverse = "";

	    for (int i =str.length()-1; i >= 0; i--) {
	      reverse += str.charAt(i);
	    }
	    boolean res=str.equals(reverse);
	    
	    if (res) {
	      System.out.println(str + " is a palindrome.");
	    } else {
	      System.out.println(str + " is not a palindrome.");
	    }
	  }

}
