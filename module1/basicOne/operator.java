package basicOne;

public class operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//======>arithmetic operator //*/+-%
	    //	Operators=(do work)beside operand a 45
		int a =45;
		
		int b =55;
		int c=b%4+a;
		System.out.print(c);
		//precedence =
		
		//======>relational operator or comparison operator <><=>= true false only
		boolean torf=a>b;
		System.out.println(torf);	
		
		//=====>bitwise operator &(bitwise AND) ^(bitwise exclusive OR) |(bitwise inclusive OR) 
		boolean flag2 = 3>4 && 3<4; //shae ka hr wrong tr nae nout ka hr ma kyi tot buu 
		System.out.println(flag2);	
		//but
		boolean flag4 = 3>4 & 4==3; 
		System.out.println(flag4);	
		//0=false=+ 1=true=-
		
		//=====>logical operator  || && 
		int aa=10;
		int bb=9;
		int cc=8;
		boolean flag = aa>bb && bb>cc;
		boolean flag1= aa==bb ||aa>=bb;
		System.out.println(flag);	
		System.out.println(flag1);	
		//instance of operator == != (true false only)
		
	
		
		//======>shift operator
		//101000
		
		//1)	10=>1010 left shift so left ko pal
		//101
		int shiftnum=10<<3;
		//formula=> 10* 2^3
		//left shift so 
		System.out.println(shiftnum);
		int shiftnum1=20<<2;
		System.out.println(shiftnum1);
		int shiftnum2=15<<4;
		System.out.println(shiftnum2);
		
         // 2) 10=>1010 right shift so right ko pal
		 //0010
		int shiftnum3=10>>3;
		//formula=>10/2^2=2
		System.out.println(shiftnum3);
		int shiftnum4=20<<2;
		System.out.println(shiftnum4);
		int shiftnum5=20<<3;
		System.out.println(shiftnum5);
		
		//======>ternary operator
		int numm1=23;
		int numm2=34;
		int f =(numm1>numm2)?numm1:numm2;
		//true false
		System.out.println(f);
		
		
		
		//======>assignment operator operator+= sign
		int ak=45;
		ak= ak+45;
		ak+=30;
		System.out.println(ak);
		
//		k++;//postfix
//		k--;
//		--k;//prefix
//		++k;
//		
		 
		
		
		
		

	}

}
