import java.time.LocalDate;
import java.time.Period;
public class AgeCalculatorandDateTime {
	public static void main(String[] args) {
		AgeFinder a1=new AgeFinder();
	
		System.out.println("Your age is: "+a1.getAge()+" Years");
		System.out.println("The date After 15 Days is: "+a1.getDateAfterNDays(15));
		System.out.println("The date after 1 year, 2 months and 3 days is: "+a1.getDateAfterXYearYMonthZDays(1, 2, 3));
	}
}

class AgeFinder{
	public int getAge() {
		LocalDate dateOfBirth;
		dateOfBirth=LocalDate.of(1989, 10,26);
		LocalDate current=LocalDate.of(2024, 04,01);
	    Period period=Period.between(dateOfBirth,current);
		int Age=period.getYears();
		return Age;
	}
	public LocalDate getDateAfterNDays(int noOfDays) {
		return LocalDate.now().plusDays(noOfDays);
	
	}
	public LocalDate getDateAfterXYearYMonthZDays(int year, int month, int day) {
		return LocalDate.now().plusYears(year).plusMonths(month).plusDays(day);
	}
}

