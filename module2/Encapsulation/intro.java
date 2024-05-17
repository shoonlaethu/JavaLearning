package Encapsulation;
//homepg model
class Model{
	//data tay htr
	//thu yae data ko yu say chin tae lu ko pl yu say chin yin thone
	
//	data member  field hr ko private
//	e htel ka data ko modified lote chin => getter setter or constructor
	
	private int id;
	private String name;
	private int age;
	
	
	//getter a chr class ka data take tr
	//setter a chr class ka data lrr htr tr
	
	//alt + insert key
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
}
class Model2{
	//getter setter ma lote chin yinn constructor build ya ml
	private int id;
	private String name;
	private int age;
	public Model2(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
}
public class intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Model obj1= new Model();
		obj1.setId(2);
		System.out.println(obj1.getId());
		
	
		
		Model2 obj= new Model2(1,"Ma",30); 
		System.out.println(obj);
		
	}

}
