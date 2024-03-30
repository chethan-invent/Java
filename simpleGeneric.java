package PMSPackage;

public class simpleGeneric {

	public static void main(String[] args) {
		SimpleGeneric1<String,Integer> genClass = new SimpleGeneric1<String,Integer>("Input",1);
		genClass.showObjectType();
		SimpleGeneric1<Integer,String> genClass2 = new SimpleGeneric1<Integer,String>(1,"Input");
		genClass2.showObjectType();
	}
}
class SimpleGeneric1<C,M>{
	private C Hello;
	private M World;
	public C getHello() {
		return Hello;
	}
	public void setHello(C Hello) {
		this.Hello = Hello;
	}

	public SimpleGeneric1(C hello,M World) {
		
	}
	void showObjectType(){
		
	}
	public M getWorld() {
		return World;
	}
	public void setWorld(M World) {
		this.World = World;
	}
}