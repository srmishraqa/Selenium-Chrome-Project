package JavaBasics;

public class IncrementAndDecrementOperator {

	public static void main(String[] args) {
		
	//++
    //--
		
		int i=1;
		int j=i++;//post increment
		
		//It means first give the value of i here 1 to j and then increse it by 1
		//so j=1 and i=2
		
		System.out.println(i);
		System.out.println(j);
		
		int a=2;
		int b=++a;//pre-increment
		
		System.out.println(a);
		System.out.println(b);
		
		int w=10;
		int x=w--;//post decrement
		
		System.out.println(w);
		System.out.println(x);
		
		int y=10;
		int z=--y;//pre decrement
		
		System.out.println(y);
		System.out.println(z);
		
		
		
		
	}

}
