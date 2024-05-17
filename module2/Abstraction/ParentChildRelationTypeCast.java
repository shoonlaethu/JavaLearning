package Abstraction;
class GP{
	
}
class PP extends GP{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//data pay mhr ka (ParentChildRelationTypeCast) ka pyit lr tat obj ko pay
		
		ParentChildRelationTypeCast obj= new ParentChildRelationTypeCast(new PP());
		ParentChildRelationTypeCast obj1= new ParentChildRelationTypeCast(new GP());
		

	}
}

public class ParentChildRelationTypeCast {
	//other class ka GP ka obj ko yu chin tl
	GP instance;
	//e tot constructor build pay ya ml
	ParentChildRelationTypeCast(GP obj){
		instance=obj;
	}



}
