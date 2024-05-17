package Inheritance;
class Location{
	//other class yae lote saung chat ko a chr class ka phan 
	//step1
	String city;
	String state;
	String country;
	public Location(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
	
}
public class aggregation_Two {
	String name;
	int age;
	//stept2
	Location location;
	public aggregation_Two(String name, int age, Location location) {
		super();
		this.name = name;
		this.age = age;
		this.location = location;
	}
	void showData() {
		//. lote p phan yu
		System.out.print("Name is:"+name+"\nAge is"+age+"\t"+"Location is"+location.city+"\t"+location.state+"\t"+location.country);
	}



	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//step3
		Location local1=new Location("Yangon","Yangon","Myanmar");
		aggregation_Two agg=new aggregation_Two("Shoon",22,local1);
		agg.showData();
		
		aggregation_Two agg1=new aggregation_Two("lae",20,new Location("shan","shan","shan"));
		agg1.showData();
		
		
		

	}

}
