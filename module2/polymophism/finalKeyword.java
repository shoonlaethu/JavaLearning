package polymophism;
class Parent1{
	 final void cantshow() {
				System.out.println("show method with final");
	}
	  
	 void show() {
			System.out.println("show method with final");
     }


}
public class finalKeyword extends Parent1{
	//constant value pay loe ya
	//var so lae pyin loe ma ya
	private static final int Hello=567;
	
	//cant override because method mhr final mo loe
	void show(){
		System.out.println("child method");
	}
//	@Override
//	//errror code
//	void cantshow(){
//		System.out.println("child method");
//	}
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Hello);//567
		//var method overload cant class
		
		finalKeyword obj1= new finalKeyword();
		obj1.cantshow();
		obj1.show();

	}

}
