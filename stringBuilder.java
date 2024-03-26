package PMSPackage;

public class stringBuilder {

	public static void main(String[] args) {
		int number=45654;
		if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
		if (isPalindrome1(name)) {
            System.out.println(name + " is a palindrome.");
        } else {
            System.out.println(name + " is not a palindrome.");
        }
	}
public static boolean isPalindrome(int number) {
	    String original = String.valueOf(number);
	    StringBuilder reversed = new StringBuilder(original);
	    String reverstr=reversed.reverse().toString();
		return original.equals(reverstr);
	}
static String name="malayalam";
public static boolean isPalindrome1(String name) {
    String original = name;
    StringBuilder reversed1 = new StringBuilder(name);
    String str1=reversed1.reverse().toString();
	return original.equals(str1);
}
}
