package Inheritance;
class Mark{
	int speakingMark;
	int writingMark;
	public Mark(int speakingMark,int writingMark) {
		this.speakingMark=speakingMark;
		this.writingMark=writingMark;
	}
}

public class aggreStudent {
	int id;
	String name;
	Mark mark;
	public aggreStudent(int id,String name,Mark m) {
		this.id=id;
		this.name=name;
		this.mark=m;
	}
	void show() {
		System.out.println("id "+this.id+"\t name"+this.name+"\t mark"+this.mark);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mark myan=new Mark(50,60);
		Mark eng=new Mark(90,50);
		Mark math=new Mark(80,70);
		aggreStudent student1=new aggreStudent(1,"shoon",myan);
		aggreStudent student2=new aggreStudent(2,"hnin",eng);
		aggreStudent student3=new aggreStudent(3,"mya",math);
		
		student1.show();
		student2.show();		
		student3.show();
		
		

	}

}
