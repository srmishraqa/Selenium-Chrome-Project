package JavaBasics;

public class FinalizeConcept {

	public void finalize() {
		System.out.println("finalize method");
	}

	// finalize is a method
	// though we have not called finalize method it will be automatically called
	// before garbage collector just for clean up processing of object

	public static void main(String[] args) {

		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();

		// two objects are created of the same class

		f1 = null;
		f2 = null;

		// after this two blank or abandon objects are available without any reference
		// in java memory
		// Garbage collector will come and destroy these abandon objects
		// Finalize keyword is used to perform the clean up

		// Calling Garbage collector
		System.gc();

	}

}
