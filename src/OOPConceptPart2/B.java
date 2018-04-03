package OOPConceptPart2;

public class B extends A {

	public B() {
		// Automatically parent class default constructor is called if we don't provide
		// any super keyword
		// As we have deliberately put super(10) it will execute the code of
		// parameterized constructor code instead of default constructor

		// super(10);//To call parent class parameterized constructor
		super(20, 30);
		System.out.println("Child B Class Constructor");
		// super(20,30);Error will come
		// At at time you can call only one constructor of parent class
	}

	// If we want to call multiple constructor
	public B(int i) {
		super(10);
		System.out.println("Child B Class Constructor with one param");
	}

	public static void main(String[] args) {
		B obj = new B();
		B obj1 = new B(10);

	}

	// super keyword always should be written inside child class constructor
	// And it should be the 1st statement of any constructor

}

// First B object is created immediately it goes to B default constructor but
// before that
// It checks Parent class
// here the parent class is A
// So it will go to first default constructor of A and execute
// then it comes back to default constructor of B and execute