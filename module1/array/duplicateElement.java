package array;

public class duplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[]= {1,2,3,4,5,6,7,7};
		for(int i=0;i<numbers.length;i++) {
			for(int j=i+1;j<numbers.length;j++) {
				if(numbers[i]==numbers[j]) {
					System.out.println(numbers[j]);
				}			
			}			
		}

	}

}
