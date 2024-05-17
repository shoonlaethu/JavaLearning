package polymophism;
class TestInstance{
	
}
public class instanceOfOperator extends TestInstance{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//bl class ka sinn lar tat obj lae thi chin yin thone tl
		
		instanceOfOperator obj=new instanceOfOperator();
		instanceOfOperator obj1=null;
		System.out.println(obj instanceof instanceOfOperator);
		System.out.println(obj1 instanceof TestInstance);
		
		
	}

}
