package practice;

public class VowelsandConsonents {

	public static void main(String[] args) {
		String str="Hello World!!";
		str=str.toLowerCase();
		int vowelcount=0;
		int consonentscount=0;
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			
			if(Character.isLetter(ch)) {
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					vowelcount++;
				}else {
					consonentscount++;
				}
			}
		}
		System.out.println("Number of vowels:"+vowelcount);
		System.out.println("Number of Consonents:"+consonentscount);
	}
}
