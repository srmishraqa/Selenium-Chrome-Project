package OOPConceptPart1;

public class WarapperClassConcept {

	public static void main(String[] args) {
		
		String x="100";
		System.out.println(x+20);
		
		//Data conversion from String to integer
		
		int i=Integer.parseInt(x);
		System.out.println(i);
		System.out.println(i+20);
		
		//Integer,Double,Character,Boolean --> wrapper classes
		
		//String to Double conversion
		String y="100.699";
		double d=Double.parseDouble(y);
		System.out.println(d);
		System.out.println(d+100.110);
		
		//String to Boolen
		String k="true";
		Boolean bl=Boolean.parseBoolean(k);
		System.out.println(bl);
		
		//int to String conversion
		int z=420;
		System.out.println(z+100);
		String s1=String.valueOf(z);
		System.out.println(s1+200);
		
		
		//String s2="100A";//not a pure numerical
		//Integer.parseInt(s2);
		
		// java.lang.NumberFormatException will appear
		
		
	}

}
