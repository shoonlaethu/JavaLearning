package circle;
import java.util.Scanner;

public class currentageScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	     System.out.print("Birthday year input: ");
	     int year = sc.nextInt();
	     int age=2023-year;
	     System.out.println("Your age is: "+age);

	}

}
