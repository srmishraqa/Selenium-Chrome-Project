package CommonPrograms;

public class ProgramOnIncrementAndDecrementOperators {

	public static void main(String[] args) {
		
		int i=7;
		int j= (i++)+(++i)+(i++);
		System.out.println(i);
		System.out.println(j);
		
		int k=67;
		int l=(--k)+(k--)+(--k)+(--k);
		System.out.println(k);
		System.out.println(l);
	}

}
