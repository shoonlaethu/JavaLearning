package circle;
import java.util.Scanner;

public class circlescanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter your radius?");
		double radius = sc.nextDouble();
		double areaCircle =3.14 * radius * radius;
		System.out.println("Result "+areaCircle);

	}

}
