package Abstraction;

//***int=>child  double=>parent
class Parent{
	void function() {
		
	}
}

class Child extends Parent{
	void method1() {
		
	}
	
}
public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2;
		System.out.println(a);
		
		//water from bottle pour into zalone
		//widening casting automatic
		//nae tr ko myr htel htae
		double b=a;
		System.out.println(b);
		
		//water from zalone pour into bottle need interface katot
		//narrowing cast
		int c=(int)b;
		System.out.println(c);
		
		
		Child child= new Child();//up casting
		child.function();
		child.method1();
		
		Parent child1=new Child();//
		child1.function();
		
		Child child3=(Child)new Parent();//downcasting
		child3.function();
		child3.method1();
		

	}

}
