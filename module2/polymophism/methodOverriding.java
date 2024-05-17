package polymophism;
class Overwrite{
	Overwrite(String name){
		System.out.println("tHIS IS A parent class CONSTRUCTOR OVERWRITE" + name);
	}
	Overwrite(String name,int c){
		System.out.println("tHIS IS A parent class CONSTRUCTOR OVERWRITE" + name+c);
	}
}


//class Over{
//	//constructor overwrite
//
//	void sum(int a) {
//		System.out.println("Parent class  method"+a);
//	}
//
//
//}
public class methodOverriding extends Overwrite{ 
	methodOverriding(String name){
		//solve 1
		    super("shoon");
		    //parent mhr shi method variable nae sine
		
			System.out.println("tHIS IS A child class CONSTRUCTOR OVERWRITE"+name);
	
		
	}
	methodOverriding(String name,int c){
		//solve 1
		    super("shoon",4);
		    //parent mhr shi method variable nae sine
		
			System.out.println("tHIS IS A child class CONSTRUCTOR OVERWRITE"+name+c);
	
		
	}
	
	
//public class methodOverriding extends Over{ 
//	static int a=6;
//	
//	void useParentMethod(int a,int b) {
//		super.sum(a);
//	}
//	
//
//	@Override
//	void sum(int a) {
//		// TODO Auto-generated method stub
//		super.sum(a);
//	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		methodOverriding ob1=new methodOverriding();
//		ob1.sum();//thu nae close pyit tat hr lote parent hr ko extend lote pay mae ma kyi tat
		//name tu shi nay loe parent class ka ma shi tot override lote parent ko child ka override
//		int a=5;
//		System.out.println("override a=>"+a);
		
		//a lote lote say chin tl parent ko new method call super.child method
//		ob1.useParentMethod(6,7);
//		System.out.println("sum a=>"+a); 
		
		
		//OBJ TA khu built yin e obj yae constructor ka a lote"
		
		methodOverriding ob1=new methodOverriding(null);
		methodOverriding ob2=new methodOverriding(null,0);
		//child class obj ka parent class yae obj ko lae pine tl
		//constructor 2 ku a lote"
       //e tot parameter built yin 2 ku lone sr htae
		
		
		
		
		
		
		
        
	}

}
