package oop;
public class oopintro {
	
	/*
	 * 
	 * global variable attributes properties state fields data members
	 * 
	 * */
	//instance vs static variable
	int number2=5;//global variable(main method yae apyin class yae a htel mhr yay)
	static int number3=6;//static variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Object-oriented programming (OOP) is a computer programming model 
//		that organizes software design around data, or objects, rather than functions and logic.
		
		//___structure of object-oriented programming?
		

		//(human)Classes are user-defined data types that act as the blueprint for individual objects, attributes and methods.
		//(name)Objects are instances of a class created with specifically defined data. 
		//              Objects can correspond to real-world objects or an abstract entity. When class is defined initially, 
		//              the description is the only object that is defined.
		//(email,address)Methods are functions that are defined inside a class that describe the behaviors of an object. 
		//                      Each method contained in class definitions starts with a reference to an instance object. Additionally, the subroutines contained in an object are called instance methods. Programmers use methods for reusability or keeping functionality encapsulated inside one object at a time.
		//(verify,send mail)Attributes are defined in the class template and represent the state of an object. 
		//                          Objects will have data stored in the attributes field. Class attributes belong to the class itself.

		
		//This characteristic of data hiding provides greater program security and avoids unintended data corruption.
		//Abstraction=> Objects only reveal internal mechanisms that are relevant for the use of other objects, hiding any unnecessary implementation code. The derived class can have its functionality extended. This concept can help developers more easily make additional changes or additions over time.
		//Inheritance=> Classes can reuse code from other classes. Relationships and subclasses between objects can be assigned, enabling developers to reuse common logic while still maintaining a unique hierarchy. This property of OOP forces a more thorough data analysis, reduces development time and ensures a higher level of accuracy.
		//Polymorphism=> Objects are designed to share behaviors and they can take on more than one form. The program will determine which meaning or usage is necessary for each execution of that object from a parent class, reducing the need to duplicate code. A child class is then created, which extends the functionality of the parent class. 
		//              Polymorphism allows different types of objects to pass through the same interface.
		
		
		//obj => state(properties),behavior
		
		//**main method {} htel mhr var yay local		
		
		int number1=4;//instance variable//local variable
		System.out.print(number1);
		
//		instance variable ko call obj build
		
		//class name 
		//type  object name=new constructure;(new keyword+constructor name)
		
		//instance output
		oopintro oopintro=new oopintro();
		System.out.print(oopintro.number2);
		
		//static
		System.out.print(oop.oopintro.number3);
		System.out.print(number3);
		
		Company company=new Company();
		System.out.print(company.name);
		System.out.print(company.employeeNumber);
	
	}
}
