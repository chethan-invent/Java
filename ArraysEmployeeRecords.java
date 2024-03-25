public class ArraysEmployeeRecords {
    public static void main(String[] args) {
 	   double[] salaries = {23500.0, 25080.0, 28760.0, 22340.0, 19890.0};
        EmployeeRecord empRecord = new EmployeeRecord();
        empRecord.salaries=salaries;

        double average = empRecord.calculateAverageSalary();
        int aboveAverageCount = empRecord.countAboveAverage();
        int belowAverageCount = empRecord.countBelowAverage();

        System.out.println("Average Salary of: " + average);
        System.out.println("Number of employees with salary above average: " + aboveAverageCount);
        System.out.println("Number of employees with salary below average: " + belowAverageCount);
}
}


class EmployeeRecord {
	
    public double[] salaries;
    

    public double calculateAverageSalary() {
        double total = 0;
        for (int i =0; i< salaries.length;i++) {
            total += salaries[i];
        }
        return total / salaries.length;
    }

    public int countAboveAverage() {
        double average = calculateAverageSalary();
        int count = 0;
        for (double salary : salaries) {
            if (salary > average) {
                count++;
            }
        }
        return count;
    }

    public int countBelowAverage() {
        double average = calculateAverageSalary();
        int count = 0;
        for (double salary : salaries) {
            if (salary < average) {
                count++;
            }
        }
        return count;
    }


}
