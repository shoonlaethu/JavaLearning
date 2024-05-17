package Inheritance;
class Animals{
	String name;
	void eat() {
		System.out.println("Eating");
	}
	
}
class Cat extends Animals{
	String name ="Meow";
	double weight=5;
	void jump() {
		System.out.println("Jumping");
	}
	
	
}
class Dog extends Animals{
	String name ="Woff";
	int age=3;
	String color="white";
	void play() {
		System.out.println("Playing");
	}
	
}
//*******************************************************//
class Grandparent{
	void display() {
		System.out.println("hihi");
	}
	//workn
	Grandparent(){
		System.out.print("constructor");
	}
	
}
class Parent extends Grandparent{
	int a;
	int b;
	int c;

}

public class One_intro extends Parent{
	//One_intro===childclass

	void show() {
		System.out.println("Show method is working");
	}

	public static void main(String[] args) {
		
		Dog dog=new Dog();
		System.out.println(dog.age);
		System.out.println(dog.color);
		dog.play();
		
		Cat cat=new Cat();
		System.out.println(cat.weight);
	
		cat.jump();
		cat.eat();
		//*******************************************************//
		
		One_intro obj=new One_intro();

		System.out.println(obj.a);
		System.out.println(obj.b);
		obj.show();
		obj.display();//from grandparent class
		
		Parent objp=new Parent();
		System.out.println(objp.a);
		System.out.println(objp.b);
		System.out.println(objp.c);
	    obj.display();
		//*******************************************************//
//		inheritance 5 ku
//		single,multi level,hierarchical,multiple,hybrid
//		single inheritance 
//		class 2ku htel nae extend lote tr
//		multi level inheritance ka class 3 ku nae aa lote lote
		
		
		
		
	}

}
