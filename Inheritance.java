
public class Inheritance {

	public static void main(String[] args) {
		permanentEmployee pp=new permanentEmployee();
		ContractEmployee cc=new ContractEmployee();
		cc.setHours(10);
		cc.setWages(500);
		cc.CalculateSalary();
		pp.setBasicPay(10000);
		pp.setHRA(1500);
		pp.setExperience(3);
		pp.calculateSalary();
	}
}
class Employee{
	private int empId;
	private String name;
	private double salary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
class permanentEmployee extends Employee{
	private double basicPay;
	private double HRA;
	private int experience;
	public double getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	public double getHRA() {
		return HRA;
	}
	public void setHRA(double hRA) {
		this.HRA = hRA;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public void calculateSalary() {

		double variablecomponent=0.0;
		if(this.experience<3) {
			variablecomponent = 0;
		} else if (this.experience>=3 && this.experience<5) {
			variablecomponent = this.basicPay*(5/100.0);
		} else if (this.experience>=5 && this.experience<10) {
			variablecomponent=this.basicPay*(10/100.0);
		} else if(this.experience>=10) {
			variablecomponent=this.basicPay*(12/100.0);
		}
		double salary = this.basicPay + variablecomponent + this.HRA;
		
		System.out.println("Permanent Employee:Your salary is: "+salary);
	}
}
class ContractEmployee extends Employee{
	private double wages;
	private int hours;
	public double getWages() {
		return wages;
	}
	public void setWages(double wages) {
		this.wages = wages;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public void CalculateSalary(){
		this.hours=hours;
		this.wages=wages;
		double salary;
		salary=hours*wages;
		System.out.println("Contarct Employee:Your salary is: "+salary);
	}
}