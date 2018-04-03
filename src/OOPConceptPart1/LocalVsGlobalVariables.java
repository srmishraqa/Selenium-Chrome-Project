package OOPConceptPart1;

public class LocalVsGlobalVariables {
    //Global variables-->Class Variables
	
	String name="Tom";//Global Variables --> Available throughout program
	int age=25;//To access global variables with in the method we have to create object of the class
	
	public static void main(String[] args) {
		
		LocalVsGlobalVariables obj=new LocalVsGlobalVariables();
		
	int i=10;//available with in main() --> Local Variable	
			System.out.println(i);
			System.out.println(obj.name);//object created and called by objectname.variable name
			System.out.println(obj.age);
			obj.sum();
			
	}

	public void sum() {
		int i=15;//local variable for sum()
		int j=20;//the scope of this age variable is only available within sum()
		
		System.out.println(i);
		System.out.println(j);
		
	}
	
	
}
