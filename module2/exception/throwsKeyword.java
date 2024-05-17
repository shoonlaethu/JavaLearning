package exception;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InvalidClassException;
import java.nio.file.FileAlreadyExistsException;

public class throwsKeyword {
	static void except() throws FileNotFoundException,InvalidClassException,FileAlreadyExistsException{
		throw new NullPointerException();
	}
	static void except2() throws IOException,{
		throw new NullPointerException();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//except();//error io exception sit tr ko nullpointerexception pyit nay loe
		//try catch nae pyin mha program ka run loe ya ml
		
		
		//throws so tr ka method 1 khu ko khine lite tat a chain mhr e d method ka exception pyit nai pr tl so tae a kyoung ko pyaw tr kyo tin p
	
        
		try {
			except();			
		}catch (IOException e1){			
			throw new RuntimeException();		
					
		}
		
		
		try {
			except2();			
		}catch (FileNotFoundException e1){			
			throw new RuntimeException();		
					
		}catch(InvalidClassException e1) {
			throw new RuntimeException();	
			
		}catch(FileAlreadyExistsException e1) {
			throw new RuntimeException();	
		}
	}

}
