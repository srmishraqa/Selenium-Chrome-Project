package JavaBasics;

public class LoopsConcept {

	public static void main(String[] args) {
		
		//1.while loop:
		
		int i=1;//initialization part
		while(i<=10)//Conditional part
			{
			System.out.println(i);
			i++;//Increment or Decrement Part
		}
		
		//disadvantage of while loop:  if we don't write i++ then it will run as infinity loop
		
		System.out.println("*****************");
		
		//2.for loop:
		
		for(int j=1;j<=10;j++) //(initialization;Conditional part;Increment Part)
		{
			
			System.out.println(j);
		}
		
		System.out.println("*****************");
		
		for(int k=10;k>=1;k--)//(initialization;Conditional part;Decrement Part)
		{
			System.out.println(k);
		}
		
		
		
		
		
		
		
		

	}

}
