package array;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    //array datatype tu tat data twe ko save pay mhr
		int numbers[]= {1,2,3,4,5};//initialize
//		String names[]=new String[] {"mg","ko","mone","tl","naw"};
	
		System.out.println(numbers[4]);
		numbers[2]=33;
		System.out.println(numbers[2]);
		
		String names[]= {"a","b","c","d","e"};
		System.out.println(names[2]);
		
		System.out.println(names.length);
		for(int i=3;i<names.length;i++) {
			System.out.print(names[i]+"\t");
		}
		//reverse
		for(int i=names.length-1;i>=0;i--) {
			System.out.println(names[i]+"\t");
			
		}
		for(String name:names) {
			System.out.println(name);
		}
		
		String cars[]=new String[3];
		cars[0]="toyota";
		cars[1]="marcedes";
		cars[2]="lancrusa";
		for(int i=0;i<cars.length;i++) {
			System.out.println(cars[i]);
		}
		
		//same datatype collection
		//one dimensional array
		//multi dimensional array
		//row column
//		int dNumbers[][]=new int[3][5];
		int dNumbers1[][]= {		
				
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15}
		};
		System.out.println(dNumbers1[2][4]);
		dNumbers1[2][4]=5;
		System.out.println(dNumbers1.length);
		for(int row=0;row<dNumbers1.length;row++) {
			for(int column=0;column<dNumbers1[row].length;column++) {
			System.out.println(dNumbers1[row][column]);
			}
		}
		
		for(int[] number:dNumbers1) {
			for(int n:number) {
				System.out.print(n+"\t");
			}
			System.out.println();
		}
		//jagged array
		
		
		
		
		

	}

}
