package CommonPrograms;
//Program to check driving license eligibility
public class EligibiltyCheck {

	public static void main(String[] args) {
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter the age");
		int i=sc.nextInt();
		
		if(i<18) {
			System.out.println("He/She is a minor--Not eligible For Driving License");
		}
			
		else if(i>=18 && i<=60){
			System.out.println("Not a minor--eligible For Driving License");
		}
		
		else {
			System.out.println("Senior Citizen--Not eligible For Driving License");
		}
		
	}

}
