import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

public class CollectionsMap {

	public static void main(String[] args) {
		Student1 s1=new Student1("Chethan", 101,90);
		Student1 s2=new Student1("Naveen", 107,35);
		Student1 s3=new Student1("Girish", 102,50);
		Set<Student1> set = new HashSet<Student1>();
		set.add(s2);
		set.add(s1);
		TreeMap<Integer, Character> gradeMap = new TreeMap<>();
		gradeMap.put(s1.getRollNumber(), s1.calculateGrade());
        gradeMap.put(s2.getRollNumber(), s2.calculateGrade());
        gradeMap.put(s3.getRollNumber(), s3.calculateGrade());
        System.out.println(gradeMap);
	}
}
class Student1{
	private String name;
	private int rollNumber;
	private int totalmarks;
        Student1(String name, int rollNumber,int totalmarks) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.totalmarks=totalmarks;
	}
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}
 
	public int getRollNumber() {
		return rollNumber;
	}
 
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public int getTotalmarks() {
		return totalmarks;
	}
	public void setTotalmarks(int totalmarks) {
		this.totalmarks = totalmarks;
	}
	 public char calculateGrade() {
		 char grade='C';
        if(totalmarks>=100) {
        	System.out.println("Total marks must be less than 100");
        }  else if (totalmarks >= 60) {
           return grade='A';
        } else if (totalmarks<60 && totalmarks>40) {
            return grade='B';
        } else if (totalmarks <= 40) {
            return grade='C';
        }
		return grade;
       }
	 }

	


