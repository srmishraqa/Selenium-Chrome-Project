package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		
		//Array:To store similar datatypes values in an array variable
		
		//1.int array
		
		int i[]=new int[4];//size of array we have to define here.Here it is 4
		//lowest bound = 0
		//upper bound = n-1 where n is size of array
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		System.out.println(i[2]);
		
		//System.out.println(i[4]);//It will give ArrayIndexOutOfBoundException as index 4 does not exist here
		
		System.out.println(i.length);//will give the size of array
		
		System.out.println("**************");
		
		//print all the values of array we will have to use for loop
		
		for(int j=0;j<i.length;j++){
			System.out.println(i[j]);
		}
			System.out.println("**************");
		//2.Double array
						
			double d[]=new double[5];
			d[0]=11.11;
			d[1]=22.22;
			d[2]=33.33;
			d[3]=44.44;
			d[4]=55.55;
			
			for (int k=0;k<d.length;k++){
				System.out.println(d[k]);
				}
			
			//3.Character array
			
			//char c[]=new char[2];
			//c[0]='a';
			//c[1]='@';
			
			//System.out.println(c[1]);
			
			//4.boolean array
			
			//boolean b[]=new boolean[2];
			//b[1]=true;
			//b[2]=false;
					
			
			/*String s[]= new String[3];
			s[0]="Amazon";
			s[1]="Flipkart";
			s[2]="Snapdeal";
			
			System.out.println(s[2]);*/
			
			//All the above are one dimensional array
			
		//Disadvantages of array
			//1.size is fixed -- that's why 1D Array is static array--To Overcome of the above problem We Use Collections/Dynamic Array like ArrayList,HasTable
			//2.It stores only similar data types--Can't mix different data types and store-To Overcome of the above problem We Use Object Array
			
		
			//6.Object Array:(Object is a Class):Object array is used to store different data types values
			
			Object ob[]=new Object[6];
			
			        ob[0]="Tom";
					ob[1]=25;
					ob[2]=12.33;
					ob[3]="16/08/1990";
					ob[4]='M';
					ob[5]="London";
					System.out.println(ob[5]);
					System.out.println(ob.length);
			
			
			
		}
		
		
		
		
	}
	
	
	


