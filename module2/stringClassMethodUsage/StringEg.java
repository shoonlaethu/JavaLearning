
package stringClassMethodUsage;
import java.util.Scanner;
import java.util.StringJoiner;

public class StringEg {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//--->string obj datatype
		
		char ch[]= {'h','e','l','l','o'};
		String string = new String(ch);
		System.out.println(string);
		System.out.println(string.length()); 
		
		//obj 2 ku built loe ma ya buu tu nay loe
		String ob=new String();
		String obj=new String();
		System.out.println(ob);
		System.out.println(obj);
		
		//String making 3 ways
		String name="hello";
		System.out.println(name);
		String message=new String("welcome to the golden land");
		System.out.println(message);
		char charr[]={'h','e','l','l','o'};
		String chArray=new String(charr);
		System.out.println(chArray);
		
		
		
		//--->String compare***
		
		
		String s1= "hel";
		String s2= "hel";
		System.out.println(s1==s2);	System.out.println(s1.equals(s2));
		
		
		String s3= "bcd";
		String s4= "abc";
		System.out.println(s3.compareTo(s4));
         //		b>a  kyi tae count ko pya tl code equal 0  
		
		//--->joining method****
		String f= "shoon";
		String l= "lae";
		System.out.println(f.concat(l));
		//string 2 ku ko add
		
		
		StringBuilder str22= new StringBuilder("hi");
		StringBuilder str11= new StringBuilder("guys");
		StringBuilder result=str22.append(str11);
		System.out.println(result);
		
		//obj nae format
		String result2=String.format("%s%s", f,l);
		System.out.println(result2);
		
		String result3=String.join("-",f,l);
		System.out.println(result3);
		
		
		StringJoiner output= new StringJoiner("_");
		output.add("my");
		output.add("name");
		System.out.println(output);
		
//		List<String> stringss=ArrayList("me","me","here");
//		String stt=stringss.stream().collect(Collection.joining("_"));
//		System.out.println(stt);
		
		
		//--->substring****
		
		String msg="hello,world";
		String res= msg.substring(6);
		System.out.println(res);//world
		
		String res1= msg.substring(6,9);
		System.out.println(res1);//wor
		
		String sentences[] = msg.split(",");
		System.out.println(sentences);
		
		
		
		//-->other methods****
		String strg= "hello there";
		System.out.println(strg.toUpperCase());
		System.out.println(strg.length());
		System.out.println(strg.trim().length());//space delete
		
		
		System.out.println("Enter your email");
		@SuppressWarnings("resource")
		String email = new Scanner(System.in).nextLine();
		if(email.endsWith("@gmail.com")) {
			System.out.println("your email is "+email);
			
		}else {
			System.out.println("please enter your email with specify type");
			
		}
		
		
		System.out.println("Enter your Name");
		@SuppressWarnings("resource")
		String namee = new Scanner(System.in).nextLine();
		if(namee.startsWith("Ma")) {
			System.out.println("Hello"+namee);
			
		}else if(namee.startsWith("Mg")) {
			System.out.println("Hello"+namee);
		}else {
			System.out.println("please enter your email with specify type");		
		}
		
		
		String nam="shoon lae";
		System.out.println(nam.charAt(6));
		System.out.println(nam.indexOf("sh"));
		
		
		
		
		
		
		
		
		
		
		
		

	}

	
}
