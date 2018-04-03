package OOPConceptPart2;

public class ConstructorWithThisKeyword {
	
	//global variables
	String name;
	int age;
		
       public ConstructorWithThisKeyword(String name,int age) {
    	   this.name=name;//initialize global variable = local variable
    	   this.age=age;
    	   
    	   System.out.println(name);
    	   System.out.println(age);
		
	}
	
	public static void main(String[] args) {
		
		ConstructorWithThisKeyword obj=new ConstructorWithThisKeyword("TOM",30);
				
	}

}
