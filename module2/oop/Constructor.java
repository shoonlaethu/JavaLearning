package oop;

public class Constructor {
	Constructor(){
		//constructor shi tl but nout kwel ka a lote lote
		System.out.println("constructor behind class constructor");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//obj ta ku pyit phoe constructor lo tl eg home pyit phoe ကန်ထရိုက်တာ
		//method nae tu pay mae return type ma pr buu
		//constructor yae name ko class name nae tu aung pay ya ml
		//syntax for constructor
		//ClassName(params){impl}
		
		/*
		 * Construtor
		 * 1.Default Construtor/zero argument constructor:className(){}
		 * 2.Parameterized Constructor                   :className(int number){}
		 * 
		 */
//		***constructor has no return type
		Constructor obj=new Constructor();		
		Person1 person1=new Person1(5);
	
		person1.doSomething();
		//*******************************************************//
		
		//obj installation by constructor
		Student student=new Student("shoon",20,"male");
		System.out.println(student.name.toUpperCase());
		Student student1=new Student("lae",20,"male");
		System.out.println(student1.name.toUpperCase());
		
		//*******************************************************//
		//method vs construtor obj install
		//more reduce line than method
		//in method
//	    ParameterMethod.calculate(4,6);
//		class ParameterMethod{
//			static void calculate(int num1,int num2) {	
//				System.out.println(num1+num2);
//			}						
//		}
		

		
		

	}

}
class Person1{
	//default or 0 arguments
	Person1(){
		System.out.println("hi");
	}
	
	//perameterized
	Person1(int a){
		System.out.println("this is"+a);
	}
	void doSomething() {
		System.out.println("method");
	}
}
//*******************************************************//

//obj installation by constructor
class Student{
	String name;
	int age;
	String gender;
//	Student(){
//		
//	}
	//parameter ma shi yinyay ya tat code
	Student(String n,int a,String g) {
		name=n;
		age=a;
		gender=g;
	}
}
