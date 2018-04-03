package exceptionHandling;

public class ExceptionHandling {

	public static void main(String[] args) {
		System.out.println("main() starts");
		try {
			int c = 10 / 0;
			System.out.println("Divsion Result is : " + c);
		} catch (ArithmeticException e) {
			System.out.println("Excetion appeared");
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("finally block code executed");
		}

		System.out.println("main() ends");
	}

}

// whenever we get any exception we should try to read it in reverse order

// Exception in thread "main" java.lang.ArithmeticException: / by zero
// at exceptionHandling.ExceptionHandling.main(ExceptionHandling.java:7)

/*
 * It means package name = exceptionHandling, Class name = ExceptionHandling,
 * Method name = main, Line No = 7 ,Exception name = ArithmeticException
 */