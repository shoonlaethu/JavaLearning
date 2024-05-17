package oop;

public class thiskeyword_last {
	thiskeyword_last(){
		System.out.println("hidden constructor");
	}
	
	//instance initializar block
	{
		//obj ta ku build yin a yin sone lote constructor htet
		System.out.println("instance initializar block");
	}
	//static initializar block
	static {
		//main method htet a yin saw lote tl static ka
		System.out.println("instance initializar block");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassName obj=new ClassName(1,"Java",4000);
		obj.show();
	
	//*******************************************************//
		
		//initializer blocks
		//1.instance block
		//2,static block
		
		thiskeyword_last obj1=new thiskeyword_last();
		
		

	}

}
class ClassName{
	int id;
	String name;
	double fees;
	
	//constructor
	
	public ClassName(int id,String name,double fees) {
		this.id=id;
		this.name=name;
		this.fees=fees;
	}
	void show() {
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(this.fees);
	}
	
}
