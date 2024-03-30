import java.util.ArrayList;
import java.util.List;

public class Collections {

	public static void main(String[] args) {
		ArrayList<String> arraylist=new ArrayList<>();
	    arraylist.add("Hello");
	    arraylist.add("World");
	    arraylist.isEmpty();
	    arraylist.indexOf(arraylist);
	    Object[] Object1=arraylist.toArray();
	    arraylist.subList(0, 1);
	    System.out.println(arraylist);
	    System.out.println(arraylist.isEmpty());
	    System.out.println(arraylist.contains("World"));
	    System.out.println(arraylist.indexOf("Hello"));
	    System.out.println(arraylist.subList(0, 1));
	}
}
