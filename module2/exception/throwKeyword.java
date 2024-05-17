package exception;
@SuppressWarnings("serial")
class CustomException extends Exception{
	CustomException(String str){
		super(str);
	};
}
public class throwKeyword {
	static void check(int nummb) {
		if (nummb>30) {
			/**	
			 * No need to write like this
			 * 
			 * 	String str=null;
			 * 
			 * int count=str.length();
			 * System.out.println(count);
			 */

			throw new ArithmeticException("arri3");
		}else {
			System.out.println(nummb);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//--->ThrowKeyword****
		
				//exception ta khu pyit aung easy lote method
				
				//ko pyit chin tat exception
				
				
				try {
				   check(5);			
				}catch (Exception e13){			
				   System.out.println(e13);							
				}
				
				//--->CustomException****\
				//user define & pre define 
				
				
				//--->Differences betweeen throw and throws
				
                //throw ka exception 1 ku ko kobr ko create
				
				
				try {
					throw new CustomException("this is custom");
						
				}catch (CustomException e1){			
							System.out.println(e1.getCause());
							
				}
			
				

	}

}
