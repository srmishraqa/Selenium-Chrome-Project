package OOPConceptPart1;

public class StaticAndNonStaticConcept {
	
	
	String name="Tom";//non static global variable
	static int age=25;//static global variable

	public static void main(String[] args) {
		
		//How to call static methods and variables
		
		//1.direct calling:
		sum();
		
		//2.calling by class name
		StaticAndNonStaticConcept.sum();
		
		//static variable
		System.out.println(age);//direct call
		
		System.out.println(StaticAndNonStaticConcept.age);//by class name
		
		
		//Calling not static variables and methods
		StaticAndNonStaticConcept obj=new StaticAndNonStaticConcept();
	    System.out.println(obj.name);
	    obj.sendMail();
	    
	    //accessing static methods by object reference
	    //acccesssing is possible but will give warning
	    obj.sum();
		
	}
	
	public void sendMail() {
		System.out.println("Send mail method");
	}
	
	public static void sum() {
		System.out.println("sum method");
	}

}
