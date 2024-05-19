package circle;
import java.util.Scanner;

public class bmiScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	      System.out.print("weight in kilogram: ");
	      double weight = sc.nextDouble();
	      System.out.print("height in meter: ");
	      double height = sc.nextDouble();
	      double BMI = weight / (height * height);
	      System.out.print("The Body Mass Index (BMI) is " + BMI + " kg/m");

	}

}
