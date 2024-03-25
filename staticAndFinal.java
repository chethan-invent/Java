package PMSPackage;

public class staticAndFinal {

	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		e1.setPoint(80);
		e2.setPoint(60);
		e3.setPoint(50);
		int a=PerformanceRating.calculatePerformace(e3);
		System.out.println("The Rating of the Employee is: "+a);
	}
}
class Employee{
	private int point;

	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
}
class PerformanceRating{
	private static final int Outstanding=5;
	private static final int Good=4;
	private static final int Average=3;
	private static final int poor=2;
	public static final int getOutstanding() {
		return Outstanding;
	}
	public static final int getGood() {
		return Good;
	}
	public static final int getAverage() {
		return Average;
	}
	public static final int getPoor() {
		return poor;
	}
	public static int calculatePerformace(Employee employee) {
		int rating=0;
		if(employee.getPoint()>=80 && employee.getPoint()<=100) {
		      rating=Outstanding;
		}else if(employee.getPoint()>=60 && employee.getPoint()<=79) {
			  rating=Good;
		}else if(employee.getPoint()>=50 && employee.getPoint()<=59) {
			  rating=Average;
		}else if(employee.getPoint()>=1 && employee.getPoint()<=49) {
			  rating=poor;
		}
		return rating;
	}
}