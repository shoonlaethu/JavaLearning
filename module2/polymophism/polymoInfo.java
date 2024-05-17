package polymophism;

public class polymoInfo {
	//overloading
	//same method with different parameter and type
//	static void calculate(int number1,int number2) {
//		System.out.println(number1+number2);
//	}
	static void calculate(int number) {
		System.out.println(number+number);
	}
	static void calculate(double num) {
		System.out.println(num+num);
	}
	
	//type promotion
	static void calculate(int num1,double num2) {
		System.out.println(num1+num2);
	}
	static void calculate(double num1,int num2) {
		System.out.println(num1+num2);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		method overloading
//		method overriding
		//eg lote ya mae work tu pay mae lote poin lote method ma tuu tr
		//eg advertising cosmatic food drink sa tha pyint
		
        //calculate(50,70);//error type //type promotion ==>type a ngal ka nay a kyi youte tr
		//type ambigurity ==>data type matu tat hr ko point out lote tr mhr yin
		calculate(50);
		calculate(1.2);
		calculate(1,2.0);
		calculate(2.0,1);

	}

}
