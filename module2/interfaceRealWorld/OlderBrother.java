package interfaceRealWorld;
interface WorkFromMom{
	void homeWork();
	
}


public class OlderBrother implements WorkFromMom{
	@Override
	public void homeWork() {
		System.out.println("cleaning");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ako job ko pya tr yoe yoe
		OlderBrother obj= new OlderBrother();
		obj.homeWork();
		
		
//		parent class htel ka hr ko child class htel mhr lr htae tr e obj ko . p output
//		OlderBrother obj1= new OlderBrother();
//		obj1.homeWork();
		
		
		//YoungerBrother yae constructor ko create p OlderBrother yae job ko pay mhr
		//thu ka implements child class ka job pai p thar pyit tat obj ko share lite tl
		
		
		YoungerBrother obj4= new YoungerBrother(new OlderBrother());
		obj4.doIt();//job share
	}

}
