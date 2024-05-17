package Inheritance;

class Engine{
	void run() {
		//car 1 sii chin si yae engine no
		 System.out.println("System is started"+this.hashCode());
	}
}

public class aggreCar {
	Engine engine;
	
	public aggreCar(Engine engine) {
		this.engine=engine;
		
	}
	void start() {
		engine.run();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engine engine1=new Engine();
		aggreCar car1 =new aggreCar(engine1);
		
		Engine engine2=new Engine();
		aggreCar car2 =new aggreCar(engine2);
		
		Engine engine3=new Engine();
		aggreCar car3 =new aggreCar(engine3);
		
		car1.start();
		car2.start();
		car3.start();
	}

}
