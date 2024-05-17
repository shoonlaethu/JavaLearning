package Abstraction;
//kfc lo brand nae thu ya method tay ko share yin thone tat hr


interface Callable{
	int a =4;//constant //final
	void sum();//abstract method
	void cal();
	void sum2();//abstract method
	void sum3();//abstract method
	void sum4();//abstract method
	
	static int oki() {
		return 1;
	}
	default void sum5() {
		
	}
	
}
interface C{
	void cal();
}

public class interfaceEg{
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub-
           new Callable(){
        	   @Override
        		public void sum() {
        		   Callable.super.sum5();
        		
        			
        		}
        		@Override
        		public void sum2() {
        			
        			
        		}
        		@Override
        		public void sum3() {
        		
        			
        		}
        		
        		@Override
        		public void sum4() {
        			// TODO Auto-generated method stub
        			
        		}
				@Override
				public void cal() {
					// TODO Auto-generated method stub
					
				}
        		

           };
	}

	

}
