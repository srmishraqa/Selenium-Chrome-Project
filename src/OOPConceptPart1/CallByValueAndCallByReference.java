package OOPConceptPart1;

public class CallByValueAndCallByReference {
      int p;
      int q;
	public static void main(String[] args) {
		
		CallByValueAndCallByReference obj=new CallByValueAndCallByReference();
		
		int x=10;
		int y=20;
		
		int d=obj.testSum(x, y);//Call by value/Pass by value or one copy of a and b will be given to a and b
		
		System.out.println(d);
		
		
		obj.p=50;//non static 
		obj.q=60;//non static 
		
		//Before Swap
	    System.out.println(obj.p);
	    System.out.println(obj.q);
        
		obj.swap(obj);
		
		//after Swap
		System.out.println(obj.p);
		System.out.println(obj.q);
	}
	
	
	public int testSum(int a,int b) //here x & y copy will be passed to a & b
	{
		a=30;
		b=40;
		
		int c=a+b;//c calculation will be based on latest value of a & b i.e. a=30 and b=40
		return c;
		
	}
	
	//Call By Reference
	public void swap(CallByValueAndCallByReference t) //obj reference value is given to t
	{
		int temp;
		temp=t.p;//temp=50
		t.p=t.q;//t.p=60
		t.q=temp;//t.q=50
		
	}
	

}
