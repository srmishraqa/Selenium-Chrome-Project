package CommonPrograms;

public class ReturnFunctionality {

	public static void main(String[] args) {
		System.out.println("main() strats");
		int res = add(20, 30) + add(40, 50);
		System.out.println(res);
		System.out.println("main() ends");

	}

	public static int add(int n1, int n2) {
		System.out.println("add() starts");
		int sum = n1 + n2;
		return sum;

	}

}
