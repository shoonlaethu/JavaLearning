package array;

public class exfour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int[] numbers = {5, 3, 7, 1, 4};
		  int sum=0;
		  for (int i : numbers) {
	         sum+=i;
	        
	        }
		  double average = (double) sum / numbers.length;
		  System.out.print(average);
			

	}

}
