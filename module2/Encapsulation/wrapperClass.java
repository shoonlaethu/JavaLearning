package Encapsulation;
//primitive data type=>obj(autoboxing)
//obj to primitive data type(unboxing)
public class wrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =67;
		String message="hello";
		//hello ka obj lote loe ya tat method tay a myr kyi shi
		System.out.println(message.charAt(0));
//		message.
		
		Integer integer = a;
		//wrapper class
		System.out.println(integer.getClass().getName());
		
		String str= integer.toString();
		System.out.println(str.length());
		
		
		Float float1=6.7f;
		String num="455097652";
		Integer num2= Integer.valueOf(String.valueOf(float1));
		Integer numm= Integer.parseInt(num);
		System.out.println(numm);
		
		
		int num3=num2;
		System.out.println(num3);
	}

}
