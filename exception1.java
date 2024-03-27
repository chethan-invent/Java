package PMSPackage;

public class exception1 {

	public static void main(String[] args) {
		TryMathCube tc = new TryMathCube();
		try {
			int num = Integer.parseInt(args[0]);
			System.out.println(tc.cube(num));
		} catch (Exception e) {
			System.out.println(e.fillInStackTrace());
		} finally {
			System.out.println("End of the program");
		}
	}
}
class TryMathCube {
	public int cube(int n) {
		return n * n * n;
	}
}
