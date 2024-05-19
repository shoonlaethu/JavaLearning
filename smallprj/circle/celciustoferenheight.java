package circle;
import java.util.Scanner;

public class celciustoferenheight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	     System.out.print("Celsius: ");
	     double celsius = sc.nextDouble();
		 double Fahrenheit =((celsius*9)/5)+32;
		 System.out.println("Temperature in Fahrenheit is: "+Fahrenheit);

	}

}
