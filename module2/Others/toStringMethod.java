package Others;


class Thura{
	@Override
	public String toString() {
		return "Thura";
	}
	
}
//lat shi class ka obj ko to String (Hash code) ko chg pay
//obj ko class ka extend lote htr loe backend mhr
public class toStringMethod {
	/**
	 * 
	 * 
	 * return pyan tl
	 */
	@Override
	public String toString() {
		return "toStringMethod [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new toStringMethod());
		System.out.println(new Thura());
		//parameter 1 ku ka obj ko taung tr e tr ko mha changing lote tr

	}



}
