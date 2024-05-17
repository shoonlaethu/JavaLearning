package array;

public class arraycopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[]= {1,2,3,4,5,6,7,7,8,4};
		System.out.println(numbers.getClass().getName());
//		ko copy kuu mae array yae size
		int others[]=new int[5];//5 ku kuu mhr
		System.arraycopy(numbers, 3, others, 1, 4);
	
		//array  \integer (array yae position sa chin tat)\htae mae hr array obj a kon\ destpos \length
		for(int j=0;j<others.length;j++) {
				System.out.print(others[j]+"\t");
					
		}	
		System.out.println();
		
		int another[]=others.clone();
		for(int j=0;j<another.length;j++) {
			System.out.print(another[j]+"\t");
				
	}	
		
	}

}
