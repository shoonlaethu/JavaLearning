package polymophism;
class Parent7{
	void add() {
		System.out.println("Parent add method");
	}
}
public class runtimeCompiletime extends Parent7{
	//override yay loe parent ka a lote ma lote tot buu
    @Override
	void add() {
		System.out.println("child add method");
	}
	static void sum(int number) {
		System.out.println(number+number);
	}
	static void sum(double num) {
		System.out.println(num+num);
	}
	
	//type promotion
	static void sum(int num1,int num2) {
		System.out.println(num1+num2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(50);
		sum(1.2);
		sum(1,2);
		
		runtimeCompiletime obj1=new runtimeCompiletime();
		obj1.add();
		//overloading static ka compile lote nay tat a chain a twin thi ya
		//obj build,override ka run time kya mha thi ya
		

	}

}
