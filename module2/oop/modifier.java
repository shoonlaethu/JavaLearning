package oop;

public class modifier {
	public int a=7;
	//a so tr ko a chr folder htel ka class file ka yu thone loe ya public keyword moe
	int f = 8;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//two types of modifier
		//access,non_access
		
		
		//1access=>public private default protected
		//class ,artributes,method,constructure
		//public ka sout lite tat file yae name ta ku htel pl pay loe ya
		//e file ko a char new class built yin pay lo ma ya public 
		//public so lu tine kyi loe ya mhr
		
		//2 non access =>static final
		
		ModifierA obj=new ModifierA();
		System.out.println(obj.a);
		//public moe a chr folder below ka file tay a kone khaw thone
		System.out.println(obj.b);
		//protected ka -file folder ta khu htel shi yin ya tl but a chr folder so ma ya buu
		//friend fb  nae eg
        //System.out.println(obj.c);
		//private moe lo khaw thone loe ma ya buu thu ko build htar tae class htel ka lwel loe
		
		
			
		
		
		//1access ==>public(luu tine yuu loe ya),private,default,protected
		//2non_access==>final,abstract,static
		
		
		

	}

}
class ModifierA{
	public int a=7;
	protected int b=8;
	private int c=9;
	int d=3;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//two types of modifier
		//access,non_access
		
		
		//1access=>public private default protected
		//class ,artributes,method,constructure
		//public ka sout lite tat file yae name ta ku htel pl pay loe ya
		//e file ko a char new class built yin pay lo ma ya public 
		//public so lu tine kyi loe ya mhr
		
		//2 non access =>static final
		
		ModifierA obj=new ModifierA();
		System.out.println(obj.c);
		//private ka thu ko possess pyit tat class ka pl khaw thone loe ya
			
		
		
		//1access ==>public(luu tine yuu loe ya),private,default,protected
		//2non_access==>final,abstract,static

	}
	
}
