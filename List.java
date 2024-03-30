import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class List {

	public static void main(String[] args) {
		ArrayList<String> namelist=new ArrayList<>();
		LinkedList<String> namelist1=new LinkedList<>();
		namelist.add("Chethan");
		namelist.add("Ashwin");
		namelist.add("Darshan");
		namelist.add("Anil");
		namelist1.add("Nandi");
		namelist1.add("Abhi");
		namelist1.add("Naveen");
		namelist1.add("Shetty");
		ListIterator iterator=namelist.listIterator(namelist.size());
		while(iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
		System.out.println("<<<<<<<<<<<<<<<<<<<<");
        for(String string1:namelist1) {
        	System.out.println(string1);
        }
        namelist1.removeFirst();
		namelist1.removeLast();
		System.out.println("#########################");
		for(String string2:namelist1) {
			System.out.println(string2);
		}
		System.out.println("_________________________");
		namelist1.addFirst("Deepa");
		namelist1.addLast("Harshitha");
		for(String string3:namelist1) {
			System.out.println(string3);
		}
        System.out.println("-----------------------");
		for (String string : namelist) {
			System.out.println(string);
		}
		System.out.println("**********************");
		for (int i = namelist.size()-1; i>=0; i--) {
			System.out.println(namelist.get(i));
		}
}
}
