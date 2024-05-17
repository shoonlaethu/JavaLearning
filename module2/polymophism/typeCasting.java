package polymophism;
class Type{
	int num1=70;
	void sum() {
		System.out.println("Parent sum method is working");
	}
}

public class typeCasting extends Type{
	int num1=50;
	
	@Override
	void sum() {
		System.out.println("Child sum method is working");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//byte short int long float double
		int a=5;
		double b=(int)a;//widening casting//smaller to larger change no problem
		int c=(int)b;//narrowing casting//larger to smaller change yin problem tat tl e tr kyount ma tat aung (int) htae pay ya
		
		
		//typeCasting child ko type so tat parent htel htae tr
		typeCasting typeCasting1=new typeCasting();
		Type type1=(Type)typeCasting1;//widening casting //upcasting //parent class child class htel htae loe ma ya
		System.out.println(type1.num1);
		typeCasting childObj1=(typeCasting)type1;//
		childObj1.sum();
		
		
		
		//narrowing casting//error parent to  child cant
		Type type2=new Type();
		typeCasting typeCasting2=(typeCasting)type2;
		System.out.println(typeCasting2.num1);
		
		Type childObj2=(Type)typeCasting2;//
		childObj2.sum();
		

	}

}
