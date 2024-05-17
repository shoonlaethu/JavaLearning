package oop;
class Allian{
	String name;
	int age;
	
}

public class objnitialization3_4 {
	//instance variable
	int number1;
	String someText;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;//variable initialization
		System.out.println(num);
		
		
		//==>obj create
		//obj instance reference
		//instance call yin obj built ya
		objnitialization3_4 obj= new objnitialization3_4();
		
		
		//properties tay ko value htae initialization
		//3method 
		//direct reference,by method,by constructure
		
		//=>obj initialization
		//1.direct reference
		
	    //default value string is null ,int is 0
		System.out.println(obj.number1);
		System.out.println(obj.someText);
		obj.number1=3;
		obj.someText="hi";
		System.out.println(obj.number1);
		System.out.println(obj.someText);
		
		Allian alian=new Allian();
	    //default value string is null ,int is 0
		System.out.println(alian.name);
		System.out.println(alian.age);
		alian.name="thura";
		alian.age=1000;
		System.out.println(alian.name);
		System.out.println(alian.age);

	}

}

