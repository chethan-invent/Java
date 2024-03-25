package PMSPackage;

public class Enum {

	public static void main(String[] args) {
		Student1 s1=new Student1();
		s1.setStudentId(1000);
		s1.setName("alvin");
		s1.setTotalMarks(280);
		s1.calculateGrade();
		s1.calculateScholarshipAmount();
		System.out.println("Student Details:");
		System.out.println("Student Id        : "+s1.getStudentId());
		System.out.println("Student Name      : "+s1.getName());
		System.out.println("Student Grade     : "+s1.getGrade());
		System.out.println("Scholarship amount: "+s1.getScholarshipAmount());
	}
}
enum Grade{
	A,B,C,D,E;
}
class Student1{
	private int studentId;
	private String name;
	private Grade grade;
	public Grade getGrade() {
		return grade;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	private int scholarshipAmount;
	private int totalMarks;
	public int getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScholarshipAmount() {
		return scholarshipAmount;
	}
	public void setScholarshipAmount(int scholarshipAmount) {
		this.scholarshipAmount = scholarshipAmount;
	}
	public void calculateGrade() {
		if(totalMarks>=250) {
			grade=Grade.A;	
		}else if(totalMarks>=200 && totalMarks<250) {
			grade=Grade.B;
		}else if(totalMarks>=175 && totalMarks<200) {
			grade=Grade.C;
		}else if(totalMarks>=150 && totalMarks<175) {
			grade=Grade.D;
		}else {
			grade=Grade.E;
		}
	}
	public void calculateScholarshipAmount() {
		switch(grade) {
		case Grade.A:
			scholarshipAmount=5000;
			break;
		case Grade.B:
			scholarshipAmount=4000;
			break;
		case Grade.C:
			scholarshipAmount=3000;
			break;
		case Grade.D:
			scholarshipAmount=2000;
			break;
		default:
			scholarshipAmount=0;
		}
	}
}