package practiceprograms;

public class exception2 {	
		static void checkEmployeeSalary(Employee1 emp) throws EmpSalaryException{
		     if(emp.getEmpSalary()>1000) {
		    	throw new EmpSalaryException("Salary is greater than 1000");
		     } 
		}
		    public static void main(String[] args) throws EmpSalaryException {
				Employee1 e1 = new Employee1("Joe Smith",20,5345);
				Employee1 e2 = new Employee1("Lewis Jane",21,1345);
				Employee1 e3 = new Employee1("Larry Page",22,245);
				Employee1 e4 = new Employee1("Smith James",23,945);
				Employee1 e5 = new Employee1("Elvis George",25,900);
				Employee1[] emparray={e1,e2,e3,e4,e5};
				for(Employee1 e:emparray) {
				try {
					checkEmployeeSalary(e);
					if(e.getEmpSalary()<1000) {
						System.out.println(e.getEmpName());
					}	
				}catch (EmpSalaryException ex) {
					System.out.println(ex.fillInStackTrace());
				} 
		    }		        
	}
}
class Employee1 {
	private String empName;
	private int empAge;
	private double empSalary;
	
	public Employee1(String empName, int empAge, double empSalary) {
		super();
		this.empName = empName;
		this.empAge = empAge;
		this.empSalary = empSalary;
	}
    public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
}
class EmpSalaryException extends Exception{
	EmpSalaryException(String msg){
		super(msg);
	}
}
