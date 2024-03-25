package PMSPackage;

public interface Interface {

	public static void main(String[] args) {
		intern a1=new intern(5000,500);
		Trainee a2=new Trainee(6000);
		a1.calculatePercentage();
		a2.calculatePercentage();
		System.out.println("the total aggregate percentage secured is "+a1.percentage);
		System.out.println("the total aggregate percentage secured is "+a2.percentage);
	}
}
interface Dataprovider{
	int totalMaximummarks = 8000;
	double calculatePercentage();
}
class intern implements Dataprovider{
	double percentage;
	int marksSecured;
	int graceMarks;
	intern (int marksSecured,int graceMarks) {
		this.marksSecured=marksSecured;
		this.graceMarks=graceMarks;
	}
	public double calculatePercentage() {
		// Calculate total marks (grace marks + marks secured)
	    double totalMarks = graceMarks + marksSecured;

	    // Calculate percentage based on total marks and total maximum marks
	    this.percentage = (totalMarks / totalMaximummarks) * 100;
	    return percentage;
	    
	}
}
class Trainee implements Dataprovider{
    double percentage;
	int marksSecured;
	Trainee(int marksSecured) {
		this.marksSecured=marksSecured;
	}
	public double calculatePercentage() {
		this.percentage=((double)marksSecured/totalMaximummarks)*100;
		return percentage;
	}
	
}
	