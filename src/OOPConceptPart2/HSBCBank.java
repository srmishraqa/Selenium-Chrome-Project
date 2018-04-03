package OOPConceptPart2;

public class HSBCBank implements USBank, BrazilBank//achieving multiple inheritance
     //is-a-relationship

    {

	//if a class is implementing any interface ,then it is mandatory to define or override all the methods of interfaces
	//Also a class can have their own defined methods
	
	//overriding from USBank interface
    public void credit() {
    	System.out.println("HSBC--Credit--from US Bank");
    }
	
	public void debit() {
		System.out.println("HSBC--Debit--from US Bank");
	}
	
	public void transferMoney() {
		System.out.println("HSBC--transferMoney--from US Bank");
	}
	
	//Separate Method of HSBC Bank Class
	public void educationLoan() {
		System.out.println("HSBC--educationLoan");
	}
	
	public void carLoan() {
		System.out.println("HSBC--carLoan");
	}
	
	//overriding from BrazilBank interface
	public void mutualFund() {
		System.out.println("HSBC--Mutual Fund--from Brazil Bank");
	}
}
