package Inheritance;
//Single Inheritance: Class B inherits from class A
class A {
 void methodA() {
     System.out.println("Method A");
 }
}

class B extends A {
 void methodB() {
     System.out.println("Method B");
 }
}

//Multilevel Inheritance: Class C inherits from class B, which inherits from class A
class C extends B {
 void methodC() {
     System.out.println("Method C");
 }
}

//Hierarchical Inheritance: Class D and E both inherit from class A
class D extends A {
    void methodD() {
        System.out.println("Method D");
    }
}

class E extends A {
 void methodE() {
     System.out.println("Method E");
 }
}
//Hybrid Inheritance: Class F inherits from classes C and D
class F extends C {
 void methodF() {
     System.out.println("Method F");
 }
 public void methodG() {
		// TODO Auto-generated method stub
	 System.out.println("Method G");
		
	}

public class Two_type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Single Inheritance: A subclass inherits from only one superclass. Java supports single inheritance for classes.

//		Multilevel Inheritance: This occurs when a subclass is derived from another subclass. For example, Class A extends Class B, and then Class B extends Class C, forming a chain of inheritance.

//		Hierarchical Inheritance: Multiple classes are derived from a single superclass. For instance, Class A is the superclass, and Class B and Class C both extend Class A.

//		Multiple Inheritance (Not directly supported in Java for classes): This is when a class inherits properties and behavior from multiple classes. 
//		However, Java doesn’t allow multiple inheritance for classes to prevent the diamond problem. It supports multiple inheritance through interfaces.

//		Hybrid Inheritance: This is a combination of multiple types of inheritance. For example, a mix of multilevel and hierarchical inheritance.
		
		
		    //single
		    B b = new B();
	        b.methodA(); // Output: Method A
	        b.methodB(); // Output: Method B

	        // Multilevel Inheritance
	        C c = new C();
	        c.methodA(); // Output: Method A
	        c.methodB(); // Output: Method B
	        c.methodC(); // Output: Method C

	        // Hierarchical Inheritance
	        D d = new D();
	        d.methodA(); // Output: Method A
	        d.methodD(); // Output: Method D

	        E e = new E();
	        e.methodA(); // Output: Method A
	        e.methodE(); // Output: Method E
	        
	        // Hybrid Inheritance
	        F f = new F();
	        f.methodA(); // Output: Method A (Inherited from class C through B)
	        f.methodB(); // Output: Method B (Inherited from class C)
	        f.methodC(); // Output: Method C
	        f.methodG(); // Output: Method G (Inherited from class G)
	        f.methodF(); // Output: Method F
		

	}

   }
}










