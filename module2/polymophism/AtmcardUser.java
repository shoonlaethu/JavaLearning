package polymophism;
class Person1{
	int id;
	String name;
	Person1(int id,String name){
		this.id=id;
		this.name=name;
	}
}

public class AtmcardUser extends Person1 {
	double amount;
	AtmcardUser(double amount,int id,String name){
//		super(1,"shoon");
		super(id,name);
		this.amount=amount;
	}
	void show() {
		System.out.println(id+"=>"+name+"=>"+amount);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//superkeyword using
		
		AtmcardUser  obj1= new AtmcardUser(2300,1,"shoon");
        obj1.show();
	}

}
