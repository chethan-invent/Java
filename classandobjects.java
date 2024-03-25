
public class classandobjects {

	public static void main(String[] args) {
		EngineeringStudent s1 = new EngineeringStudent(); //Object
		s1.name = "Chetan";
		s1.studentid = 456;
		s1.QualifyingExammarks= (float) 65.67;
		s1.residentialStatus="Day Scholar";
		s1.yearofEngg=3;
		s1.getname();
		s1.getStudentId();
		s1.getQualifyingExammmarks();
		s1.getYearofengg();
		s1.getresidentialstatus();
//		
        /*EngineeringStudent s3=new EngineeringStudent();
		s3.name="Ashwin";
		s3.studentid=488;
		s1.QualifyingExammarks= (float) 65.67;
		s1.residentialStatus="Day Scholar";
		s1.yearofEngg=3;*/
		
		/*EngineeringStudent s3=new EngineeringStudent();
		s3.name="Ashwin";
		s3.studentid=488;
		s3.QualifyingExammarks= (float) 68.45;
		s3.residentialStatus="Day Scholar";
		s3.yearofEngg=3;*/
	}
}

class EngineeringStudent {
	// Features/Attributes, name, id
	String name;
    int studentid;
    float QualifyingExammarks;
    String residentialStatus;
    int yearofEngg;
    
// Actions/Behaviors, Go to school/college, write exam, Learning
    public void getStudentId() {
    	System.out.println("Student Id        :"+studentid);
    }

    public void getname() {
    	System.out.println("Student name      : "+name);
    }
    public void getQualifyingExammmarks() {
    	System.out.println("Qualifying Marks  : "+QualifyingExammarks);
    }
    public void getresidentialstatus() {
    	System.out.println("Residential status: "+residentialStatus);
    }
    public void getYearofengg() {
    	System.out.println("Year of Engg      : "+yearofEngg);
    }
	}


