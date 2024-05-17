package polymophism;
class A{
	A obj() {
		return this;
		//this ka lat shi shi nay tat class yae obj Ais obj
	}
}
class B extends A{
	

	B obj() {
		 return this;
		//this ka lat shi shi nay tat class yae obj Bis obj
		 //String so tat obj so String return pyan
	 }
}

class SuperParent{
	String name="Mg";				
}
public class covarient extends SuperParent {
	String name="Ko";
	void show() {
		System.out.println(super.name);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A object1= new A();
		System.out.println(object1.getClass().getName());
		B object2= new B();
		System.out.println(object2.getClass().getName());
	
		
		covarient superkeyword=new covarient();
		System.out.println(superkeyword.name);
		//parent ka hr lo chin
		superkeyword.show();
		
		
		
		

	}

}

