package OOPConceptPart2;

public interface USBank {
	
	int min_bal= 100;//static and final the value of this variable we cannot change
	
	public void credit();//Only method body;no method implementation
	
	public void debit();
	
	public void transferMoney();
		
	//In interface we can declare the variables,All variables are by default static in nature
	//Variables value will not be changed and it's static and final 
	//no static methods are allowed in the interface
	//no main method is allowed in the interface
	//abstract in nature --> cannot create object of the interface

}
