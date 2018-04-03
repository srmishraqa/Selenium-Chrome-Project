package OOPConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(USBank.min_bal);//As static we have to call it by class name/Here by interface name
		//USBank.min_bal=200;//not allowed
		
		HSBCBank b=new HSBCBank();
		
		b.credit();
		b.debit();
		b.transferMoney();
		b.educationLoan();
		b.carLoan();
		b.mutualFund();
       
		System.out.println("******************************");
		
		//dynamic polymorphism = child class object can be referred parent interface variables
		
		USBank b1=new HSBCBank();//only overridden methods will be accessed
		b1.debit();
		b1.credit();
		b1.transferMoney();
		
		System.out.println("******************************");
		
		BrazilBank b2=new HSBCBank();
		b2.mutualFund();
	}

}
