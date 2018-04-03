package JavaBasics;

//final is a keyword

public class FinalConcept {

	public static void main(String[] args) {
		
		int i=10;
		i=20;
		i=30;
		System.out.println(i);
		
		final int j=25;//Constant Values : The value can't be changed
		
		//final keyword is also used to prevent inheritance
		//Also prevents method overriding
		
		
		//j=20;//Will throw error
		
		
		
	}

}
