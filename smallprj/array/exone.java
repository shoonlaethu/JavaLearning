package array;

import java.util.Arrays;

public class exone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = {"Toyota", "BMW", "Ford", "Mazda"};
		
		int index=Arrays.binarySearch(name,"BMW");
		System.out.println(index);

	}

}
