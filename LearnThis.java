package PMSPackage;

public class LearnThis {
	public static void main(String[] args) {
		Student s1 = new Student(1,"Name1");
		Student s2 = new Student(2,"Name2");
		s1.display();
		s2.display();

	}
}

class Student {
	private int id;
	private String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	void display() {
		int id = 10;
		System.out.println("The student id is :"+ this.id + " and the student name is :"+ name);
	}
	
}
