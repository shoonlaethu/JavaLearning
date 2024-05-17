package oop;
import java.util.Scanner;
class Fruits{
	String name;
	String color;
	String size;
	
}
class Students{
	int id;
	String name;
	int age;
	static String schoolName="CodeWall";
	
}
//*******************************************************//
class Method{
	//instance method //non_instance method
	
	//syn:returntype method name()
	void display() {
		System.out.println("this is a display");
	}

	 static void show() {
		System.out.println("this is a display");
	}
}
//*******************************************************//
class Calculation{
	static void calculate() {
		int a=3;
		int b=4;
		int result=a+b;
		System.out.println("this is a+b"+result);
	}
	static int sum() {
//		System.out.println("sum method is workintg");
		calculate();
		return 3;
	}
	static String name() {
		System.out.println("Another one");
		return "thuralynn";
	}
}
//*******************************************************//
class Returnif{
	
	static String validate() {
//		System.out.println("Enter your age?");
//		Scanner scanner = new Scanner(System.in);
//		int userInput=scanner.nextInt();
		int userInput=18;
		if(userInput>18) {
			return "can";
		}
//		else {
//			return "can't";
//		}
		return "can't";
		
	}
	static void validate1() {
//		System.out.println("Enter your age?");
//		Scanner scanner = new Scanner(System.in);
//		int userInput=scanner.nextInt();
		int userInput=18;
		
		if(userInput>18) {
			System.out.println("You can vote");
		}
		else {
			System.out.println("You can't vote");
		}
		
		
	}
	
}
//*******************************************************//

class ReturnObject{
	static int number() {	
		return 5;
	}
	static String msg() {
		//String so tat class ka pyit lr tat msg ko return pyan
		System.out.println("helloworld");
		return "thuralynn";
	}
	static Person person() {
		//Person so tat class ka pyit lr tat obj ko return pyan
		return new Person();
	}
}
class Person{
	String name="Me";
}
//*******************************************************//
class ParameterMethod{
	static void calculate(int num1,int num2) {	
		System.out.println(num1+num2);
	}
	static void fullName(String firstName,String lastName) {	
		System.out.println((firstName+lastName).toUpperCase());
	}
	
	
}

public class instancevariable4 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//===>INSTANCE VARIABLE
		
		//direct reference
		//for fruit
		Fruits fruit1=new Fruits();
		fruit1.name="Apple";
		fruit1.color="red";
		fruit1.size="small";
		System.out.println(fruit1);//hash code nae hwet lr
		
		Fruits fruit2=new Fruits();
		fruit2.name="Orange";
		fruit2.color="orange";
		fruit2.size="big";
		System.out.println(fruit2);
		
		//obj ka 1 youke chin si nae sine
		//fruit1 mhr pyin yin fruit1 mhr pl thet youke tl fruit2 paw ma thet youke buu
		fruit1.name="Tomato";
		System.out.println(fruit2);
		System.out.println(fruit1);
		//*******************************************************//
		
		//===>STATIC VARIABLE
		//for student
		Students student1=new Students();
		student1.id=1;
		student1.name="shoon";
		student1.age=20;
		System.out.println(student1);
		
		Students student2=new Students();
		student2.id=2;
		student2.name="lae";
		student2.age=21;
		System.out.println(student2);
		
		Students.schoolName="Tech";
		System.out.println(student1.schoolName);
		System.out.println(Students.schoolName);
		//*******************************************************//
		
		//==>METHOD
		//syntax of method
		//returnType methodName(parameter{}
		
		//type
		//predefined/userdefined
		//predefined method eg.print() jdk ko invented lote tat lu ka lote pay lite tr
		Method method=new Method();
		method.display();
		
		
		//static (class htel ka . tan kall)
		Method.show();
		
		//*******************************************************//
		//*****//
		//static *** yay yin obj built sa yr ma lo tot buu
		//method kwel method
        //1file2oop3signiture
		//method signiture 2 ku
		//return pyan ma pyan ,parameter pr ma pr
		
		
		//method ko khine tl but void moe return ma pyan output ma hwet
//		Calculation calculate=new Calculation();
	    Calculation.calculate();
        int result = Calculation.sum();
        System.out.println(result);
        System.out.println(Calculation.sum());
        System.out.println(Calculation.name());

        String result1 = Returnif.validate();
        System.out.println("You " + result1 + " vote");
        Returnif.validate1();
		
		
		//*******************************************************//
        
        int a=5;
        //ClassNameobj
        String sartar ="Nay kaung lar";
//        ReturnObject obj=new ReturnObject();
        //class ka pyit lr tat obj ko save
 
        System.out.println(ReturnObject.person().name);
    	//*******************************************************//
        //argument 4,6
        //create lote nay tat a chain mhr parameter
        //
        
        ParameterMethod.calculate(4,6);
        ParameterMethod.fullName("Shoon", "Lae");
        //printfunction so lae void tay nae return pyan user kyite that lout htae
      //*******************************************************//
        
        //obj initialization 
        //direct reference vs method
        //direct reference nae yay tr htet method ka po kg tl
        //code line reduce mistake reduce
        
        
   
     
        		
		

	}



}
