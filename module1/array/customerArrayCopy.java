package array;

public class customerArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("copy text");
		int numbers[]= {9,2,1,6,5,3,7,8};
		int copy[]=new int[numbers.length];//size tu ya ml copy lote yin
		
//		before copy 
		for(int j=0;j<copy.length;j++) {
			System.out.print(copy[j]+"\t");
				
	    }	
		System.out.println();
		
//		after copy
		for(int i=0;i<numbers.length;i++) {
			copy[i]=numbers[i];
			System.out.print(copy[i]+"\t");
				
	    }	
		System.out.println();
		
		//largest smallest
		System.out.println("largest smallest");
		int largestNumber=0;
		for(int k=0;k<numbers.length;k++) {
			if(numbers[k]>largestNumber) {
				largestNumber=numbers[k];		
			}
		}
		System.out.println(largestNumber);
		
		
		int smallestNumber=1;
		for(int k=0;k<numbers.length;k++) {
			if(numbers[k]<smallestNumber) {
				smallestNumber=numbers[k];		
			}
		}
		System.out.println(smallestNumber);
		
		
		//ascending and descending
		System.out.println("ascending and descending");
	    int valueNow=0;
		for(int ii=0;ii<numbers.length;ii++) {
			for(int jj=0;jj<numbers.length;jj++) {
			  if(numbers[ii]>numbers[jj]) {
				  valueNow=numbers[ii];
				  numbers[ii]=numbers[jj];
				  numbers[jj]=valueNow;
			  }
			}
		}
		for(int ii=0;ii<numbers.length;ii++) {
			System.out.print(numbers[ii]+"\t");
		}
		
		System.out.println("largest smallest");
		System.out.println(numbers[numbers.length-4]);
	}

}
