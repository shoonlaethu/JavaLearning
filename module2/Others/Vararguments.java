package Others;

public class Vararguments {
	
	static void name() {
		System.out.println("myName");
	}
	static void name(String name) {
		System.out.println("myName is" + name);
	}
	static void name(String fname,String lname) {
		System.out.println("myfName is" + fname +"mylName is" + lname );
	}
	
	//number bl lout htae2 ya tl
	static void show(Integer... numbers) {
		int a =0;
		for(Integer number:numbers) {
			a+=number;
		}
		System.out.println(a);
	}
	static void specifyName(String... names) {
	
		for(String name:names) {
			System.out.println(name);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		name("shoon","lae");
		name("shoonlay");
		show(2,3,5);
		specifyName("shoon","lae");

	}

}
