
public class thisexample {

	public static void main(String[] args) {
		Choclate c=new Choclate(104,"Pepsico",75,100);
		c.setBarCode(103);
		c.setName("Parle");
		c.setWeight(25);
		c.setCost(51);
		System.out.println("barCode :"+" "+c.getBarCode());
		System.out.println("name    :"+" "+c.getName());
		System.out.println("weight  :"+" "+c.getWeight());
		System.out.println("cost    :"+" "+c.getCost());
	}
}
class Choclate{
	private int barCode;
	private String name;
	private double weight;
	private double cost;
	Choclate(){
		barCode=101;
		name="Cadbury";
		weight=12;
		cost=10;
	}
	Choclate(int barcode,String name,double Weight,double cost){
		this.barCode=102;
		this.name="Hershey's";
		this.weight=24;
		this.cost=50;
	}
	public int getBarCode() {
		return barCode;
	}
	public void setBarCode(int barCode) {
		this.barCode = barCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
}
