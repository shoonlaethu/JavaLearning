package controlStatement;

public class ifStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//syntax 
		//control flow statement
		
		//1...decision making statement
		//if & switch
		
		
        //		if(condition) {}=>if true,do something
		//boolean=> true or false
		//if statement
		int aa=10;
		//nothing output that is wrong
		if(aa<9) {
			System.out.println(aa<9);
		}
		
		
		//output that is right
        //		if(a>9) {
        //			System.out.println(a>9);
        //		}
		
		
		if(aa>9) {
			System.out.println((aa>9)+"right");
		}else{
			System.out.println((aa<9)+"wrong");
		}
		
		int mark=30;
		if(mark<40) {
			System.out.println("fail");
		}else if(mark>=40 && mark<80){
			System.out.println("pass");
		}else {
			System.out.println("destination");
		}
		
		//switch
		int a=1;
		switch(a) {
		  case 1:
			System.out.println(a+"is equal to 1");
			break;
		  case 2:
				System.out.println(a+"is equal to 2");
				break;
		  case 3:
				System.out.println(a+"is equal to 3");
				break;
		  case 4:
				System.out.println(a+"is equal to 4");
				break;
		  case 5:
				System.out.println(a+"is equal to 5");
				break;
			
		}
		
		String d="saturday";
		String str="is weekday";
		switch(d) {
		  case "monday":
			System.out.println(d+str);
			break;
		  case "tuesday":
			  System.out.println(d+str);
				break;
		  case "wednesday":
			  System.out.println(d+str);
				break;
		  case "thursday":
			  System.out.println(d+str);
				break;
		  case "friday":
			  System.out.println(d+str);
				break;
		  default:
			  System.out.println("weekend");
					
				
			
		}
				
      // nested if statement
		int k=45;
		if(k>40) {
			int g=10;
			if(g==k) {
				System.out.println(k+"is equal to"+g);		
			}else{
				System.out.println(k+"is not equal to"+g);
			}
		}else {
			System.out.println(k+"is greater than 45");
		}
		
		

	}

}
