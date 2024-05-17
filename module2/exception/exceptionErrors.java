package exception;

import java.util.Scanner;

public class exceptionErrors {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//--->Input mistake errors
		
		//user ka mistake tay ko htae yin lote pay tr
		System.out.println("Enter your Number");
		@SuppressWarnings("resource")
		String userInput = new Scanner(System.in).nextLine();
		System.out.println(userInput);
		//exception paw tr yin nout ka code tay ma run tot buu
	
       //System.out.println("Enter your Number");
		
		
		
		//--->Arithmetic Exception errors
		
		System.out.println("program begin");
		int a=23;
		int b=0;
		
		
		try {
			int result=a/b;
			System.out.println(result);
	     
		}catch (Exception exception){
			//above ka a lote ma lote yin d job ko lote pay pr
			int result1=a/b+4;
			System.out.println(result1);
           //			System.out.println(exception);
           //			System.out.println(exception.getMessage());
			System.out.println("can't divided by zero");
		}
		
		//exception catch loe below ka code tay a lote lote tl
       	System.out.println("end program");
       	
       	
		//--->Null Pointer Exception errors
       	
    	String str=null;
		int count=str.length();
		System.out.println(count);
		
		
		//--->Number format exception errors
		String stri="abc";
		int number=Integer.parseInt(stri);
		System.out.println(number);
		
		//--->array index out of bound Exception
		
		int nummm[] = {1,2,3,4,5,7,8};
		nummm[9]=32;
		System.out.println(nummm[9]);
		
		
		//-->multiple exception catch Block
		
		int c=3;
		int d=0;
		
		try {
			int resss=c/d;
			System.out.println(resss);
			
			int numberr[]=new int[7];
			System.out.println(numberr[9]);
			
			String fname=null;
			System.out.println(fname.length());
			
			
		}catch (ArithmeticException e){
			
			System.out.println(e.toString());
		
       }catch (ArrayIndexOutOfBoundsException e){
			
			System.out.println(e);
			      
	   }catch (Exception exception){
		
			System.out.println("general exception");
	   }
		
		//exception twae tat a hti pl a lote2 pay thu nout ka error ma kyi
		 
		
		
		//--->NestedTryBlock Exception errors
		
		try {
			try {
				int resss=c/d;
				System.out.println(resss);			
			}catch (ArithmeticException e){	
				System.out.println(e.toString());
			}
			
			try {
				int numberr[]=new int[7];
				System.out.println(numberr[9]);
			
	        }catch (ArrayIndexOutOfBoundsException e){
				
				System.out.println(e);
	        }
		
			
		}catch (Exception exception){			
				System.out.println("general exception");
		 }
		//*******************8
        try {
    		try {
    			try {
    				try {
    					int resss=c/d;
    					System.out.println(resss);			
    				}catch (ArithmeticException e){	
    					System.out.println("first handling");
    				}
    			}catch(NullPointerException e) {
    				System.out.println("second handling");
    			}
    			
    		}catch (ArrayIndexOutOfBoundsException e){
    				
    				System.out.println("third handling");
    	    }
			
		}catch (Exception exception){			
				System.out.println("general exception");
		}
        
        
        //--->finally block
        //exception ko twae2 ma twae2 a lote2
	    //program mhr ma pyit yin thone internet connection kyount pyit2 ta chr page ko youke chin yin thone tl
        
        int e=3;
		int f=0;
		
		try {
			int resss=e/f;
			System.out.println(resss);				
		}catch (Exception e1){			
					System.out.println(e1.getCause());
					
		}finally {
			System.out.println("everytime");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
	

}
