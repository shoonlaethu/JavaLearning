 package Abstraction;
 
 //abstract
abstract class Abs{
	//body ma shi ya
	//implementattion ma pr ya
	//thu ko thone chin extend lote mha ya ml
	abstract void sum();//abstract method
	abstract void sum(int a);//abstract method
	abstract void calculate(int b);//abstract method
	
	
	//abstact method ma hok bl write tr moe body pr loe ya
	Abs(){};
	void add() {};
	static int calculate(){return 1;};

}
abstract class Ab extends Abs{
	@Override
	void calculate(int b) {
		
		System.out.println(b);
	}
}
class Sample extends Ab{
	@Override
	void sum(int a) {
		System.out.println(a);
	}
	void sum() {
		System.out.println("abstract calling other");
		
	}

}

class Sample1 extends Ab{
	@Override
	void sum(int a) {
		System.out.println(a);
	}
	void sum() {
		System.out.println("abstract calling other2");
		
	}
	
	//*** cant write lite this why ? senior abstract lote htr tat hr ko child class junior pyan khine tha lo pyit loe
//	@Override
//	void calculate(int b) {
//		// TODO Auto-generated method stub
//		System.out.println(b);
//		
//	}
}
//********************************************************************************************
//runable callable lo pay kya name ko
interface Runnable{
	int a =2;//constant //final
	void sum();//abstract method
	void cal();
	void sum1();//abstract method
	void sum3();//abstract method
	void sum2();//abstract method
	
	static int oki() {
		return 1;
	}
	default void sum5() {
		
	}
}
interface B{
	void cal();
}
//implements lote p pai aung lote tat method
class Interfaceextends implements Runnable,B{

	@Override
	public void sum() {
	
		
	}
	@Override
	public void sum1() {
	
		
	}
	@Override
	public void sum2() {
		
		
	}
	@Override
	public void sum3() {
	
		
	}
	@Override
	public void cal() {		
		System.out.println("interface calling");
	}
}
//interface
public class abstractionInfo extends Ab {
	@Override
	void sum() {
		System.out.println("abstract calling");
		
	}

	void sum(int a) {
		
		System.out.println(a);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//abstract //interface\
		
		
		
		 //abstract
		
		//(abstract class ka sinn thet lrr abstract method)
		//abstract method
		//abstract class
		
		//body ka thu ko extend lote tat class yae a twin mhr pl shi ya ml
		
		abstractionInfo obj=new abstractionInfo();
		obj.sum();
		obj.sum(2);
		
		Sample obj1=new Sample();
		obj1.sum();
		obj1.sum(2);
		obj1.calculate(7);
		
		Sample1 obj2=new Sample1();
		obj2.sum();
		obj2.sum(2);
		obj2.calculate(5);
		//**************************************************************************
		//interface
		//class ta khu ka multiple inheritance lote chin yin extends abstract method nae ma ya buu interface yay method nae pl lote loe ya
		
		Interfaceextends objj= new Interfaceextends();
		objj.cal();
		
		new Runnable() {
			@Override
			public void sum() {
			//kfc()//fried chicken thu myr name yu p lote
				System.out.println("interface calling");
			}
			@Override
			public void sum1() {
			
				System.out.println("interface calling1");
			}
			@Override
			public void sum2() {
				System.out.println("interface calling2");
				
			}
			@Override
			public void sum3() {		
				System.out.println("interface calling3");
			}
			@Override
			public void cal() {		
				System.out.println("interface calling cal");
			}
			

	}.sum();
 }
}