package controlStatement;

public class looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    //2...loop statement
		
		//---while loop mistake pyit tr nae a lote ma lote
		int a=9;
		 while(a<10) {
			 System.out.println(a);
			 a++;
		 }
		 
		 //---do
		 do {
			 System.out.println(a+"\t");
			 a++;
		 }while(a<15);
		
		 //---for
		  for(int i=5;i<10;i++) {
			  System.out.println(a+"\t");
			  
		  }
		  
		  //--for each loop
		  String names[]= {"a","b","c","d","e"};
			System.out.println(names[2]);
			
			System.out.println(names.length);
			for(int i=3;i<names.length;i++) {
				System.out.print(names[i]+"\t");
			}
			//reverse
			for(int i=names.length-1;i>=0;i--) {
				System.out.println(names[i]+"\t");
				
			}
			for(String name:names) {
				System.out.println(name);
			}
			
			//3...jump statement

	}

}
