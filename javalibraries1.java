package PMSPackage;

public class javalibraries1 {

	public static void main(String[] args) {
		StudentRegistration s1=new StudentRegistration("Peter", 23, 5001);
		StudentRegistration s2=new StudentRegistration("Peter", 24, 5003);
		s1.generateRollNumber();
		s2.generateRollNumber();
		if(s1.equals(s2)){
        	System.out.println("Roll number already generated for the student");
        } else {
        	System.out.println("   Student Details   ");
    		System.out.println("***********************");
    		System.out.println("Student Name    : "+s1.getStudentName());
    		System.out.println("Admission Number: "+s1.getAdmissionNumber());
    		System.out.println("Roll Number     : "+s1.getRollNumber()+"\n");
        }  
	}
}
class StudentRegistration{
	private String studentName;
	private double age;
	private int admissionNumber;
	private int rollNumber;
	static int counter;
	StudentRegistration(String studentName,double age,int admissionNumber){
		this.studentName=studentName;
		this.age=age;
		this.admissionNumber=admissionNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public double getAge() {
		return age;
	}
	public int getAdmissionNumber() {
		return admissionNumber;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setAge(double age) {
		this.age = age;
	}
	public void setAdmissionNumber(int admissionNumber) {
		this.admissionNumber = admissionNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	void generateRollNumber() {
		counter=1001;
		counter++;
		this.rollNumber=counter;
	}
	public boolean equals(Object obj) {
		StudentRegistration stu=(StudentRegistration)obj;
		return this.admissionNumber==stu.admissionNumber;
	}
	public int hashCode() {
		return this.admissionNumber;
	}
}