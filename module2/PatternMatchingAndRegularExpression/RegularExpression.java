package PatternMatchingAndRegularExpression;

public class RegularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String originalText="Original";
		String modifiedText;
		modifiedText=originalText.replaceAll("[aeiou]", "@");
		System.out.println(modifiedText);
		
		String originalText2="this programming is OOP";
		String modifiedText2;
		modifiedText2=originalText2.replaceAll("OOP", "object oriented language");
		System.out.println(modifiedText2);
		
		String originalText3="this programming is oooooooooooP";
		String modifiedText3;
		modifiedText3=originalText3.replaceAll("o{2,}", "oo");
		System.out.println(modifiedText3);
		
		String originalText4="attempt";
		String modifiedText4;
		modifiedText4=originalText4.replaceAll("temp", "temporary");
		System.out.println(modifiedText4);

		String originalText5="atempt";
		String modifiedText5;
		modifiedText5=originalText5.replaceAll("\\Stemp\\S", "temporary");
		System.out.println(modifiedText5);
		
		
		
		//same
		String originalText6="1 2 4";
		String modifiedText6;
		modifiedText6=originalText6.replaceAll("[0-9]", "one to ten");
		System.out.println(modifiedText6);
		
		String originalText7="1 2 4";
		String modifiedText7;
		modifiedText7=originalText7.replaceAll("\\d", "one to ten");
		System.out.println(modifiedText7);
		
		
		
		
		String phoneNo="234-25-3543";
		String modifiedPhoneNo;
		modifiedPhoneNo=phoneNo.replaceAll("[0-9]{3}-[1-9]{2}-[0-9]{4}","xxx-xx-xxxx");
		System.out.println(modifiedPhoneNo);
		
		
		
		
		

	}

}
