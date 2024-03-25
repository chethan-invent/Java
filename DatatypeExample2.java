package PMSPackage;

public class DatatypeExample2 {

	public static void main(String[] args) {
	   Rectangle r1=new Rectangle();
	    r1.setbreadth(10);
	    r1.setlength(90); 
	    int result=r1.calculatePerimeter();
	    result=200;
	    System.out.println(result);
	    int x = ++result;
	    System.out.println("Res="+result);
	    System.out.println("x="+x);
	    
        result=200;	    
	    int y = result++;
	    System.out.println("Res="+result);
	    System.out.println("y="+y);
	}
}

class Rectangle{
	private int length;
	private int breadth;
public void setlength(int length) {
     this.length=length;
}
public void setbreadth(int breadth) {
	this.breadth=breadth;
}
public int calculatePerimeter() {
	return 2*(length+breadth);
}
}