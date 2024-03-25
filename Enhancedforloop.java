
public class Enhancedforloop {

	public static void main(String[] args) {
		SubjectMarks subjectMarks = new SubjectMarks();
        int[] studentMarks = {85, 92, 78, 88, 90};
        subjectMarks.storeMarks(studentMarks);
        subjectMarks.displayMarks();
	}
}
class SubjectMarks {
    int[] marks;
    public SubjectMarks() {
        marks = new int[5]; 
    }
    public void storeMarks(int[] subjectMarks) {
    	this.marks=subjectMarks;
    	System.out.println("Marks stored Successfully");
//        if (subjectMarks.length == 5) {
//            for (int i = 0; i < 5; i++) {
//                marks[i] = subjectMarks[i];
//            }
//            System.out.println("Marks stored successfully.");
//        } else {
//            System.out.println("Error: Invalid number of marks provided.");
//        }
    }

    public void displayMarks() {
        System.out.println("Marks for 5 subjects:");
        for (int mark : marks) {
            System.out.println(mark);
        }
    }
}    