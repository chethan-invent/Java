package practice;

public class Stringpractice {

	public static void main(String[] args) {
		String str="Hello World ";
		String str1=new String("String");
		char ss=str1.charAt(4);
		int ss1=str.compareTo(str1);
		String ss2=str.concat(str1);
		boolean ss3=str.endsWith(str1);
		boolean ss4=str.contains(str1);
		int ss5=str1.indexOf(ss1);
		boolean ss6=str.isBlank();
		String ss7=str.intern();
		String ss8=str.toLowerCase();
		System.out.println(ss);
		System.out.println(ss1);
		System.out.println(ss2);
		System.out.println(ss3);
        System.out.println(ss4);
        System.out.println(ss5);
        System.out.println(ss6);
        System.out.println(ss7);
        System.out.println(ss8);
	}

}
