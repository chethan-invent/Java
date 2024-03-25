
public class ChoclateConstructor {

	public static void main(String[] args) {
	choclate cc=new choclate();
	cc.setBarCode(102);
	cc.setName("Hershey's");
	cc.setWeight(24);
	cc.setCost(50);
	System.out.println("barCode :"+" "+cc.getBarCode());
	System.out.println("name    :"+" "+cc.getName());
	System.out.println("weight  :"+" "+cc.getWeight());
	System.out.println("cost    :"+" "+cc.getCost());
	}
}
class choclate{
	private int barCode;
	private String name;
	private int weight;
	private int cost;
	choclate(){
		this.barCode=101;
		this.name="cadbury";
		this.weight=12;
		this.cost=10;
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
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
}