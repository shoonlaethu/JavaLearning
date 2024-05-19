package array;

import java.util.Scanner;

public class extwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10]; 

        System.out.println("Enter 10 integers:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt(); 
        }

        System.out.println("Entered integers:");

        for (int number : numbers) {
            System.out.println(number);
        }      

	}

}
