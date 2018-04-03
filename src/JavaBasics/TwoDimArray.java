package JavaBasics;

public class TwoDimArray {

public static void main(String[] args) {
		
		String x[][]=new String[3][5]; 
		
		System.out.println(x.length);//Gives total number of rows
		System.out.println(x[0].length);//Gives total number of columns
		
		//1st Row
		x[0][0]="A";
		x[0][1]="B";
		x[0][2]="C";
		x[0][3]="D";
		x[0][4]="E";
		
		//2nd Row
		x[1][0]="A1";
		x[1][1]="B1";
		x[1][2]="C1";
		x[1][3]="D1";
		x[1][4]="E1";
		
		//3rd Row
		x[2][0]="A2";
		x[2][1]="B2";
		x[2][2]="C2";
		x[2][3]="D2";
		x[2][4]="E2";
		
		System.out.println(x[1][2]);
		System.out.println("******************************");
		//Print all the values od 2 dimensional array
		
		/*Logic:1st time row=0 column=0 to 4
		        2nd time row=1 column=0 to 4
		        3rd time row=2 column=0 to 4*/
		
		for(int row=0;row<x.length;row++){
			for(int column=0;column<x[0].length;column++){
				System.out.println(x[row][column]);
			}
		}

	}

}
