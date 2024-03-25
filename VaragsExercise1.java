package PMSPackage;

import java.util.Arrays;

public class VaragsExercise1 {

	static void displayList (int... input) {
		System.out.println("Items on the list:");
        for (int item : input) {
            System.out.println(item);
        }
       }
	static int maxOfList (int... input) {
		if (input.length == 0) {
            System.out.println("List is empty.");
            return Integer.MIN_VALUE; // Return minimum value if list is empty
        }
        int max = input[0];
        for (int i = 1; i < input.length; i++) {
            if (input[i] > max) {
                max = input[i];
            }
        }
        return max;
	}
	static void sortList (int... input) {
		Arrays.sort(input);
	}
	static double averageList (int... input) {
		if (input.length == 0) {
            System.out.println("List is empty.");
            return 0; // Return 0 if list is empty
        }
        int sum = 0;
        for (int item : input) {
            sum += item;
        }
        return sum / input.length;
	}
	public static void main(String[] args) {

        System.out.println("Display List:");
        VaragsExercise1.displayList(5, 8, 2, 10, 3);

        System.out.println("Maximum of List: " + VaragsExercise1.maxOfList(5, 8, 2, 10, 3));

        int[] input = {5, 8, 2, 10, 3};
        VaragsExercise1.sortList(input);
        System.out.println("Sorted List: " + Arrays.toString(input));

        System.out.println("Average of List: " + VaragsExercise1.averageList(5, 8, 2, 10, 3));
	}
}
