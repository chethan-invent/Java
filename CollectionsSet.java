import java.util.HashSet;
import java.util.Set;

public class CollectionsSet {

	public static void main(String[] args) {
		Student s1=new Student("Chethan", 101);
		Student s2=new Student("Naveen", 101);
		Set<Student> set = new HashSet<Student>();
		set.add(s2);
		set.add(s1);
		System.out.println(set);
	}
}
class Student{
	private String name;
	private int rollNumber;
        Student(String name, int rollNumber) {
		this.name = name;
		this.rollNumber = rollNumber;
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
	public boolean equals(Object obj) {
		Student other = (Student) obj;
		return other.rollNumber == this.rollNumber;
	}

	@Override
	public int hashCode() {
		return this.rollNumber;
	}
	public String toString() {
		return "rollNumber="+this.rollNumber;
	}
}