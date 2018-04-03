package OOPConceptPart2;

public class A {

	public A() {
		System.out.println("Parent class default constructor");
	}

	public A(int i) {
		System.out.println("Parent class A parameterized constructor with the value of i : " + i);
	}

	public A(int i, int j) {
		System.out.println("Parent class A parameterized constructor with the value of i : " + i);
		System.out.println("Parent class A parameterized constructor with the value of j : " + j);
	}

}
